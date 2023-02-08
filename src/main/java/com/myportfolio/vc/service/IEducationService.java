
package com.myportfolio.vc.service;

import com.myportfolio.vc.model.Education;
import java.util.List;


public interface IEducationService {
    
    public List<Education> readEducation();
    public void deleteEducation (Long id);
    public void createEducation(Education edu);
    public void updateEducation(Education edu);
    public Education findEducation (Long id);
    
}
