package kata;

import org.junit.Assert;
import org.junit.Test;

public class TimeFormatterTest {

    @Test
    public void returnNowForZeroSecondsTest() {
        Assert.assertEquals("now", TimeFormatter.formatDuration(0));
    }

    @Test
    public void onePartResultTests() {
        Assert.assertEquals("1 second", TimeFormatter.formatDuration(1));
        Assert.assertEquals("2 minutes", TimeFormatter.formatDuration(120));
        Assert.assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        Assert.assertEquals("1 day", TimeFormatter.formatDuration(86400));
        Assert.assertEquals("1 year", TimeFormatter.formatDuration(31536000));
    }

    @Test
    public void twoPartResultTest() {
        Assert.assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
    }

    @Test
    public void threePartResultTest() {
        Assert.assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
    }

    @Test
    public void fourPartResultTests() {
        Assert.assertEquals("1 year, 1 hour, 1 minute and 1 second", TimeFormatter.formatDuration(31539661));
    }
}