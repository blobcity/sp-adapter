package db.functions;

import org.json.JSONObject;

/**
 * Used to perform filter operations at database level, by writing filter conditions. A single filter can be used across
 * multiple database entities.
 *
 * @author Prikshit Kumar  <prikshit.kumar@blobcity.com>
 */
public interface Filterable {

    /**
     * Used to load conditions / criteria to be checked. This function does not actually check any value, but simply
     * loads the criteria used to carry out the checks.
     *
     * @param args An argument list of Object that forms the criteria
     */
    public void loadCriteria(Object... args);
    
    /**
     * A function that identifies the objects that match a criteria. This function may be called multiple times for a
     * single query by the database, and the calls may not be stateful. The DB will internally call this function by
     * paging the complete list of objects to be tested with each call getting one page, but different pages may go to
     * different instances of the object on different cluster nodes. The class must not depend on state information at
     * any time.
     *
     * @param object A list of database entities that are to be tested to match a criteria. These can be list of entity
     * objects or simply indexed values to be tested against a criteria
     * @return The sub list of objList that match the given criteria. Items that do not match the criteria must be
     * removed from the objList passed as parameter. If not object matches the function must return an empty list,
     * whereas if all items match the function must return the complete objList as is. Ordering of items does not have
     * to be ensured.
     */
    public boolean matches(JSONObject object);
}
