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

        List<String> resultFragments = new ArrayList<>();

        Map<Integer, String> timeUnitToSeconds = new LinkedHashMap<>();

        timeUnitToSeconds.put(SECONDS_IN_A_YEAR, "year");
        timeUnitToSeconds.put(SECONDS_IN_A_DAY, "day");
        timeUnitToSeconds.put(SECONDS_IN_AN_HOUR, "hour");
        timeUnitToSeconds.put(SECONDS_IN_A_MINUTE, "minute");
        timeUnitToSeconds.put(ONE_SECOND, "second");

        for(Map.Entry<Integer, String> unitEntry : timeUnitToSeconds.entrySet()) {
            int secondsInUnit = unitEntry.getKey();
            String  timeUnit = unitEntry.getValue();
            int count = seconds / secondsInUnit;
            if(count >= 1) {
                resultFragments.add(count + " " + timeUnit + (count == 1 ? "" : "s"));
            }
            seconds = seconds % secondsInUnit;
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