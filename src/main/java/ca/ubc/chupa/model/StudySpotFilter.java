package ca.ubc.chupa.model;
import java.util.List;

/**
 * Filters study spaces according to user preferences.
 *
 * This component resides on the client.
 */
public final class StudySpotFilter {

    /**
     * Returns study spaces matching the given criteria.
     *
     * Pre:
     * - spots != null.
     * - criteria != null.
     * - spots contains no null elements.
     *
     * Post:
     * - Returns a list containing only matching study spaces.
     * - Search matches name or building, ignoring case.
     * - Empty or whitespace-only queries match all names.
     * - All enabled filters must be satisfied.
     * - Results preserve their original ordering.
     * - The input list and objects are not modified.
     *
     * @param spots available study spaces
     * @param criteria active search and filter preferences
     * @return list of matching study spaces
     */
    public List<StudySpot> filter(
            List<StudySpot> spots,
            SearchCriteria criteria) {

        throw new UnsupportedOperationException("TODO");
    }
}