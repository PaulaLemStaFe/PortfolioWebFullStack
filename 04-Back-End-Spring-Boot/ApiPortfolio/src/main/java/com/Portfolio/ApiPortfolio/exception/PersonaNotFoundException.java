package com.Portfolio.ApiPortfolio.exception;

public class PersonaNotFoundException extends RuntimeException {
    
    public PersonaNotFoundException(String message){
        super(message);
    }
}
