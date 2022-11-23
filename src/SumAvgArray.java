public class SumAvgArray {
    public static void main(String[] args) {
        //declare a var to store he sum
        int sum = 0;

        //Array of numbers to sum and avg
        int[] numbers = {11,12,13,14,15,16,17,18,19,20};

        //Sum the numbers
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        //Output the tally
        System.out.println("Sum = " + sum);

        //Declare  a var to hold the average
        double average = (double)sum / numbers.length;

        System.out.println("Average = " + average);
    }
}
