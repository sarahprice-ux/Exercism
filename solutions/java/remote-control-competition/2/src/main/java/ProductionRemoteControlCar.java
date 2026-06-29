class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int distance = 0;
    int victories = 0;


    public void drive() {

        distance += 10;
    }


    public int getDistanceTravelled() {
        return this.distance;

    }

    public int getNumberOfVictories() {

        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return o.victories - victories;

    }
}



