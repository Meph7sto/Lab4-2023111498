package cn.gy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalTest {
    @Test
    public void testAdd() {
        assertEquals(5, Cal.add(3, 2));
    }
}
