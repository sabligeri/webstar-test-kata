# webstar-test-kata

This project is based on the following Codewars kata: https://www.codewars.com/kata/human-readable-duration-format.

---

### Solution file: 
- `src/main/java/kata/TimeFormatter.java`
  
### Unit test file:
- `src/test/java/kata/TimeFormatterTest.java`

---

### Planned benchmarks (Work In Progress)

| Branch / Implementation | Avg. time (ns/op) | Error ± (ns) |
|-------------------------|------------------:|-------------:|
| `main`          | 109,848              | 2,230          |
| `refactor-timeformatter`          | 251,471              | 3,060          |
| `parallel-arrays` (planned)    | –                | –            |
| `nested-builder`  (planned)          | –                | –            |
| `enum-map`        | 163,948                | 2,240            |
| `single-pass-string` (planned)           | –                | –            |

> **Note:** this table is currently just a placeholder.  
> I will update the `Avg. time` and `Error` columns with the results.
