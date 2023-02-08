
package com.myportfolio.vc.controller;

import com.myportfolio.vc.model.Education;
import com.myportfolio.vc.service.IEducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/education") // http://localhost:8080/education
@CrossOrigin(origins = "http://localhost:4200")
public class EducationController {
    
    @Autowired
    private IEducationService educServ;
    
    @PostMapping ("/create")
    public String createEducation (@RequestBody Education edu){
        educServ.createEducation(edu);
        return "New education successfully added";
    }
       
    @GetMapping("/read")
    @ResponseBody
    public List<Education> readEducation(){
        return educServ.readEducation();
    }
    
    @PutMapping ("/update")
    public String updateEducation (@RequestBody Education edu){
        educServ.updateEducation(edu);
        return "Education successfully updated";
    }
    
    @DeleteMapping ("/delete/{id}")
    public String deleteEducation (@PathVariable Long id){
        educServ.deleteEducation(id);
        return "Education successfully deleted";
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Education findEducation(@PathVariable Long id){
        return educServ.findEducation(id);
    }

}
