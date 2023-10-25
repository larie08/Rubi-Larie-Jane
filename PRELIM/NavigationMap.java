/* OOPROG21
NAME: RUBI, LARIE JANE   BSIT 2B */
import java.util.Scanner;

public class NavigationMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== WELCOME TO CEBU SOUTHBUS TERMINAL ========");
        System.out.println("Your starting block is Cebu City");
        System.out.println("ROUTES:");
        System.out.println("Route 1                    Minglanilla");
        System.out.println("Route 2                    San Fernando");
        System.out.println("Route 3                    Carcar");
        System.out.println("Route 4.1                  Barili");
        System.out.println("Route 4.1.1                Dumanjug");
        System.out.println("Route 4.1.2                Alcantara");
        System.out.println("Route 4.2                  Sibonga");
        System.out.println("Route 5                    Argao");
        System.out.println("Route 5.1                  Ronda");

        System.out.println("Is Barili Obstructed? (1) Yes (2) No:");
        int bariliRoute = scanner.nextInt();
        double totalDistance = 0;

        if (bariliRoute != 1) {
            totalDistance += 84.9; // Distance to Barili
            System.out.println("Default Route:");
            System.out.println(" Cebu City (Start)\n Minglanilla (Route 1)\n San Fernando (Route 2)\n Carcar (Route 3)\n Barili (Route 4)\n Dumanjug (Route 4.1.1)\n Alcantara (Route 4.1.2)\n Moalboal(End)\n");
        } else {
            System.out.println("Is Dumanjug Obstructed?");
            int dumanjugRoute = scanner.nextInt();

            if (dumanjugRoute != 1) {
                totalDistance += 94.0; // Distance to Dumanjug
                System.out.println("Recommended Route:");
                System.out.println(" Cebu City (Start)\n Minglanilla (Route 1)\n San Fernando (Route 2)\n Carcar (Route 3)\n Sibonga (Route 4.2)\n Dumanjug (Route 4.2.1)\n Alcantara (Route 4.2.2)\n Moalboal(End)\n");
            } else {
                totalDistance += 92.3; // Distance to Argao
                System.out.println("Recommended Route:");
                System.out.println(" Cebu City (Start)\n Minglanilla (Route 1)\n San Fernando (Route 2)\n Carcar (Route 3)\n Sibonga (Route 4.2)\n Argao (Route 5)\n Ronda (Route 5.1)\n Alcantara (Route 5.2)\n Moalboal(End)\n");
            }
        }

        System.out.print("Enter your speed (in km/h): ");
        double speed = scanner.nextDouble();

        double etaInHours = totalDistance / speed;
        int etaHours = (int) etaInHours;
        int etaMinutes = (int) ((etaInHours - etaHours) * 60 );

        if (etaMinutes == 60) {
            etaHours++;
            etaMinutes = 0;
        }

        System.out.printf("Distance: %.1f km\n", totalDistance);
        System.out.printf("Speed: %.1f km/h\n", speed);
        System.out.printf("Estimated Time of Arrival (ETA): %d hours %d minutes\n", etaHours, etaMinutes);
    }
}