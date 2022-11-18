import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int capacity, ArrayList<Guest> guestsInRoom, int roomNumber, RoomType roomType) {
        super(capacity, guestsInRoom);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getCapacityFromEnum() {
        return this.roomType.getCapacity();
    }

}
