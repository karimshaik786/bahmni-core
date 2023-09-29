package org.bahmni.module.bahmnicore.events;

import org.openmrs.api.context.UserContext;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class BahmniEvent {

    private static final long version = 1L;
    public UserContext userContext;
    public String eventId;
    public BahmniEventType eventType;
    public String payloadId;
    public LocalDateTime publishedDateTime;

    public UserContext getUserContext() {
        return userContext;
    }
    public String getEventId() {
        return eventId;
    }
    public BahmniEventType getEventType() {
        return eventType;
    }
    public String getPayloadId() {
        return payloadId;
    }

    public LocalDateTime getPublishedDateTime() {
        return publishedDateTime;
    }
}

