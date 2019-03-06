package com.blobcity.db.bif.nlp;

import java.util.List;

public interface NLP {

    public Language detectLanguage(String s);

    public List<String> getSentences(Language language, String s);

    public List<String> getSentences(String s);

    public List<String> tokenize(Language language, String s);

    public List<String> tokenize(String s);

    public List<String> extractNames(Language language, String s);

    public List<String> extractNames(String s);

    public String markNames(Language language, String s);

    public String markNames(String s);

    public List<String> extractOrgNames(Language language, String s);

    public List<String> extractOrgNames(String s);

    public String markOrgNames(Language language, String s);

    public String markOrgNames(String s);

    public List<String> extractDates(Language language, String s);

    public List<String> extractDates(String s);

    public String markDates(Language language, String s);

    public String markDates(String s);

    public List<String> extractTimes(Language language, String s);

    public List<String> extractTimes(String s);

    public String markTimes(Language language, String s);

    public String markTimes(String s);
}
