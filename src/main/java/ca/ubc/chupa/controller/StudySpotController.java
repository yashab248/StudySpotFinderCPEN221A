
package ca.ubc.chupa.controller;

import ca.ubc.chupa.model.SearchCriteria;
import ca.ubc.chupa.model.StudySpotFilter;
import ca.ubc.chupa.view.StudySpotView;

/**
 * Coordinates user interactions, study-space data,
 * filtering, and view updates.
 *
 * This controller resides on the client.
 */
public final class StudySpotController {

    /**
     * Creates a controller with its required dependencies.
     *
     * Pre:
     * - api != null.
     * - filter != null.
     * - view != null.
     *
     * Post:
     * - The controller is associated with the provided
     *   API client, filter, and view.
     */
    public StudySpotController(
            StudySpotApiClient api,
            StudySpotFilter filter,
            StudySpotView view) {

        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Retrieves study-space data from the server.
     *
     * Pre: none.
     *
     * Post:
     * - Requests the study-space catalog from the API.
     * - If successful, caches the retrieved catalog.
     * - Updates the view with the matching study spaces.
     * - If no spaces match, displays the no-results state.
     * - If retrieval fails, displays a connection error.
     */
    public void onRefresh() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Updates displayed results using search criteria.
     *
     * Pre:
     * - criteria != null.
     * - A study-space catalog has been loaded.
     *
     * Post:
     * - Filters the cached catalog using StudySpotFilter.
     * - Displays matching spaces through StudySpotView.
     * - Displays the no-results state if no spaces match.
     * - Does not modify the cached catalog.
     */
    public void onSearchChanged(SearchCriteria criteria) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Handles selection of an individual study space.
     *
     * Pre:
     * - id != null and is not blank.
     *
     * Post:
     * - If the ID identifies an available study space,
     *   displays its details through StudySpotView.
     * - Otherwise, displays an appropriate error message.
     */
    public void onSpaceSelected(String id) {
        throw new UnsupportedOperationException("TODO");
    }
}
