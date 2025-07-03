# webstar-test-kata

This project is based on the following Codewars kata: https://www.codewars.com/kata/human-readable-duration-format.

> **Note:** The `main` branch contains the exact solution that was submitted by the "deadline" and has been left untouched for full reproducibility.

---

### Solution file: 
- `src/main/java/kata/TimeFormatter.java`
  
### Unit test file:
- `src/test/java/kata/TimeFormatterTest.java`

### Benchmark Runner file:
- `src/test/java/kata/benchmark/BenchmarkRunner.java`

---

### Bonus exploration – why multiple implementations?

The point of this exercise was **not raw speed at any cost** but
to **refactor the original code/solution in some way, isolate each idea in its own
branch, and measure how different data structures influence both
maintainability and runtime**.

* First I moved constant–label pairs into a single LinkedHashMap, so with a iteration I could replace the recurring `if` statements.
  (`refactor-timeformatter`) – quick to write, but iteration is slower.
* Next came an **`EnumMap`** (`enum-map`).  
  All fixed constants are in one place, so adding a new unit
  like `(WEEK, "week",  60 * 60 * 24 * 7)` is easire and maintainable.
* For curiosity I tried **parallel arrays** (`parallel-arrays`),
  which is faster in micro-benchmarks but scatters the data:
  a third array would be needed if we want to add plural time units option.
* In my local experiments the `single-pass-string` branch blends the enum-based clarity with a single traversal,
  resulting in the tidiest code and the fastest runtime within this repository.

The mini-benchmark table is therefore illustrative rather than decisive;
what matters is that each branch shows a different trade-off between
**performance, readability and extensibility**.
I hope you find this little experiment of mine interesting.

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

