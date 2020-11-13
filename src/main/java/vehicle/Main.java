package vehicle;


import org.apache.log4j.*;

import java.util.ArrayList;

public class Main {
    private final static Logger log = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        log.info("Entering application.");

        String[][] input = {{"car", "BMW", "245"}, {"car", "Audi", "265"},
                {"ship", "Solarsky", "85"}, {"ship", "Fox-Boat", "65"},
                {"bike", "Kawasaki", "299"}, {"bike", "MTT", "364"},
                {"plane", "Airbus", "1000"}, {"plane", "Boeing", "1045"}
        };
        ArrayList<Vehicle> list = new ArrayList<>();
        for (String[] row : input) {
            list.add(VehicleStaticFactory
                    .make(row[0], row[1], Integer.parseInt(row[2])));
        }
    }
}
