package ca.ubc.chupa.model;

/** A single day's hours, including explicitly closed days. */
public final class DailyHours {
    /** @param closed whether the space is closed all day; @param opens HH:mm or null if closed;
     * @param closes HH:mm or null if closed.
     * Pre: if not closed, opens/closes are valid times and opens precedes closes.
     * Post: a DailyHours representing the supplied interval is created. */
    public DailyHours(boolean closed, String opens, String closes) { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns whether this day is closed. */
    public boolean isClosed() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns opening time, or null if closed. */
    public String getOpens() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: returns closing time, or null if closed. */
    public String getCloses() { throw new UnsupportedOperationException("TODO"); }
}
