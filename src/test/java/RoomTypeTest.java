import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTypeTest {

    RoomType roomType;

    @Before
    public void before() {
        roomType = RoomType.DOUBLE;
    }

    @Test
    public void roomTypeHasValue() {
        assertEquals(2, roomType.getValue());
    }

    @Test
    public void roomTypeHasCapacity() {
        assertEquals(2, roomType.getCapacity());
    }
}
