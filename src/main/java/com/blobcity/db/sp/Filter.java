package com.blobcity.db.sp;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by sanketsarang on 01/05/17.
 */
public interface Filter {

    /**
     * Optionally used to load a dynamic search criteria for the filter
     * @param critria the criteria as a list of Objects.
     */
    public void loadCriteria(List<Object> critria);

    /**
     * Should return if the passed records match the filter criteria. The size of the response list should be same
     * as the size of the input list for the filter execution to succeed. In sequential order the boolean value of
     * {@code true} returned in the corresponding position in the return list will indicate that the corresponding
     * record matches the filter criteria. A value of {@code false} will indicate that the specific record does not
     * match the filter criteria.
     * @param records the records to be mached against the filter condition
     * @return sequential list of boolean values, which a value of {@code true} indicating that a record at the
     * corresponding position matches the filter criteria.
     */
    public List<Boolean> filter(List<JSONObject> records);
}
