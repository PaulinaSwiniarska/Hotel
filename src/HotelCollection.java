public class HotelCollection {

    private Hotel[] hotels = new Hotel[2];

    public void add(Hotel hotel) {
        boolean isFull = true;
        for (int i = 0; i < hotels.length; i++) {
            if (hotels[i] == null) {
                hotels[i] = hotel;
                isFull = false;
                break;
            }
        }
        if (isFull) {
            Hotel[] newHotels = new Hotel[hotels.length + 1];
            for (int i = 0; i < hotels.length; i++) {
                newHotels[i] = hotels[i];
            }
            newHotels[newHotels.length - 1] = hotel;
            hotels = newHotels;
        }
    }

    public void remove(int id) {
        for (int i = 0; i < hotels.length; i++) {
            if (hotels[i] != null && hotels[i].getId() == id) {
                hotels[i] = null;
                break;
            }
        }
    }

    public Hotel[] getHotels() {
        Hotel[] nonNullHotels = filterOutNullElements();
        return nonNullHotels;
    }

    private Hotel[] filterOutNullElements() {
        int nonNullElements = 0;
        for (Hotel hotel : hotels) {
            if (hotel != null) {
                nonNullElements++;
            }
        }
        Hotel[] nonNullHotels = new Hotel[nonNullElements];
        int currentIndexFromNonNullTable = 0;
        for (int i = 0; i < hotels.length; i++) {
            if (hotels[i] != null) {
                nonNullHotels[currentIndexFromNonNullTable++] = hotels[i];
            }
        }
        return nonNullHotels;
    }
}
