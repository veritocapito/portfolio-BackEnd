
package com.myportfolio.vc.service;

import com.myportfolio.vc.model.Person;
import java.util.List;


public interface IPersonService {
    
    public List<Person> readPerson();
    public void deletePerson (Long id);
    public void createPerson (Person per);
    public void updatePerson (Person per);
    public Person findPerson (Long id);
    
}
