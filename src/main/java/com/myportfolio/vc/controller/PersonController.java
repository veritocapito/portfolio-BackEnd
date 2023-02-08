
package com.myportfolio.vc.controller;

import com.myportfolio.vc.model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.myportfolio.vc.service.IPersonService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/person") //http://localhost:8080/person
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {
    
    @Autowired
    private IPersonService persoServ;
    
    @PostMapping ("/create")
    public String createPerson (@RequestBody Person pers){
        persoServ.createPerson(pers);
        return "New person successfully added";
    }
       
    @GetMapping("/read")
    @ResponseBody
    public List<Person> readPerson(){
        return persoServ.readPerson();
    }
    
    @PutMapping ("/update")
    public String updatePerson (@RequestBody Person pers){
        persoServ.updatePerson(pers);
        return "Person successfully updated";
    }  
    
    @DeleteMapping ("/delete/{id}")
    public String deletePerson (@PathVariable Long id){
        persoServ.deletePerson(id);
        return "Person successfully deleted";
    }
    
    @GetMapping("/find/{id}")
    @ResponseBody
    public Person findPerson(@PathVariable Long id){
        return persoServ.findPerson(id);
    }
}
