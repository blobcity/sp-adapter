package com.blobcity.db.sp.functions.nlp;

import java.util.List;

/**
 * Created by Sanket Sarang
 */
public interface NLP {

    public Language detectLanguage(String text);

    public List<String> getSentences(Language language, String text);

    public List<String> getSentences(String text);

    public List<String> tokenize(Language language, String text);

    public List<String> tokenize(String text);

    public List<String> extractNames(Language language, String text);

    public List<String> extractNames(String text);

    public List<String> extratNames(Language language, List<String> tokens);

    public String markNames(Language language, String text);

    public String markNames(String text);

    public List<String> markNames(Language language, List<String> tokens);

    public List<String> extractOrgNames(Language language, String text);

    public List<String> extractOrgNames(String text);

    public List<String> extractOrgNames(Language language, List<String> tokens);

    public String markOrgNames(Language language, String text);

    public String markOrgNames(String text);

    public List<String> markOrgNames(Language language, List<String> tokens);

    public List<String> extractDates(Language language, String text);

    public List<String> extractDates(String text);

    public List<String> extractDates(Language language, List<String> tokens);

    public String markDates(Language language, String text);

    public String markDates(String text);

    public List<String> markDates(Language language, List<String> tokens);

    public List<String> extractTimes(Language language, String text);

    public List<String> extractTimes(String text);

    public List<String> extractTimes(Language language, List<String> text);

    public String markTimes(Language language, String text);

    public String markTimes(String text);

    public List<String> markTimes(Language language, List<String> tokens);

    public String detokenize(List<String> tokens);
}
