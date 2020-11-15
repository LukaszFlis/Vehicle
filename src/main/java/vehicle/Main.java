package vehicle;
/**
 *The Vehicle program implements an application that displays the fastest vehicle
 *  It's shows producer and max speed in the standard output.
 *  For logging was used log4j framework.
 * @author Lukasz Flis
 * @version 1.1
 * @since 15-11-2020
 */

import org.apache.log4j.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * This is the main method which makes use of getFastestVehicle method.
 */
public class Main {
    private final static Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Entering application.");
        // 2d Array, each row define vehicle type producer and its max speed
        String[][] input = {{"car", "BMW", "245"}, {"car", "Audi", "265"},
                {"ship", "Solarsky", "85"}, {"ship", "Fox-Boat", "65"},
                {"bike", "Kawasaki", "299"}, {"bike", "MTT", "364"},
                {"plane", "Airbus", "1000"}, {"plane", "Boeing", "1045"}
        };
        //An ArrayList to store vehicles
        ArrayList<Vehicle> list = new ArrayList<>();
        //For each row of 2d array "input" add new object to ArrayList
        for (String[] row : input) {
            list.add(VehicleStaticFactory
                    .make(row[0], row[1], Integer.parseInt(row[2])));
        }
        //This array define vehicle type
        String[] vehicleTypesArray = {"CAR", "SHIP", "PLANE", "BIKE"};
        Scanner sc = new Scanner(System.in);
        //endless loop (EXIT break loop)
        while (true) {
            log.info("Wybierz: CAR SHIP PLANE  BIKE  ALL  EXIT");
            String userInput = sc.next().toUpperCase();
            //Display fastest vehicle based on userInput(type)
            switch (userInput) {
                case "CAR":
                case "SHIP":
                case "PLANE":
                case "BIKE":
                    log.info(
                            "Najszybszy pojazd w kategorii " + userInput + ":\n" +
                                    getFastestVehicle(list, userInput) + " km/h"
                    );
                    log.info("\n");
                    break;
                case "ALL":
                    for (String type : vehicleTypesArray) {
                        log.info("Najszybszy pojazd w kategorii " + type + ":\n" + getFastestVehicle(list, type) + " km/h");
                    }
                    log.info("\n");
                    break;
                case "EXIT":
                    log.info("Exiting application.");
                    System.exit(0);
                default:
                    log.info("Podaj prawidłową opcję!");
                    log.info("\n");
            }
        }
    }

    //zwraca obiekt typu Vehicle dla podanej listy obiektów Vehicle i zadanego typu Vehicle

    /**
     * Find the fastest vehicle. Use stream with predicate and comparator.
     * @param list Arraylist of Vehicles objects
     * @param vehicleType  type of vehicle
     * @return vehicle type object
     */
    public static @NotNull Vehicle getFastestVehicle(ArrayList<Vehicle> list, String vehicleType) {
        Predicate<Vehicle> predicate = vehicle -> vehicle.getVehicleType().equalsIgnoreCase(vehicleType);
        // Compare two int object
        Comparator<Vehicle> comparator = Comparator.comparingInt(Vehicle::getTopSpeed);
        return list.stream().filter(predicate).max(comparator).get();
    }
}
