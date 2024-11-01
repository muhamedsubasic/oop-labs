package Lab5;

public abstract class Vehicle {
    private String modelName;
    private int mileage;
    private int health;

    public Vehicle(String modelName) {
        this.modelName = modelName;
        this.mileage = 0;
        this.health = 100;
    }

    public Vehicle(String modelName, int mileage, int health){
        this.modelName = modelName;
        this.mileage = mileage;
        this.health = health;
    }

    public String getModelName(){
        return this.modelName;
    }

    public int getMileage(){
        return this.mileage;
    }

    public void setMileage(int mile){
        if(mile >= this.mileage){
            this.mileage = mile;
        }
    }

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int newHealth){
        this.health = newHealth;
    }

    public abstract String service();
    public abstract int expectedLifespan();

    public boolean needsMaintenance(){
        return this.health < 70;
    }

    public int calculateRemainingLifespan(){
        int remainingLifespan = this.expectedLifespan() - this.mileage;
        if (this.health < 50) {
            remainingLifespan = (remainingLifespan * this.health) / 100;
        }
        return remainingLifespan;
    }

    public void simulateYear(){
        if (this.mileage > this.expectedLifespan() / 2){
            this.setHealth(this.getHealth() - 5);
        }
    }

    public static void performMaintenance(Vehicle vehicle){
        if (vehicle instanceof Car){
            Car car = (Car) vehicle;
            System.out.println(car.repair());
            car.drive(200);
        } else if (vehicle instanceof Truck){
            Truck truck = (Truck) vehicle;
            System.out.println(truck.repair());
            truck.haul(7500);
        } else if (vehicle instanceof Motorcycle){
            Motorcycle motorcycle = (Motorcycle) vehicle;
            motorcycle.race(100);
        }
    }

    interface Repairable {
        String repair();
    }
}

