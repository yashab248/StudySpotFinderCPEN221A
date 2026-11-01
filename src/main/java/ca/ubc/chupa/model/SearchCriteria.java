package ca.ubc.chupa.model;

/** A snapshot of search text and enabled filter flags. */
public final class SearchCriteria {
    /** Pre: query nonnull. Post: stores the query and four requested filters. */
    public SearchCriteria(String query, boolean individualOnly, boolean groupOnly,
            boolean outletsOnly, boolean accessibleOnly) { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns entered search query. */
    public String getQuery() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns individual-only flag. */
    public boolean isIndividualOnly() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns group-only flag. */
    public boolean isGroupOnly() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns outlet-only flag. */
    public boolean isOutletsOnly() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns accessible-only flag. */
    public boolean isAccessibleOnly() { throw new UnsupportedOperationException("TODO"); }
}
