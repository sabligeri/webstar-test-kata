package kata;

public enum TimeUnit {

    YEAR("year", 365 * 24 * 60 * 60),
    DAY("day", 24 * 60 * 60),
    HOUR("hour", 60 * 60),
    MINUTE("minute", 60),
    SECOND("second", 1);

    private final String timeUnit;
    private final int inSeconds;

    TimeUnit(final String timeUnit, final int inSeconds) {
        this.timeUnit = timeUnit;
        this.inSeconds = inSeconds;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public int getInSeconds() {
        return inSeconds;
    }

}
