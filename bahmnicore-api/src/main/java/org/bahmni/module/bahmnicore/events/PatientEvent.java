package org.bahmni.module.bahmnicore.events;

import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class PatientEvent extends BahmniEvent {

    private Patient patient;

    public void createPatientEvent(BahmniEventType eventType, Patient patient) {
        this.eventType = eventType;
        this.patient = patient;
        this.eventId = UUID.randomUUID().toString();
        this.payloadId = patient.getUuid();
        this.publishedDateTime = LocalDateTime.now();
        this.userContext= Context.getUserContext();
    }

    public Patient getPatient() {
        return patient;
    }
}

