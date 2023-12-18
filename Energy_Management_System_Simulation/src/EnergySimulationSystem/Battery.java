package EnergySimulationSystem;

class Battery extends Components {
    private int capacity;
    public Battery (int capacity){
        this.capacity= capacity;

    }
    String getDetails(){
        return "Battery: **capacity:" + capacity + "kWh";
    }
    public int getCapacity(){
        return  capacity;
    }

}
