
package com.myportfolio.vc.service;

import com.myportfolio.vc.model.Project;
import java.util.List;


public interface IProjectService {
    
    public List<Project> readProject();
    public void deleteProject (Long id);
    public void createProject (Project proj);
    public void updateProject (Project proj);
    public Project findProject (Long id);

}
