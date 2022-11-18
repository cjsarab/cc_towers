public enum RoomType {
    SINGLE(1, 1),
    DOUBLE(2, 2),
    TWIN(3, 2),
    FAMILY(4, 4),
    CONFERENCEA(5, 60);

    private final int value;
    private final int capacity;

    RoomType(int value, int capacity) {
        this.value = value;
        this.capacity = capacity;
    }

    public int getValue() {
        return this.value;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
