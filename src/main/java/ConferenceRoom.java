import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;
    private RoomType roomType;

    public ConferenceRoom(int capacity, ArrayList<Guest> guestsInRoom, String name, RoomType roomType) {
        super(capacity, guestsInRoom);
        this.name = name;
        this.roomType = roomType;
    }

    public int getCapacityFromEnum() {
        return this.roomType.getCapacity();
    }

    public int getValueOfEnumFromEnum() {
        return this.roomType.getValue();
    }
}
