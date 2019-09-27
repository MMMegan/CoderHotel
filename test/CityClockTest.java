import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityClockTest {

    @Test
    void SetALocalTime() {
        Clock a=new CityClock(8);
        a.setLocalTime(9);
        assertEquals(9,a.localTime);
    }
}