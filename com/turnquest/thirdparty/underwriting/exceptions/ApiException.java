// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.exceptions;

import org.springframework.http.HttpStatus;

public class ApiException extends RuntimeException
{
    HttpStatus httpStatus;
    String debugMessage;
    String message;
    
    public ApiException(final String message) {
        this.httpStatus = HttpStatus.BAD_REQUEST;
        this.message = message;
        this.debugMessage = message;
    }
    
    public ApiException(final String message, final String debugMessage) {
        this.httpStatus = HttpStatus.BAD_REQUEST;
        this.debugMessage = debugMessage;
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return this.debugMessage;
    }
    
    @Override
    public String getLocalizedMessage() {
        return this.message;
    }
}
