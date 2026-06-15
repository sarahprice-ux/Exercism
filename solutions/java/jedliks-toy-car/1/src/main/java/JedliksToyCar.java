public class JedliksToyCar {
    int distance = 0;
    int batteryPercent = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        //int distance = 0;
        return "Driven " + distance + " meters";

    }

    public String batteryDisplay() {
        if (batteryPercent <= 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercent + "%";
    }

    public String drive() {
        JedliksToyCar newDrive = new JedliksToyCar();
        if (!(batteryPercent <= 0)) {

            newDrive.batteryPercent = batteryPercent -= 1;
            newDrive.distance = distance += 20;
            return "Driven " + newDrive.distance + "meters";
        } return "Driven " + newDrive.distance + "meters";

    }
}