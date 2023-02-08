
package com.myportfolio.vc.service;

import com.myportfolio.vc.model.Experience;
import java.util.List;


public interface IExperienceService {
    
    public List<Experience> readExperience();
    public void deleteExperience (Long id);
    public void createExperience (Experience expe);
    public void updateExperience (Experience expe);
    public Experience findExperience (Long id);

}

