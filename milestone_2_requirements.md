# CHUPA — Milestone 2 Requirements (Draft)

**Project:** Campus Hub for Uncrowded Places & Availability (CHUPA)  
**Status:** Proposed first-version requirements for team review, **not** a pre-existing approved design.  
**Source/design reference:** [Project problem and scope (README)](https://github.com/yashab248/StudySpotFinderCPEN221A#the-problem). The README describes the problem and broad scope, but does not contain a detailed interaction-by-interaction design. The requirements below form a proposed first-version specification. Update this document if your team's actual design differs.

## 1. Study-space records
Design link: [Problem](https://github.com/yashab248/StudySpotFinderCPEN221A#the-problem).

- **R01:** Every study-space record shall have a nonempty unique identifier.
- **R02:** Every study-space record shall have a nonempty display name.
- **R03:** Every study-space record shall have a nonempty building name.
- **R04:** Every study-space record shall specify whether it supports individual study.
- **R05:** Every study-space record shall specify whether it supports group study.
- **R06:** Every study-space record shall specify whether charging outlets are available.
- **R07:** Every study-space record shall specify whether accessible entry is documented.
- **R08:** Every study-space record shall have a crowding status of LOW, MODERATE, HIGH, or UNKNOWN.
- **R09:** Every study-space record shall include its crowding information's source timestamp when the crowding status is not UNKNOWN.
- **R10:** Each study-space record shall contain opening and closing times for each day of the week, or an explicit CLOSED value for that day.

## 2. Browsing and details
Design link: [Mission and problem](https://github.com/yashab248/StudySpotFinderCPEN221A#our-mission).

- **R11:** On a successful initial data request, the client shall show all study-space records returned by the server.
- **R12:** Each study space in the results list shall show its display name.
- **R13:** Each study space in the results list shall show its building name.
- **R14:** Selecting a study space shall display its supported study modes.
- **R15:** Selecting a study space shall display its charging-outlet status.
- **R16:** Selecting a study space shall display its accessible-entry status.
- **R17:** Selecting a study space shall display its complete recorded weekly hours.
- **R18:** Selecting a study space shall display its crowding status.
- **R19:** If a study space's crowding status is UNKNOWN, its details shall display “Crowding information unavailable.”
- **R20:** If a study space has a known crowding status, its details shall display the timestamp associated with that status.

## 3. Searching and filtering
Design link: [Problem](https://github.com/yashab248/StudySpotFinderCPEN221A#the-problem).

- **R21:** The client shall allow the user to enter a free-text search query.
- **R22:** Searching shall return only spaces whose name or building contains the query, ignoring case.
- **R23:** A blank search query shall not exclude any study space by text.
- **R24:** The client shall let the user request only spaces supporting individual study.
- **R25:** The client shall let the user request only spaces supporting group study.
- **R26:** The client shall let the user request only spaces with charging outlets.
- **R27:** The client shall let the user request only spaces with documented accessible entry.
- **R28:** When multiple filters are enabled, the results shall contain only spaces satisfying every enabled filter.
- **R29:** When no study spaces match a query and filters, the client shall display “No study spaces match your search.”
- **R30:** The client shall provide an action to reset the query and all filters to their defaults.

## 4. Hours and crowding uncertainty
Design link: [Goal and values](https://github.com/yashab248/StudySpotFinderCPEN221A#our-goal-and-values).

- **R31:** For each space, the client shall show the hours stored in the dataset rather than guessing hours that are missing.
- **R32:** A day recorded as CLOSED shall be displayed as “Closed” rather than as a zero-length opening interval.
- **R33:** The application shall not label crowding data as live unless the dataset explicitly identifies it as live data.
- **R34:** When crowding is UNKNOWN, the application shall not substitute LOW, MODERATE, or HIGH.

## 5. File-based storage and network communication
Design link: [Scope and project requirements](https://github.com/yashab248/StudySpotFinderCPEN221A#scope-and-project-requirements).

- **R35:** On startup, the server shall read study-space records from a UTF-8 JSON file at a configurable filesystem path.
- **R36:** The server shall reject a record missing any required field defined in R01–R10.
- **R37:** The server shall reject duplicate study-space identifiers.
- **R38:** The server shall support a request returning all successfully loaded study-space records.
- **R39:** The server shall support a request returning a study space by its identifier.
- **R40:** When an identifier does not exist, the server shall respond with a not-found result rather than an unrelated study space.
- **R41:** The client shall obtain study-space records through a network request to the server rather than by reading the server's data file.
- **R42:** When the server cannot be reached, the client shall display “Unable to connect to the study-space server.”
- **R43:** When the server cannot parse its data file at startup, it shall report an error identifying the configured file path.
- **R44:** The application shall use at least one third-party library beyond the Java standard library; the proposed choice is Jackson for JSON serialization and parsing.

## Scope decisions and assumptions to confirm

1. This is a **read-only MVP**. Users do not submit crowding reports or create accounts.
2. “Crowding” comes from supplied dataset records, not sensors or guaranteed live occupancy.
3. Weekly hours are dataset facts; holiday overrides and real-time closure verification are out of scope.
4. The proposed UI is a desktop Java UI; Swing is an illustrative standard-library choice.
5. The wire protocol is proposed as HTTP/JSON. The precise routes and response shapes appear in the architecture document.
6. This is a first draft based on the README, **not evidence that these interactions were agreed upon during Milestone 1**. Confirm feature scope with the team, and add links to any existing mockups or design specification before grading.

## Traceability / testing

Each requirement has a unique R-number for later test references. Tests should cover normal behavior, empty results, missing data, invalid records, duplicate IDs, and server-unavailable conditions. Test implementation is not required for this milestone's stubs.
