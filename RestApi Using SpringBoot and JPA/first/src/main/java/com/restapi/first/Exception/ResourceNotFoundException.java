package com.restapi.first.Exception;

public class ResourceNotFoundException extends Exception{

    public ResourceNotFoundException(String s) {
        super();
        System.out.println(s);
    }
}
