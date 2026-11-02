# CHUPA Milestone 2 handoff

- `milestone_2_requirements.md`: proposed testable MVP requirements.
- `milestone_2_architecture.md`: proposed MVC/client-server design and **exact** locations of all Java stubs.
- `src/main/java/ca/ubc/chupa/`: nine Java source-code stubs.

These are **draft** deliverables, not proof of an approved design. Compare them against the team's Milestone 1 design and adjust features/technology with your teammates.

## Compile stubs (optional sanity check)

```bash
find src/main/java -name '*.java' > sources.txt
javac @sources.txt
```

Compilation does not mean features work: the non-interface methods deliberately throw `UnsupportedOperationException`.

## Course submission steps

In the **course-assigned** `cpen-221-2026-project-<n>` repository:

```bash
git checkout main
git pull
git checkout -b milestone-2
# copy the Markdown files and src/ stubs into the repository
git add milestone_2_requirements.md milestone_2_architecture.md src
 git commit -m "Add milestone 2 requirements, architecture and component stubs"
git push -u origin milestone-2
```

If `milestone-2` already exists, switch to it instead of recreating it. Ensure the branch is created from the intended `main` commit, and that everything is committed **before the course deadline**. The public project repository URL may not be the course-assigned grading repository.
