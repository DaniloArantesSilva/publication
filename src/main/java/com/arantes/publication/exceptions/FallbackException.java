package com.arantes.publication.exceptions;

public class FallbackException extends RuntimeException {

    public FallbackException(Throwable cause) {
        super("Estamos com indisponibilidade no momento, por favor tente novamente mais tarde.", cause);
    }

}
