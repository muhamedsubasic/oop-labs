package Lab5;

public class Motorcycle extends Vehicle {
    public Motorcycle(String modelName){
        super(modelName);
    }

    public Motorcycle(String modelName, int mileage, int health){
        super(modelName, mileage, health);
    }

    @Override
    public String service(){
        return "Motorcycle.. Tuning the engine and lubricating the chain for " + getModelName() + " M:" + getMileage() + " Hp:" + getHealth();
    }

    @Override
    public int expectedLifespan(){
        return 50000;
    }

    public void race(int raceMiles){
        setMileage(getMileage() + raceMiles);
        setHealth(getHealth() - 5);
        if (getHealth() < 40) {
            int reducedLifespan = expectedLifespan() - 5000;
            System.out.println("Lifespan reduced due to strain from racing" + reducedLifespan);
        }
    }
}
