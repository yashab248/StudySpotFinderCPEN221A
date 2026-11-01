package ca.ubc.chupa.server;

import ca.ubc.chupa.model.StudySpotRepository;

/** Server-side HTTP request handler; implementation may use JDK HttpServer. */
public final class StudySpotServer {
    /** Pre: repo nonnull; 1 <= port <= 65535. Post: server configured but not started. */
    public StudySpotServer(StudySpotRepository repo, int port) { throw new UnsupportedOperationException("TODO"); }
    /** Pre: port is available and server not started. Post: server handles HTTP requests. */
    public void start() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: none. Post: listening server, if any, is stopped. */
    public void stop() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: server started. Post: GET /api/spaces returns all records as JSON/HTTP 200. */
    public void handleList() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: id nonblank and server started. Post: returns matching JSON/HTTP 200 or 404. */
    public void handleGetById(String id) { throw new UnsupportedOperationException("TODO"); }
}
