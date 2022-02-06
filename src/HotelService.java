public class HotelService {
    private HotelCollection hotelCollection = new HotelCollection();

    public void addHotel(Hotel hotel) {
        hotelCollection.add(hotel);
    }

    public Hotel[] getHotels() {
        Hotel[] hotels = hotelCollection.getHotels();
        return hotels;
    }

}
