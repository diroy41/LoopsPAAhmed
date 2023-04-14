import java.sql.Array;
import java.util.Arrays;

public class multiplicationTable {
    // Ahmed Ali RTT-57 4/14/23
    public static void main(String[] args) {

        int[] row;
        int column = 12;

        for (int i = 1; i <= 12; i++) {

            for (int j = 1; j <= 12; j++) {
                int result = j*i;
                System.out.print("  " + result + "  ");
            }
            System.out.println();
        }

    }
}
