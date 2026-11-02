package ca.ubc.chupa.controller;

import ca.ubc.chupa.model.SearchCriteria;
import ca.ubc.chupa.model.StudySpotFilter;
import ca.ubc.chupa.view.StudySpotView;

/** Coordinates client events, cached data, filters and view updates. */
public final class StudySpotController {
    /** Pre: api, filter and view nonnull. Post: controller is connected to dependencies. */
    public StudySpotController(StudySpotApiClient api, StudySpotFilter filter, StudySpotView view) {
        throw new UnsupportedOperationException("TODO");
    }
    /** Pre: none. Post: loads catalog and displays results or a connection error. */
    public void onRefresh() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: criteria nonnull and catalog loaded. Post: updates filtered results/empty state. */
    public void onSearchChanged(SearchCriteria criteria) { throw new UnsupportedOperationException("TODO"); }
    /** Pre: id nonblank. Post: displays matching details or an error if missing. */
    public void onSpaceSelected(String id) { throw new UnsupportedOperationException("TODO"); }
}
