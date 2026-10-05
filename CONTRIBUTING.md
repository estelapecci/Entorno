# Contributing Guide

Thank you for helping to improve this repository. Please follow these rules.

## Branching strategy

- `main` is the stable branch. Never commit directly to it.
- Create a new branch from `main` for every change.
- Use these branch name prefixes:
  - `feature/<short-description>` for new features or documentation (e.g. `feature/code-documentation`)
  - `fix/<short-description>` for corrections (e.g. `fix/readme-improvements`)
- Keep branches small and focused on one topic.

## Commit conventions

Use the format `type: short description` in the imperative mood, in English.

| Type | Use |
|------|-----|
| `feat` | New functionality |
| `fix` | Bug fix |
| `docs` | Documentation changes (Javadoc, README, etc.) |
| `refactor` | Code change that does not alter behavior |
| `test` | Adding or changing tests |
//estelapecci


Examples:

```
docs: add Javadoc to ProyectoObjetos classes
fix: correct setup steps in README
```

Rules: one logical change per commit, and a subject line of at most 72 characters.

## Code style

- Document every class, attribute, constructor and method with Javadoc.
- Every method must include `@param` for each parameter and `@return` when it is not `void`.
- Make sure the project compiles before committing:
```bash
  javac PROGRAMACION/ProyectoObjetos/*.java
```

## Pull request guidelines

1. Push your branch and open a pull request targeting `main`.
2. Write a clear title and a description explaining **what** changed and **why**.
3. Keep the pull request small and limited to one topic.
4. At least one review is required before merging.
5. Reviewers must approve, or reject with a written comment explaining the reason.
6. Resolve all review comments before merging.