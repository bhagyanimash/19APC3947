package com.example.stringmanipulationservice;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;


@WebService(
        serviceName = "StringManipulationService",
        portName = "StringManipulationServicePort",
        targetNamespace = "http://stringmanipulation.example.com/"
)
public class StringManipulationServiceImpl implements StringManipulationService {
    @Override
    public String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public int countCharacters(String text) {
        return text.length();
    }
}
