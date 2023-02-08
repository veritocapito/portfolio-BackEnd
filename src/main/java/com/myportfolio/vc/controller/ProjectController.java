
package com.myportfolio.vc.controller;

import com.myportfolio.vc.model.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.myportfolio.vc.service.IProjectService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/project") //http://localhost:8080/project
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController {
    
    @Autowired
    private IProjectService projServ;
    
    @PostMapping ("/create")
    public String createProject (@RequestBody Project pro){
        projServ.createProject(pro);
        return "New project successfully added";
    }
       
    @GetMapping("/read")
    @ResponseBody
    public List<Project> readProject(){
        return projServ.readProject();
    }
    
    @PutMapping ("/update")
    public String updateProject (@RequestBody Project pro){
        projServ.updateProject(pro);
        return "Project successfully updated";
    }
    
    @DeleteMapping ("/delete/{id}")
    public String deleteProject (@PathVariable Long id){
        projServ.deleteProject(id);
        return "Project successfully deleted";
    }
    
    @GetMapping("/find/{id}")
    @ResponseBody
    public Project findProject(@PathVariable Long id){
        return projServ.findProject(id);
    }
}

