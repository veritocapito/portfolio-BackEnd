
package com.myportfolio.vc.service;

import com.myportfolio.vc.model.Experience;
import com.myportfolio.vc.repository.ExperienceRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienceService implements IExperienceService{
    @Autowired
    public ExperienceRepository expeRepo;

    @Override
    public List<Experience> readExperience() {
        return expeRepo.findAll(); 
    }

    @Override
    public void deleteExperience(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public void updateExperience(Experience expe) {
        expeRepo.save(expe);
    }
    
    @Override
    public void createExperience(Experience expe) {
        expeRepo.save(expe);
    }

    @Override
    public Experience findExperience(Long id) {
        return expeRepo.findById(id).orElse( null);
    }

}
