package kata;

import java.util.*;

public class TimeFormatter {

    public static String formatDuration(int seconds) {

        if (seconds == 0) {
            return "now";
        }

        StringBuilder result = new StringBuilder();

        for(TimeUnit unit : TimeUnit.values()) {
            if(seconds >= unit.getInSeconds()) {
                int count = seconds / unit.getInSeconds();
                seconds %= unit.getInSeconds();
                result.append(result.isEmpty() ? "" : (seconds == 0 ? " and " :  ", "))
                        .append(count)
                        .append(" ")
                        .append(count > 1 ? unit.getPluralTimeUnit() : unit.getSingularTimeUnit())
                ;
            }
        }

        return result.toString();
    }
}