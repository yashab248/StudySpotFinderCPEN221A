package ca.ubc.chupa.controller;

import ca.ubc.chupa.model.StudySpot;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Optional;

/** Client-side HTTP/JSON adapter; never directly accesses server files. */
public final class StudySpotApiClient {
    /** Pre: baseUri nonnull and absolute. Post: adapter targets baseUri. */
    public StudySpotApiClient(URI baseUri) { throw new UnsupportedOperationException("TODO"); }
    /** Pre: server is configured. Post: returns catalog from GET /api/spaces.
     * @throws IOException if request, decoding, or HTTP handling fails. */
    public List<StudySpot> fetchAll() throws IOException, InterruptedException {
        throw new UnsupportedOperationException("TODO");
    }
    /** Pre: id nonblank. Post: returns matching record or empty on HTTP 404.
     * @throws IOException if request, decoding, or other HTTP handling fails. */
    public Optional<StudySpot> fetchById(String id) throws IOException, InterruptedException {
        throw new UnsupportedOperationException("TODO");
    }
}
