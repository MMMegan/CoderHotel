import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtcTimeTest {

    @Test
    void printTimeOfAllClocks() {
        UtcTime utcTime = new UtcTime();
        utcTime.attach("BeiJing",new CityClock(8));
        utcTime.attach("London",new CityClock(0));
        utcTime.attach("Moscow",new CityClock(4));
        utcTime.attach("Sydney",new CityClock(10));
        utcTime.attach("NewYork",new CityClock(-5));
        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setUtcTime(utcTime);

        phoneClock.setLocalTime(8);
        utcTime.printTimeOfAllClocks();
    }
}