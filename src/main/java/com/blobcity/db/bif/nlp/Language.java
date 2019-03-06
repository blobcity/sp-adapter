package db.bif.nlp;

public enum Language {
    ENGLISH ("en");

    private final String languageCode;

    Language(final String languageType) {
        this.languageCode = languageType;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }
}
