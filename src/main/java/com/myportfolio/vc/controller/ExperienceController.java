
package com.myportfolio.vc.controller;

import com.myportfolio.vc.model.Experience;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.myportfolio.vc.service.IExperienceService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/experience") //http://localhost:8080/experience
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienceController {
    
    @Autowired
    private IExperienceService expeServ;
    
    @PostMapping ("/create")
    public String createExperience (@RequestBody Experience expe){
        expeServ.createExperience(expe);
        return "New experience successfully added";
    }
       
    @GetMapping("/read")
    @ResponseBody
    public List<Experience> readExperience(){
        return expeServ.readExperience();
    }

    @PutMapping ("/update")
    public String updateExperience (@RequestBody Experience expe){
        expeServ.updateExperience(expe);
        return "Experience successfully updated";
    }
    
    @DeleteMapping ("/delete/{id}")
    public String deleteExperience (@PathVariable Long id){
        expeServ.deleteExperience(id);
        return "Experience successfully deleted";
    }
    
    @GetMapping("/find/{id}")
    @ResponseBody
    public Experience findExperience(@PathVariable Long id){
        return expeServ.findExperience(id);
    }

}

