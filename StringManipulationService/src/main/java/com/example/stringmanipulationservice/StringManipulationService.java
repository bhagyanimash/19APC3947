package com.example.stringmanipulationservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface StringManipulationService {
    @WebMethod
    String reverseText(String text);

    @WebMethod
    int countCharacters(String text);
}
