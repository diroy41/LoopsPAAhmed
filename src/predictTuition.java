public class predictTuition {
    // Ahmed Ali RTT-57 4/14/23
    public static void main(String[] args) {
        Double tuition = 10000.0;
        Double increase = 1.07;
        int year=0;

        while(tuition<20000.0){
            tuition = tuition*1.07;
            year++;
        }

        System.out.println("It's going to take "+ year+ " years to double the tuition!");

    }
}
