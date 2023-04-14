import java.util.Scanner;

public class greatestCimmonDivisor {
    // Ahmed Ali RTT-57 4/14/23
    public static void main(String[] args) {
        int n1;
        int n2;

        System.out.println("Enter two integers:");

        Scanner sc = new Scanner(System.in);
        n1= sc.nextInt();
        n2= sc.nextInt();
        int k = 1;
        int gcd= 0;

        while (k < n1 | k<n2){
            if ((n1 % k == 0) & (n2 % k==0)){
                gcd=k;
            }
            k++;
        }
        System.out.println("The gcd is "+gcd);


    }
}
