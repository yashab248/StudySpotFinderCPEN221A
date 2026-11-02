package ca.ubc.chupa.model;

import java.time.DayOfWeek;
import java.util.Map;

/** Immutable description of a study space. */
public final class StudySpot {
    public enum Crowding { LOW, MODERATE, HIGH, UNKNOWN }
    /** Pre: id/name/building nonblank; hours has all seven weekdays; crowding nonnull;
     * timestamp ISO-8601 iff crowding is known. Post: object contains these values. */
    public StudySpot(String id, String name, String building, boolean individualStudy,
            boolean groupStudy, boolean chargingOutlets, boolean accessibleEntry,
            Crowding crowding, String crowdingTimestamp, Map<DayOfWeek, DailyHours> weeklyHours) {
        throw new UnsupportedOperationException("TODO");
    }
    /** Pre: none. Post: returns the unique ID. */
    public String getId() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns display name. */
    public String getName() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns building name. */
    public String getBuilding() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns whether individual study is supported. */
    public boolean supportsIndividualStudy() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns whether group study is supported. */
    public boolean supportsGroupStudy() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns whether outlets are available. */
    public boolean hasChargingOutlets() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns whether accessible entry is documented. */
    public boolean hasAccessibleEntry() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns crowding classification. */
    public Crowding getCrowding() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns ISO-8601 crowding timestamp, or null if unknown. */
    public String getCrowdingTimestamp() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns an unmodifiable seven-day map of hours. */
    public Map<DayOfWeek, DailyHours> getWeeklyHours() { throw new UnsupportedOperationException("TODO"); }
}
