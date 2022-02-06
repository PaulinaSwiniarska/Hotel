public class HotelService {
    private HotelCollection hotelCollection = new HotelCollection();

    public void addHotel(Hotel hotel) {
        hotelCollection.add(hotel);
    }

    public void deleteHotel(int id) {
        hotelCollection.remove(id);
    }

    public void showHotelsByStandard(int standard) {
        System.out.println("hotel.Hotel by standard: " + standard);
        Hotel[] hotels = hotelCollection.getHotels();
        for (Hotel hotel : hotels) {
            if (hotel != null && hotel.getStandard() == standard) {
                hotel.showHotel();
            }
        }
    }

    public void showHotelsSortedByStandard(boolean isAsc) {
        Hotel[] sortedHotels = hotelCollection.getHotels();
        for (int i = 0; i < sortedHotels.length; i++) {
            int swapCounter = 0;
            for (int j = 0; j < sortedHotels.length - 1; j++) {
                if (isAsc && sortedHotels[j].getStandard() > sortedHotels[j + 1].getStandard()) {
                    Hotel tmp = sortedHotels[j];
                    sortedHotels[j] = sortedHotels[j + 1];
                    sortedHotels[j + 1] = tmp;
                    swapCounter++;
                } else if (!isAsc && sortedHotels[j].getStandard() < sortedHotels[j + 1].getStandard()) {
                    Hotel tmp = sortedHotels[j];
                    sortedHotels[j] = sortedHotels[j + 1];
                    sortedHotels[j + 1] = tmp;
                    swapCounter++;
                }
            }
            //nie było żadnej zamiany w tablic, tzn. że jest już posortowana
            if (swapCounter == 0) {
                break;
            }
        }
        System.out.println("Sorted hotels");
        for (Hotel hotel : sortedHotels) {
            hotel.showHotel();
        }
    }

    public void showHotelsSortedByStandard1(boolean isAsc) {
        Hotel[] sortedHotels = hotelCollection.getHotels();
        int swapCounter;
        do {
            swapCounter = 0;
            for (int j = 0; j < sortedHotels.length - 1; j++) {
                if (isAsc && sortedHotels[j].getStandard() > sortedHotels[j + 1].getStandard()) {
                    Hotel tmp = sortedHotels[j];
                    sortedHotels[j] = sortedHotels[j + 1];
                    sortedHotels[j + 1] = tmp;
                    swapCounter++;
                } else if (!isAsc && sortedHotels[j].getStandard() < sortedHotels[j + 1].getStandard()) {
                    Hotel tmp = sortedHotels[j];
                    sortedHotels[j] = sortedHotels[j + 1];
                    sortedHotels[j + 1] = tmp;
                    swapCounter++;
                }
            }
        } while (swapCounter > 0);
        System.out.println("Sorted hotels");
        for (Hotel hotel : sortedHotels) {
            hotel.showHotel();
        }

    }

    public Hotel[] getHotels() {
        Hotel[] hotels = hotelCollection.getHotels();
        return hotels;
    }

}
