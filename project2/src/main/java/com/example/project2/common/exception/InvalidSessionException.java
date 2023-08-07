package com.example.project2.common.exception;

public class InvalidSessionException extends RuntimeException {
    
    public InvalidSessionException(String message){
        super(message);
    }

    public InvalidSessionException(){
        super("잘못된 요청입니다.");
    } 
    
}
