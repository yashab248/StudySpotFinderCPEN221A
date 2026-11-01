package ca.ubc.chupa.view;

import ca.ubc.chupa.model.StudySpot;
import java.util.List;

/** Contract for a client-side graphical study-space view. */
public interface StudySpotView {
    /** Pre: results nonnull. Post: visible list reflects results. */
    void showResults(List<StudySpot> results);
    /** Pre: spot nonnull. Post: visible details reflect all spot fields. */
    void showDetails(StudySpot spot);
    /** Pre: message nonblank. Post: error is visible to user. */
    void showError(String message);
    /** Pre: none. Post: no-results state is visible. */
    void showNoMatches();
}
