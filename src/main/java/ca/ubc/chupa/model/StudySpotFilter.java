package ca.ubc.chupa.model;

import java.util.List;

/** Pure in-memory filter service. */
public final class StudySpotFilter {
    /** Pre: spots and criteria nonnull and spots has no null elements.
     * Post: returns only records matching query (name or building, case-insensitive)
     * and ALL enabled flags, preserving input order; does not mutate spots. */
    public List<StudySpot> filter(List<StudySpot> spots, SearchCriteria criteria) {
        throw new UnsupportedOperationException("TODO");
    }
}
