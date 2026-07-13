import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String numberStr = Integer.toString(numberToCheck);
        ArrayList<Integer> numbers = new ArrayList<Integer>();


        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);

            numbers.add(Character.getNumericValue(digitChar));
        }
        int powerNumber = numbers.size();
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += (int) Math.pow(numbers.get(i), powerNumber);
        }
        return sum == numberToCheck;
    }
}

