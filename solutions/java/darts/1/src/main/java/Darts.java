class Darts {
    int score(double xOfDart, double yOfDart) {

        double distanceSquared = (xOfDart * xOfDart) + (yOfDart * yOfDart);
        double innerCircle = 1 * 1;
        double middile = 5 * 5;
        double outer = 10 * 10;

        if (distanceSquared <= innerCircle){
            return 10;
        } else if (distanceSquared <= middile){
            return 5;
        } else if (distanceSquared <= outer){
            return 1;
        } else return 0;










    }
}
