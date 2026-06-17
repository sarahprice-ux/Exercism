class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven = 0;
    private int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
       this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain(){
        return batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
       return distanceDriven;
    }

    public void drive() {
if (battery >= batteryDrain) {
    distanceDriven += speed;
    battery -= batteryDrain;
}

    }

    public static NeedForSpeed nitro() {

        NeedForSpeed car = new NeedForSpeed(50,4);

        return car;
    }
}

class RaceTrack {

    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;

    }



    public boolean canFinishRace(NeedForSpeed car) {
        NeedForSpeed testCar = new NeedForSpeed(car.getSpeed(), car.getBatteryDrain());

        while (!testCar.batteryDrained()) {
            testCar.drive();
        }

        return testCar.distanceDriven() >= this.distance;
    }
    }

