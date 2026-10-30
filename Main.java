import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        calculateAndPrintSpeed(sc, "Truck");
        calculateAndPrintSpeed(sc, "Bike");

        sc.close();
    }

    public static void calculateAndPrintSpeed(Scanner sc, String vehicleName) {
        System.out.println("--- " + vehicleName + " Input ---");

        System.out.print("Enter Gear : ");
        int gear = sc.nextInt();
        System.out.print("Enter Brake : ");
        int brake = sc.nextInt();

        int speed = (gear * 25) - (brake * 5);
        if (speed < 0)
            speed = 0;

        System.out.println(vehicleName + " Current Speed : " + speed + " km/h\n");
    }
}
