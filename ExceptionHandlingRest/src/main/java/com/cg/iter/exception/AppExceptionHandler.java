package com.cg.iter.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//This class is NOT a controller, but an Assistant to ALL controller within Application
@ControllerAdvice 
public class AppExceptionHandler {

  /** 
  * Capture all Exceptions of type ApplicationException,
  * and return a new HttpResponse
  */
  @ExceptionHandler({ApplicationException.class})
  public ResponseEntity<String> handleError(ApplicationException exception){
      System.out.println("Exception handled");
      return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
  }
}