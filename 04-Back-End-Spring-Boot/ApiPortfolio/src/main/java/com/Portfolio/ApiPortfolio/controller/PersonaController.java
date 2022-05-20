package com.Portfolio.ApiPortfolio.controller;

import com.Portfolio.ApiPortfolio.model.Persona;
import com.Portfolio.ApiPortfolio.service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    
    private final PersonaService personaService;
    
    public PersonaController(PersonaService personaService){
        this.personaService = personaService;
    }
    
    @GetMapping("/idPersona/{idPersona}")
    public ResponseEntity<Persona> getpersona(@PathVariable("idPersona") Long idPersona) {
        Persona person = personaService.getIdPersona(idPersona);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }
    
    @PutMapping("/edit/{idPersona}")
    public ResponseEntity<Persona> editPersona(@PathVariable Long idPersona,
                                                @RequestParam ("namePersona") String newNamePersona,
                                                @RequestParam ("titlePersona") String newTitlePersona,
                                                @RequestParam ("imgbannerPersona") String newImgbannerPersona,
                                                @RequestParam ("imgprofilePersona") String newImgprofilePersona,
                                                @RequestParam ("text01Persona") String newText01Persona,
                                                @RequestParam ("text02Persona") String newText02Persona,
                                                @RequestParam ("text03Persona") String newText03Persona) {
        
        Persona editPersona = personaService.getIdPersona(idPersona);
        
        editPersona.setNamePersona(newNamePersona);
        editPersona.setTitlePersona(newTitlePersona);
        editPersona.setImgbannerPersona(newImgbannerPersona);
        editPersona.setImgprofilePersona(newImgprofilePersona);
        editPersona.setText01Persona(newText01Persona);
        editPersona.setText02Persona(newText02Persona);
        editPersona.setText03Persona(newText03Persona);
        
        personaService.addPersona(editPersona);
        return new ResponseEntity<>(editPersona, HttpStatus.OK);
    }
    
}
