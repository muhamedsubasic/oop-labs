package Lab5;

public class Truck extends Vehicle implements Vehicle.Repairable {
    public Truck(String modelName) {
        super(modelName);
    }

    public Truck(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String repair(){
        return "Engine overhauled and tires replaced for " + getModelName();
    }

    @Override
    public String service(){
        return "Truck.. Checking engine and changing oil for " + getModelName() + " M:" + getMileage() + " Hp:" + getHealth();
    }

    @Override
    public int expectedLifespan(){
        return 300000;
    }

    public void haul(int loadWeight){
        if (loadWeight > 5000){
            setHealth(getHealth() - 50);
        }
        if (getHealth() < 30){
            int reducedLifespan = expectedLifespan() - 20000;
            System.out.println("Reduced Lifespan due to heavy load (Org: 300,000) " + reducedLifespan);
        }
    }
}

