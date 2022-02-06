public class Hotel {

    private final int id;
    private final String name;
    private int standard;
    private final Room[] rooms;

    public Hotel(int id, String name, int standard, Room[] rooms) {
        this.id = id;
        this.name = name;
        this.standard = standard;
        this.rooms = rooms;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getStandard() {
        return standard;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void showHotel() {
        System.out.printf("%d,%s,%d\n", id, name, getStandard());
    }
}

