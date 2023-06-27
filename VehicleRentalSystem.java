import java.util.Scanner;


public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Car Details:");
        System.out.print("Brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Model: ");
        String carModel = scanner.nextLine();
        System.out.print("Year: ");
        int carYear = scanner.nextInt();
        System.out.print("Number of Seats: ");
        int carNumSeats = scanner.nextInt();

        Car car1 = new Car(carBrand, carModel, carYear, carNumSeats);

        System.out.println("\nEnter Motorcycle Details:");
        scanner.nextLine(); // Consume newline character
        System.out.print("Brand: ");
        String motorcycleBrand = scanner.nextLine();
        System.out.print("Model: ");
        String motorcycleModel = scanner.nextLine();
        System.out.print("Year: ");
        int motorcycleYear = scanner.nextInt();
        System.out.print("Has Sidecar (true/false): ");
        boolean motorcycleHasSidecar = scanner.nextBoolean();

        Motorcycle motorcycle1 = new Motorcycle(motorcycleBrand, motorcycleModel, motorcycleYear, motorcycleHasSidecar);

        // Display vehicle information
        System.out.println("\nCar Details:");
        car1.displayInfo();
        System.out.println("Number of Seats: " + car1.getNumSeats());

        System.out.println("\nMotorcycle Details:");
        motorcycle1.displayInfo();
        System.out.println("Has Sidecar: " + motorcycle1.hasSidecar());
    }
}
