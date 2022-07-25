package br.dh.meli.springdatai.exception;

import lombok.Builder;

import java.time.LocalDateTime;
@Builder
public class ExceptionDetails {
    private String title;
    private String message;
    private String fields;
    private String fieldsMessages;
    private LocalDateTime timestamp;
}
