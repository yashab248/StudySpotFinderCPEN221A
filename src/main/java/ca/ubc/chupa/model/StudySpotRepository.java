package ca.ubc.chupa.model;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

/** Server-side study-space catalog backed by a local JSON file. */
public final class StudySpotRepository {
    /** Pre: path nonnull. Post: returns a repository containing validated records;
     * @throws IOException if path cannot be read or its JSON is invalid. */
    public static StudySpotRepository load(Path path) throws IOException {
        throw new UnsupportedOperationException("TODO");
    }
    /** Pre: repository loaded. Post: returns an unmodifiable snapshot of all records. */
    public List<StudySpot> getAll() { throw new UnsupportedOperationException("TODO"); }
    /** Pre: id nonnull. Post: returns matching record or Optional.empty() if none. */
    public Optional<StudySpot> findById(String id) { throw new UnsupportedOperationException("TODO"); }
}
