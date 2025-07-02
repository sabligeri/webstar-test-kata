package kata.benchmark;

import kata.TimeFormatter;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(value = 3)
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 15, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class TimeFormatterBenchmark {

    int seconds = 31539661;

    @Benchmark
    public String formatDurationBenchmark() {
        return TimeFormatter.formatDuration(seconds);
    }

}
