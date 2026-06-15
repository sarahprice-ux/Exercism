public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double carsProducedPerHour = 0;
        if (speed <= 4) {
            carsProducedPerHour = (speed * 221);
        } else if (speed >= 5 && speed <= 8) {
            carsProducedPerHour = (speed * 221 * 0.9);
        } else if (speed == 9) {
            carsProducedPerHour = (speed * 221 * 0.8);
        } else {
            carsProducedPerHour = (speed * 221 * 0.77);
        }
        return carsProducedPerHour;

    }


    public int workingItemsPerMinute(int speed) {
         double workingItemsPerMinute = (productionRatePerHour(speed) / 60);
        return (int) workingItemsPerMinute;
    }

}