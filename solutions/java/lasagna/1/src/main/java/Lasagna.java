public class Lasagna {

    public int expectedMinutesInOven() {
         int  expectedMinutesInOven = 40;
        return expectedMinutesInOven;
    }



    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int minutesInOven) {

            int remainingMinutesInOven = (expectedMinutesInOven() - minutesInOven);

        return remainingMinutesInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int amountLayers) {

        int TimePerLayer;
        TimePerLayer = 2;

        int preparationTimeInMinutes = (amountLayers * TimePerLayer);
        return preparationTimeInMinutes;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int amountLayers, int timeInOven) {
      int  totalTimeInMinutes = (preparationTimeInMinutes(amountLayers) + timeInOven);
        return totalTimeInMinutes;
    }
}
