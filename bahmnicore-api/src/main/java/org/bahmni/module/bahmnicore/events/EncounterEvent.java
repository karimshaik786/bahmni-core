package org.bahmni.module.bahmnicore.events;

import org.openmrs.Encounter;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class EncounterEvent extends BahmniEvent {

    private Encounter encounter;

    public void createEncounterEvent(BahmniEventType eventType, Encounter encounter) {
        this.eventType = eventType;
        this.encounter = encounter;
        this.eventId = UUID.randomUUID().toString();
        this.payloadId = encounter.getUuid();
        this.publishedDateTime = LocalDateTime.now();
        this.userContext= Context.getUserContext();
    }

    public Encounter getEncounter() {
        return encounter;
    }
}

