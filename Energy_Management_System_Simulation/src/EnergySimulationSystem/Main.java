package EnergySimulationSystem;

public class Main {
    public static void main(String[] args) {
            Battery battery1 = new Battery(12);
            Battery battery2 = new Battery(10);
            Battery battery3 = new Battery(30);
            SolarPanel solarPanel1 = new SolarPanel(2000);

            EnergyManager energyManager1 = new EnergyManager();

            energyManager1.addComponent(battery1);
            energyManager1.addComponent(battery2);
            energyManager1.addComponent(solarPanel1);

            System.out.println("Total Capacity: " + energyManager1.calculateTotalCapacity() + " kWh");
        }
    }
