package kata;

public enum TimeUnit {

    YEAR("year", "years",365 * 24 * 60 * 60),
    DAY("day","days", 24 * 60 * 60),
    HOUR("hour", "hours",60 * 60),
    MINUTE("minute", "minutes",60),
    SECOND("second", "seconds",1);

    private final String singularTimeUnit;
    private final String pluralTimeUnit;
    private final int inSeconds;

    TimeUnit(final String singularTimeUnit, final String pluralTimeUnit, final int inSeconds) {
        this.singularTimeUnit = singularTimeUnit;
        this.pluralTimeUnit = pluralTimeUnit;
        this.inSeconds = inSeconds;
    }

    public String getSingularTimeUnit() {
        return singularTimeUnit;
    }

    public String getPluralTimeUnit() {
        return pluralTimeUnit;
    }

    public int getInSeconds() {
        return inSeconds;
    }

}