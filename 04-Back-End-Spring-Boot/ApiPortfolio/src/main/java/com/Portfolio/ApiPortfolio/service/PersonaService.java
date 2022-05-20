package com.Portfolio.ApiPortfolio.service;

import com.Portfolio.ApiPortfolio.exception.PersonaNotFoundException;
import com.Portfolio.ApiPortfolio.model.Persona;
import com.Portfolio.ApiPortfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService {
    
    private final PersonaRepository personaRepo;
    
    @Autowired
    public PersonaService(PersonaRepository personaRepo) {
        this.personaRepo = personaRepo;
    }
    
    public Persona addPersona(Persona persona){
        return personaRepo.save(persona);
    }
    
    public List<Persona> findPersona(){
      return personaRepo.findAll();
    }
    
    public Persona editPersona(Persona person){
        return personaRepo.save(person);
    }
    
    public void deletePersona(Long idPersona){
        personaRepo.deleteById(idPersona);
    }
    
    public Persona getIdPersona(Long idPersona){
        return personaRepo.findById(idPersona).orElseThrow(() -> new PersonaNotFoundException("Persona No Encontrada"));
    }
    
}
