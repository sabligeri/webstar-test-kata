# webstar-test-kata

This project is based on the following Codewars kata: https://www.codewars.com/kata/human-readable-duration-format.

---

### Solution file: 
- `src/main/java/kata/TimeFormatter.java`
  
### Unit test file:
- `src/test/java/kata/TimeFormatterTest.java`

### Benchmark Runner file:
- `src/test/java/kata/benchmark/BenchmarkRunner.java`

---

### Benchmarks

| Branch / Implementation | Avg. time (ns/op) | Error ± (ns) |
|-------------------------|------------------:|-------------:|
|1. `main`          | 109,848              | 2,230          |
|2. `refactor-timeformatter`          | 251,471              | 3,060          |
|3. `enum-map`        | 163,948                | 2,240            |
|4. `parallel-arrays`     | 145,757                | 2,596            |
|5. `single-pass-string`           | 102,700                | 1,028            |
|6. `nested-builder`  (planned)          | –                | –            |

