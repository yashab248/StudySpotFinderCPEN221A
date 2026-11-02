package ca.ubc.chupa.model;

/**
 * Represents the search query and active filters
 * selected by the user.
 *
 * This component resides on the client.
 */
public final class SearchCriteria {

    /**
     * Creates a snapshot of the user's search preferences.
     *
     * Pre: query != null.
     *
     * Post: Stores the search query and the three
     * requested filter flags.
     */
    public SearchCriteria(String query,
            boolean individualOnly,
            boolean groupOnly,
            boolean outletsOnly) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Pre: none.
     * Post: Returns the search query.
     */
    public String getQuery() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Pre: none.
     * Post: Returns whether individual study is required.
     */
    public boolean isIndividualOnly() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Pre: none.
     * Post: Returns whether group study is required.
     */
    public boolean isGroupOnly() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Pre: none.
     * Post: Returns whether charging outlets are required.
     */
    public boolean isOutletsOnly() {
        throw new UnsupportedOperationException("TODO");
    }
}