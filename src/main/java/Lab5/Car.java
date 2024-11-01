package Lab5;

public class Car extends Vehicle implements Vehicle.Repairable {
    public Car(String modelName){
        super(modelName);
    }

    public Car(String modelName, int mileage, int health){
        super(modelName, mileage, health);
    }

    @Override
    public String repair(){
        return "Car Repair.. Engine tuned and oil changed for " + getModelName();
    }

    @Override
    public String service(){
        return "Car.. Checking engine and changing oil for " + getModelName() + " M:" + getMileage() + " Hp:" + getHealth();
    }

    @Override
    public int expectedLifespan(){
        return 150000;
    }

    public void drive(int miles){
        setMileage(getMileage() + miles);
        setHealth(getHealth() - (miles / 100));
        if (getHealth() < 30) {
            int reducedLifespan = expectedLifespan() - 10000;
            System.out.println("Lifespan reduced due to low health (Org: 150,000) " + reducedLifespan);
        }
    }
}
