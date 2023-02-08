
package com.myportfolio.vc.service;

import com.myportfolio.vc.model.Skill;
import java.util.List;


public interface ISkillService {
    
    public List<Skill> readSkill();
    public void deleteSkill (Long id);
    public void createSkill (Skill ski);
    public void updateSkill (Skill ski);
    public Skill findSkill (Long id);
}
