import java.util.Scanner;

public class HotelServiceApplication {

    public static void main(String[] args) {
        System.out.println("hotel.HotelServiceApplication");
        Scanner scanner = new Scanner(System.in);
        ConsoleHotelPresenter consoleHotelPresenter = new ConsoleHotelPresenter();
        while (true) {
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Dodaj hotel");
            System.out.println("2. Pokaż hotele");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    consoleHotelPresenter.insertHotel();
                    break;
                case 2:
                    consoleHotelPresenter.showAllHotels();
                    break;
            }
        }
    }
}
