import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneClockTest {

   /*void setALocalTime() {
        PhoneClock a=new PhoneClock(8);
        assertEquals(8,a.UTC_OFFSET);//
        a.setLocalTime(7);
        assertEquals(7,a.localTime);
    }*/

    @Test
    void setAUtcTime() {
        PhoneClock a=new PhoneClock(8);
        UtcTime u =new UtcTime();
        a.setUtcTime(u);
        assertEquals(a.utcTime,u);
    }
}