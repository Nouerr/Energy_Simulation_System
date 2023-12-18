package EnergySimulationSystem;

class SolarPanel extends Components {
    private int Power;
    public SolarPanel (int Power){
        this.Power= Power;

    }
    String getDetails(){
        return "Solar Panel: **power :" + Power + "kWh";
    }
    public int generatePower(){
        return  Power;
    }
}
