
package ca.ubc.chupa.view;

import ca.ubc.chupa.model.StudySpot;
import java.util.List;

/**
 * Defines the user interface for displaying study spaces.
 *
 * This component resides on the client.
 *
 * A concrete Swing implementation will provide
 * the actual graphical interface.
 */
public interface StudySpotView {

    /**
     * Displays the available study-space results.
     *
     * Pre:
     * - results != null.
     * - results contains no null elements.
     *
     * Post:
     * - The visible results list contains the provided spaces.
     * - Each result displays its name and building.
     */
    void showResults(List<StudySpot> results);

    /**
     * Displays detailed information about a selected space.
     *
     * Pre: spot != null.
     *
     * Post: The interface displays the selected space's
     * name, building, study modes, charging outlets,
     * weekly opening hours, and recorded crowding.
     *
     * If crowding is UNKNOWN, the interface displays
     * "Crowding information unavailable".
     */
    void showDetails(StudySpot spot);

    /**
     * Displays an error message.
     *
     * Pre: message is nonnull and nonblank.
     *
     * Post: The provided error message is visible.
     */
    void showError(String message);

    /**
     * Displays the no-results message.
     *
     * Pre: none.
     *
     * Post: The interface displays
     * "No study spaces match your search."
     */
    void showNoMatches();
}
