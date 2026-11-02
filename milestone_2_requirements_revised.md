# CHUPA — Milestone 2 Requirements (MVP)

**Project:** Campus Hub for Uncrowded Places & Availability (CHUPA)  
**Scope:** Read-only Java desktop application for finding UBC study spaces.  
**Design reference:** [CHUPA project README](https://github.com/yashab248/StudySpotFinderCPEN221A) (problem statement and scope). **The README is not a complete Milestone 1 interaction design.** The following is a proposed MVP specification; the team should confirm it against any existing design sketches or mockups before submission.

## 1. Study-space dataset

*Design connection:* The README describes finding UBC study spaces with useful location and study-environment information.

- **R01:** Every loaded study-space record shall have a unique, nonblank identifier.
- **R02:** Every loaded study-space record shall have a nonblank display name.
- **R03:** Every loaded study-space record shall have a nonblank building name.
- **R04:** Every loaded study-space record shall indicate whether individual study is supported.
- **R05:** Every loaded study-space record shall indicate whether group study is supported.
- **R06:** Every loaded study-space record shall indicate whether charging outlets are available.
- **R07:** Every loaded study-space record shall have a crowding category of `LOW`, `MODERATE`, `HIGH`, or `UNKNOWN`.
- **R08:** Every loaded study-space record shall provide a weekly schedule with an opening interval or an explicit `CLOSED` value for each day from Monday through Sunday.

## 2. Browse and view details

*Design connection:* The README's goal is to help students compare suitable places to study.

- **R09:** After successfully requesting the catalog, the client shall display all study spaces returned by the server.
- **R10:** Each item in the displayed results shall show the study-space name.
- **R11:** Each item in the displayed results shall show the building name.
- **R12:** Selecting a result shall display whether that study space supports individual study.
- **R13:** Selecting a result shall display whether that study space supports group study.
- **R14:** Selecting a result shall display whether that study space has charging outlets.
- **R15:** Selecting a result shall display its recorded weekly opening hours, including days marked `CLOSED`.
- **R16:** Selecting a result shall display its recorded crowding category.
- **R17:** A study space with crowding category `UNKNOWN` shall display `Crowding information unavailable` instead of a numerical or categorical estimate.

## 3. Search and filter

*Design connection:* Students should be able to narrow the list to places matching a name, building, or study preference.

- **R18:** The client shall provide a text field for searching study spaces.
- **R19:** A search query shall match spaces whose name or building contains the query, ignoring letter case.
- **R20:** An empty or whitespace-only search query shall impose no text restriction on the results.
- **R21:** The client shall allow the user to filter for study spaces supporting individual study.
- **R22:** The client shall allow the user to filter for study spaces supporting group study.
- **R23:** The client shall allow the user to filter for study spaces with charging outlets.
- **R24:** When multiple filters are enabled, a study space shall appear only if it satisfies all enabled filters.
- **R25:** When no records match the current query and filters, the client shall display `No study spaces match your search.`
- **R26:** The client shall provide a reset action that clears the search query and disables all filters.

## 4. Local data, API and error handling

*Design connection:* The README describes file-backed data and client-server communication.

- **R27:** At startup, the server shall load study-space records from a UTF-8 JSON file at a configured local filesystem path.
- **R28:** The server shall report a startup error if the configured dataset cannot be read or parsed.
- **R29:** The server shall expose `GET /api/spaces`, returning the loaded study-space catalog as JSON with HTTP status `200` on success.
- **R30:** The server shall expose `GET /api/spaces/{id}`, returning the study space for an existing identifier as JSON with HTTP status `200`.
- **R31:** `GET /api/spaces/{id}` shall return HTTP status `404` when the identifier does not exist.
- **R32:** The desktop client shall obtain its catalog by sending an HTTP request to the CHUPA server rather than reading the server's dataset file directly.
- **R33:** If the client cannot reach the server, it shall display `Unable to connect to the study-space server.`
- **R34:** The project shall use the third-party Jackson library to deserialize the JSON study-space dataset.

## MVP boundaries and data honesty

- The MVP **does not require an external UBC API**. The server exposes CHUPA's *own* HTTP API; its data is maintained in a local JSON file.
- The MVP does not promise live seat counts or live availability. Crowding is a dataset label only, and should be presented as recorded information, not as a real-time measurement.
- The MVP has no accounts, bookings, user-submitted reports, maps, database, or write endpoints.
- Weekly hours are reference data; holiday exceptions and last-minute closures are outside MVP scope. The UI must not imply that weekly schedules guarantee a space is currently open.
- `accessibleEntry` and `crowdingTimestamp` appear in the current `StudySpot` stub, and `accessibleOnly` appears in `SearchCriteria`. These are **optional extension fields** in the current code skeleton, not required MVP UI features. If the team decides to remove them entirely, revise those Java stubs accordingly. If present, these fields may be displayed but must not be used to claim verified accessibility or live crowding.
- A small, team-curated dataset is sufficient to demonstrate the MVP. There is no requirement for a particular number of buildings or for comprehensive UBC coverage.

## Traceability and verification

Each R-number is a separate acceptance criterion. Verification can use a sample JSON dataset containing spaces with different study modes, outlets, hours and crowding categories; UI tests for empty queries and multiple filters; and integration tests for HTTP `200`, `404` and server-unavailable states.

**For grading:** If your team has a Milestone 1 design document, add a link to it here and map each requirement section to the corresponding design section. The README link alone cannot establish completeness against an unseen detailed design.
