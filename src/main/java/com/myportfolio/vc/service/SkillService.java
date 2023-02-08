
package com.myportfolio.vc.service;

import com.myportfolio.vc.model.Skill;
import com.myportfolio.vc.repository.SkillRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillService implements ISkillService{
    @Autowired
    public SkillRepository skillRepo;

    @Override
    public List<Skill> readSkill() {
        return skillRepo.findAll(); 
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public void updateSkill(Skill ski) {
        skillRepo.save(ski);
    }
    
    @Override
    public void createSkill(Skill ski) {
        skillRepo.save(ski);
    }

    @Override
    public Skill findSkill(Long id) {
        return skillRepo.findById(id).orElse( null);
    }

}
