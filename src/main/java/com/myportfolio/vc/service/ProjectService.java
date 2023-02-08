
package com.myportfolio.vc.service;

import com.myportfolio.vc.model.Project;
import com.myportfolio.vc.repository.ProjectRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProjectService implements IProjectService{
    
    @Autowired
    public ProjectRepository projRepo;

    @Override
    public List<Project> readProject() {
        return projRepo.findAll(); 
    }

    @Override
    public void deleteProject(Long id) {
        projRepo.deleteById(id);
    }

    @Override
    public void updateProject(Project proj) {
        projRepo.save(proj);
    }
    
    @Override
    public void createProject(Project proj) {
        projRepo.save(proj);
    }

    @Override
    public Project findProject(Long id) {
        return projRepo.findById(id).orElse( null);
    }

}
