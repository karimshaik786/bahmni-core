package org.bahmni.module.bahmnicore.web.v1_0;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.openmrs.util.LocaleUtility;

import java.util.Locale;

public class LocaleResolverTest {

    @Test
    public void shouldReturnDefaultLocaleIfNull() {
        LocaleResolver resolver = new LocaleResolver();
        Locale locale = resolver.identifyLocale(null);
        assertEquals(LocaleUtility.getDefaultLocale(), locale);
    }

    @Test
    public void shouldReturnDefaultLocaleIfEmpty() {
        LocaleResolver resolver = new LocaleResolver();
        Locale locale = resolver.identifyLocale("");
        assertEquals(LocaleUtility.getDefaultLocale(), locale);
    }

    @Test
    public void shouldReturnParsedLocaleIfValid() {
        LocaleResolver resolver = new LocaleResolver();
        Locale locale = resolver.identifyLocale("en_US");
        assertEquals(new Locale("en", "US"), locale);
    }

    @Test(expected = AssertionError.class)
    public void shouldThrowExceptionIfInvalidLocale() {
        LocaleResolver resolver = new LocaleResolver();
        resolver.identifyLocale("invalid");
        fail("Should have thrown exception");
    }

}