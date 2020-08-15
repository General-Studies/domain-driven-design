package com.jetherrodrigues.ticket.domain.exceptions.messages;

public enum DomainExceptionMessages {
    CLIENT_NOT_FOUND("The client %s was not found");

    private final String message;

    DomainExceptionMessages(final String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
