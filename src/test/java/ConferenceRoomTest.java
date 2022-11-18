import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        ArrayList<Guest> guestsInRoom = new ArrayList<>();
        conferenceRoom = new ConferenceRoom(60, guestsInRoom, "James Buchanan Suite", RoomType.CONFERENCEA);
    }

    @Test
    public void conferenceRoomHasCapacity() {
        assertEquals(60, conferenceRoom.getCapacityFromEnum());
    }
}
