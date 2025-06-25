package kata;

import java.util.*;

public class TimeFormatter {

    private static final int SECONDS_IN_A_YEAR = 365 * 24 * 60 * 60;
    private static final int SECONDS_IN_A_DAY = 24 * 60 * 60;
    private static final int SECONDS_IN_AN_HOUR = 60 * 60;
    private static final int SECONDS_IN_A_MINUTE = 60;

    public static String formatDuration(int seconds) {

        if (seconds == 0) {
            return "now";
        }

        List<String> resultFragments = new ArrayList<>();

        int years = seconds / SECONDS_IN_A_YEAR;
        if(years >= 1) {
            resultFragments.add(years + (years == 1 ? " year" : " years"));
            seconds = seconds % SECONDS_IN_A_YEAR;
        }

        int days = seconds / SECONDS_IN_A_DAY;
        if(days >= 1) {
            resultFragments.add(days + (days == 1 ? " day" : " days"));
            seconds = seconds % SECONDS_IN_A_DAY;
        }


        int hours = seconds / SECONDS_IN_AN_HOUR;
        if(hours >= 1) {
            resultFragments.add(hours + (hours == 1 ? " hour" : " hours"));
            seconds = seconds % SECONDS_IN_AN_HOUR;
        }


        int minutes = seconds / SECONDS_IN_A_MINUTE;
        if(minutes >= 1) {
            resultFragments.add(minutes + (minutes == 1 ? " minute" : " minutes"));
            seconds = seconds % SECONDS_IN_A_MINUTE;
        }

        if(seconds >= 1) {
            resultFragments.add(seconds + (seconds == 1 ? " second" : " seconds"));
        }

        if (resultFragments.size() == 1) {
            return resultFragments.get(0);
        }

        if (resultFragments.size() == 2) {
            return resultFragments.get(0) + " and " + resultFragments.get(1);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < resultFragments.size(); i++) {
            if (i == resultFragments.size() - 1) {
                result.append("and ").append(resultFragments.get(i));
            } else if (i == resultFragments.size() - 2) {
                result.append(resultFragments.get(i)).append(" ");
            } else {
                result.append(resultFragments.get(i)).append(", ");
            }
        }
        return result.toString();
    }
}