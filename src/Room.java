public class Room {

    private static final int NO_BATHROOM = -1;
    private static final int STANDARD_BATHROOM = 0;
    private static final int EXCLUSIVE = 1;

    private final String roomNumber;
    private int numberOfPerson;
    private boolean isAvailable;
    private int bathroomStandard;

    public Room(String roomNumber, int numberOfPerson, int bathroomStandard) {
        this.roomNumber = roomNumber;
        this.numberOfPerson = numberOfPerson;
        this.bathroomStandard = bathroomStandard;
    }

    public Room(String roomNumber, int numberOfPerson) {
        this(roomNumber, numberOfPerson, NO_BATHROOM);
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setBathroomStandard(int bathroomStandard) {
        this.bathroomStandard = bathroomStandard;
    }

    public int getBathroomStandard() {
        return bathroomStandard;
    }

}
