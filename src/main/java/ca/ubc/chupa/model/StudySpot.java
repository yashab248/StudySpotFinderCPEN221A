package ca.ubc.chupa.model;

import java.time.DayOfWeek;
import java.util.Map;

/**
 * Represents a single UBC study space.
 *
 * This model is shared between the client and server.
 */
public final class StudySpot {

    /**
     * Recorded crowding category.
     * UNKNOWN indicates unavailable crowding information.
     */
    public enum Crowding {
        LOW,
        MODERATE,
        HIGH,
        UNKNOWN
    }

    /**
     * Creates a study space.
     *
     * Pre:
     * - id, name, and building are nonnull and nonblank.
     * - crowding != null.
     * - weeklyHours != null.
     * - weeklyHours contains all seven days of the week.
     * - Every day maps to a nonnull DailyHours object.
     *
     * Post:
     * - Stores the specified study-space information.
     * - Weekly opening hours are stored independently
     *   of the caller's map.
     */
    public StudySpot(String id,
            String name,
            String building,
            boolean individualStudy,
            boolean groupStudy,
            boolean chargingOutlets,
            Crowding crowding,
            Map<DayOfWeek, DailyHours> weeklyHours) {

        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Pre: none.
     * Post: Returns this study space's unique identifier.
     */
    public String getId() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Pre: none.
     * Post: Returns the study space's display name.
     */
    public String getName() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Pre: none.
     * Post: Returns the building containing the study space.
     */
    public String getBuilding() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Pre: none.
     * Post: Returns whether individual study is supported.
     */
    public boolean supportsIndividualStudy() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Pre: none.
     * Post: Returns whether group study is supported.
     */
    public boolean supportsGroupStudy() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Pre: none.
     * Post: Returns whether charging outlets are available.
     */
    public boolean hasChargingOutlets() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Pre: none.
     * Post: Returns the recorded crowding category.
     */
    public Crowding getCrowding() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Pre: none.
     * Post: Returns an unmodifiable map containing the
     * opening hours for all seven days of the week.
     */
    public Map<DayOfWeek, DailyHours> getWeeklyHours() {
        throw new UnsupportedOperationException("TODO");
    }
}
