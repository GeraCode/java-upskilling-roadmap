package com.geracode.javaupskillingroadmap.dojochallenge.Utils;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class CodeException extends RuntimeException {
    public static final String EXCEPTION_MSG_FORMAT = "%s :: %s";

    /**
     * Constructor of BusinessException
     *
     * @param message is the String that receive the message
     */
    public CodeException(String message) {
        super(message);
        log.error(EXCEPTION_MSG_FORMAT, "Code Exception Info", message);
    }

    /**
     * Constructor of BusinessException
     *
     * @param message is the String that receive the message
     * @param cause is the exception that help to know about of error
     */
    public CodeException(String message, Throwable cause) {
        super(message, cause);
        log.error(String.format(EXCEPTION_MSG_FORMAT, "Code Exception Info", message), cause);
    }
}
