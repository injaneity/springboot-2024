package com.smu.workshop;

import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShowTimeClockTest {

    @Test
    public void canShoutIfItsShowtime() {
        ShowTimeClock myShowTimeClock = new MyShowTimeClock();
        assertThat(myShowTimeClock.whatTimeIsIt()).contains("It's Showtime!!");
    }

    @Test
    public void tipsAndTricks() {
        // Create a new running system clock with the default timezone
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);

        // Get a LocalTime using clock
        LocalTime timeNow = LocalTime.now(clock);
        System.out.println(timeNow);

        // Format the clock output
        String timeNowInString = timeNow.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(timeNowInString);

        // Get a fixed clock
        Instant instant = Instant.parse("2022-05-31T18:00:14.00Z");
        Clock fixedClock = Clock.fixed(instant, ZoneOffset.UTC);
        System.out.println(fixedClock);
    }
}
