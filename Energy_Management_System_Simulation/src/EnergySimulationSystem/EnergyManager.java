package EnergySimulationSystem;

import java.util.ArrayList;
import java.util.List;

public class EnergyManager {
    private List<Components> components;
    public EnergyManager() {
        components = new ArrayList <>();
    }


    public void addComponent(Components component ) {
        components.add(component);
    }

    public void removeComponent(Components component) {
        components.remove(component);
    }

    public int calculateTotalCapacity() {
        int totalCapacity = 0;
        for (Components component : components) {
            if (component instanceof Battery) {
                totalCapacity += ((Battery) component).getCapacity();
            }
        }
        return totalCapacity;
    }
}

