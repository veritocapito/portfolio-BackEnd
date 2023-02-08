
package com.myportfolio.vc.service;

import com.myportfolio.vc.model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myportfolio.vc.repository.PersonRepository;
import javax.transaction.Transactional;

@Service
@Transactional
public class PersonService implements IPersonService{
    
    @Autowired
    public PersonRepository persoRepo;

    @Override
    public List<Person> readPerson() {
        return persoRepo.findAll(); 
    }

    @Override
    public void deletePerson(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public void updatePerson(Person per) {
        persoRepo.save(per);
    }
    
    @Override
    public void createPerson(Person per) {
        persoRepo.save(per);
    }

    @Override
    public Person findPerson(Long id) {
        //acá si no encuentro la persona, devuelvo null, por eso va el orElse
        return persoRepo.findById(id).orElse( null);
    }
    
}
