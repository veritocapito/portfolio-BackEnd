
package com.myportfolio.vc.controller;

import com.myportfolio.vc.model.Skill;
import com.myportfolio.vc.service.ISkillService;
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
@RequestMapping("/skill") //http://localhost:8080/skill
@CrossOrigin(origins = "http://localhost:4200")
public class SkillController {
    
    @Autowired
    private ISkillService skillServ;
    
    @PostMapping ("/create")
    public String createSkill (@RequestBody Skill ski){
        skillServ.createSkill(ski);
        return "New skill successfully added";
    }
       
    @GetMapping("/read")
    @ResponseBody
    public List<Skill> readSkill(){
        return skillServ.readSkill();
    }
    
    @PutMapping ("/update")
    public String updateSkill (@RequestBody Skill ski){
        skillServ.updateSkill(ski);
        return "Skill successfully updated";
    }

    @DeleteMapping ("/delete/{id}")
    public String deleteSkill (@PathVariable Long id){
        skillServ.deleteSkill(id);
        return "Skill successfully deleted";
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Skill findSkill(@PathVariable Long id){
        return skillServ.findSkill(id);
    }
}