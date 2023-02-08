
package com.myportfolio.vc.service;

import com.myportfolio.vc.model.Education;
import com.myportfolio.vc.repository.EducationRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducationService implements IEducationService {
    
    @Autowired
    public EducationRepository educRepo;

    @Override
    public List<Education> readEducation() {
        return educRepo.findAll(); 
    }

    @Override
    public void deleteEducation(Long id) {
        educRepo.deleteById(id);
    }

    @Override
    public void updateEducation(Education edu) {
        educRepo.save(edu);
    }
    
    @Override
    public void createEducation(Education edu) {
        educRepo.save(edu);
    }

    @Override
    public Education findEducation(Long id) {
        return educRepo.findById(id).orElse( null);
    }
    
}

    

