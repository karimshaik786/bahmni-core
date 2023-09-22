package org.openmrs.module.bahmniemrapi.allergy.contract;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AllergenRequest {
    private String allergenKind;
    private String codedAllergen;
    private String nonCodedAllergen;

    public AllergenRequest(String allergenKind, String codedAllergen, String nonCodedAllergen) {
        this.allergenKind = allergenKind;
        this.codedAllergen = codedAllergen;
        this.nonCodedAllergen = nonCodedAllergen;
    }

    public String getAllergenKind() {
        return allergenKind;
    }

    public void setAllergenKind(String allergenKind) {
        this.allergenKind = allergenKind;
    }

    public String getCodedAllergen() {
        return codedAllergen;
    }

    public void setCodedAllergen(String codedAllergen) {
        this.codedAllergen = codedAllergen;
    }

    public String getNonCodedAllergen() {
        return nonCodedAllergen;
    }

    public void setNonCodedAllergen(String nonCodedAllergen) {
        this.nonCodedAllergen = nonCodedAllergen;
    }
}
