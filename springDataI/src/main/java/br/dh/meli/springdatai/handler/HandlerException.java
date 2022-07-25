package br.dh.meli.springdatai.handler;

import br.dh.meli.springdatai.exception.BadRequestException;
import br.dh.meli.springdatai.exception.ExceptionDetails;
import br.dh.meli.springdatai.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class HandlerException {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ExceptionDetails> handlerUserNotFound(UserNotFoundException e){
        return new ResponseEntity<>(ExceptionDetails.builder()
                .title(e.getMessage())
                .fields("id")
                .fieldsMessages("id nao encontrado")
                .timestamp(LocalDateTime.now())
                .build(),
                HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ExceptionDetails> handerBadRequest(BadRequestException e){
        return new ResponseEntity<>(ExceptionDetails.builder()
                .title(e.getMessage())
                .timestamp(LocalDateTime.now())
                .build(),
                HttpStatus.BAD_REQUEST);

    }
}
