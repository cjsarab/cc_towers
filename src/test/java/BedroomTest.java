import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        ArrayList<Guest> guestsInRoom = new ArrayList<>();
        bedroom = new Bedroom(2, guestsInRoom, 102, RoomType.DOUBLE);
    }

    @Test
    public void bedroomHasCapacity() {
        assertEquals(2, bedroom.getCapacityFromEnum());
    }

    @Test
    public void bedroomCanSeeEnumValue() {
        assertEquals(2, bedroom.getValueOfEnumFromEnum());
    }
}
