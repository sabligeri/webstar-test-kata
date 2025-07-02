package kata;

import java.util.*;

public class TimeFormatter {

    public static String formatDuration(int seconds) {

        if (seconds == 0) {
            return "now";
        }

        List<String> resultFragments = new ArrayList<>();

        for(TimeUnit unit : TimeUnit.values()) {
            int unitInSeconds = unit.getInSeconds();
            String  timeUnit = unit.getTimeUnit();
            int count = seconds / unitInSeconds;
            if(count >= 1) {
                resultFragments.add(count + " " + timeUnit + (count == 1 ? "" : "s"));
            }
            seconds = seconds % unitInSeconds;
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