package com.blobcity.db.sp.functions.nlp;

/**
 * Created by Sanket Sarang
 */
public enum Language {
    ENGLISH("en"),
    NAN("nan");

    private final String languageCode;

    Language(final String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public Language fromLanguageCode(final String languageCode) {
        for(Language language : Language.values()) {
            if(language.languageCode.equalsIgnoreCase(languageCode)) {
                return language;
            }
        }

        return NAN;
    }
}
