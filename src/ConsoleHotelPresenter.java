import java.util.Scanner;

public class ConsoleHotelPresenter {

    private HotelService hotelService = new HotelService();

    public void showAllHotels() {
        Hotel[] hotels = hotelService.getHotels();
        for (Hotel hotel : hotels) {
            hotel.showHotel();
        }
    }

    public void insertHotel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id hotelu: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj nazwę hotelu: ");
        String name = scanner.nextLine();

        System.out.println("Podaj standard: ");
        int standard = scanner.nextInt();

        Hotel hotel = new Hotel(id, name, standard, null);
        hotelService.addHotel(hotel);
    }
}
