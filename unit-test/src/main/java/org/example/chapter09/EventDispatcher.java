package org.example.chapter09;

import java.util.List;

public class EventDispatcher {
    private IMessageBus _messageBus;
    private IDomainLogger _domainLogger;

    public EventDispatcher(IMessageBus _messageBus, IDomainLogger _domainLogger) {
        this._messageBus = _messageBus;
        this._domainLogger = _domainLogger;
    }

    public void dispatch(List<IDomainEvent> events) {


    }
}
