package cn.gy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalTest {
    @Test
    public void testAdd() {
        assertEquals(3, Cal.add(1, 2));
    }
}
