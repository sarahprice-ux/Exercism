import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] LastWeek = new int[] {0, 2, 5, 3, 7, 8,4};
        for (int i =0; i < 7; i++){
            System.out.println(LastWeek[i]);
        }

        return LastWeek;
    }

    public int getToday() {
        return birdsPerDay[6];

    }

    public int incrementTodaysCount() {
        birdsPerDay[6] = birdsPerDay[6] + 1;
        return birdsPerDay[6];

    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < birdsPerDay.length; i++) {

            if (birdsPerDay[i] == 0) {
                return true;
            }
        } return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < limit; i++){
            total += birdsPerDay[i];
         } return total;
    }


    public int getBusyDays() {
        int busyDay = 0;

        for(int i = 0; i < birdsPerDay.length; i++) {

            if (birdsPerDay[i] >= 5) {
                busyDay = i++;
            }
        } return  busyDay;
    }}
