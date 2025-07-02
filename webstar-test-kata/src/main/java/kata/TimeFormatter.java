package kata;

import java.util.*;

public class TimeFormatter {

    private static final int SECONDS_IN_A_YEAR = 365 * 24 * 60 * 60;
    private static final int SECONDS_IN_A_DAY = 24 * 60 * 60;
    private static final int SECONDS_IN_AN_HOUR = 60 * 60;
    private static final int SECONDS_IN_A_MINUTE = 60;
    private static final int ONE_SECOND = 1;

    public static String formatDuration(int seconds) {

        if (seconds == 0) {
            return "now";
        }

        int[] inSeconds = new int[] {SECONDS_IN_A_YEAR, SECONDS_IN_A_DAY, SECONDS_IN_AN_HOUR, SECONDS_IN_A_MINUTE, ONE_SECOND};
        String[] timeUnits = new String[] {"year", "day", "hour", "minute", "second"};

        List<String> resultFragments = new ArrayList<>();

        for(int i = 0; i < timeUnits.length; i++) {
            int secondsInUnit = inSeconds[i];
            String  timeUnit = timeUnits[i];
            int count = seconds / secondsInUnit;
            if(count >= 1) {
                resultFragments.add(count + " " + timeUnit + (count == 1 ? "" : "s"));
            }
            seconds = seconds % secondsInUnit;
        }

        if (resultFragments.size() == 1) {
            return resultFragments.getFirst();
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