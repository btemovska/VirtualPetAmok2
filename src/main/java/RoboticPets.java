public abstract class RoboticPets extends Pets {

    private int maintenance;

    public RoboticPets(String petName, String petDescription, int happiness, int health, int maintenance) {
        super(petName, petDescription, happiness, health);
        this.maintenance = maintenance;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void oilRoboPets(int amount) {
        maintenance += amount;
        happiness += 1;
        health += 2;
    }

    @Override
    public String toString() {
        return petName + "\t" + petDescription + "\t\t" + happiness + "\t\t" + health
                + "\t\t\t\t\t\t\t\t" + maintenance;
    }
}
