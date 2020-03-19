import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ReserveManager {
    HashMap<Integer, ReserveData> usersList = new HashMap<>();
    int userNumber, salonNum, day, hour;
    String film;
    Scanner scanner = new Scanner(System.in);
    List<Integer> chairsits = new ArrayList<>();

    ReserveManager() {

        System.out.println("enter userNumber");
        userNumber = scanner.nextInt();
        System.out.println("enter film");
        film = scanner.nextLine();
        System.out.println("enter SalonNum");
        salonNum = scanner.nextInt();
        System.out.println("enter day, then hour");
        day = scanner.nextInt();
        hour = scanner.nextInt();
        Date date = new Date(day, hour);

        ReserveData rd = new ReserveData(salonNum, film, date);
        //Salon salon = new Salon(rd);

        System.out.println("enter chairIndex and row");


    }


}
