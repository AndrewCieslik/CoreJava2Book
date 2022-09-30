import javax.swing.*;
import java.math.BigInteger;

public class BigDecimal {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("How many numbers you need to choose?");
        int k = Integer.parseInt(input);
        /*difference between parseInt and valueOf. parseInt takes only String as a parameter
        * and returns primitive int value.
        * valueOf take a String as well as an integer as parameter and returns Integer object.
        */
        input = JOptionPane.showInputDialog("How many numbers are in the pool?");
        int n = Integer.parseInt(input);

        /*
        n * (n - 1) * (n - 2) * ... * (n - k +1)
        -----------------------------------------
        1 * 2 * 3 * 4 * 5 ... * k
        */

        BigInteger chanceInLottery = BigInteger.valueOf(1);
        for(int i = 1; i <= k; i ++) {
            chanceInLottery = chanceInLottery
                    .multiply(BigInteger.valueOf(n - 1 + 1))
                    .divide(BigInteger.valueOf(i));
        }
        System.out.println("Your chance is 1 to : " + chanceInLottery + ". Good luck!");
        System.exit(0);
    }
}
