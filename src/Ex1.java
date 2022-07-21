import java.io.*;

public class Ex1 {
    public static void main(String[] args) throws IOException {


        File result = new File("C:/Users/1/Desktop/result.txt");
        FileWriter fileWriter = new FileWriter("C:/Users/1/Desktop/result.txt");

        int[] numbers = {3, 30, 7, 8, 11, 26, 14, 5};

        //average of numbers
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

        }
        double avg = sum / numbers.length;

        System.out.println("Average of the elements of the array is: " + avg);

        //max element
        int maxElem = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > maxElem) {

                maxElem = numbers[i];

            }
        }
        System.out.println("The maximum value is: " + maxElem);

        //min element
        int minElem = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < minElem) {

                minElem = numbers[i];

            }
        }
        System.out.println("The minimum value is: " + minElem);

        fileWriter.write("Average of the elements of the array is: " + avg + "       ");
        fileWriter.write("The maximum value is: " + maxElem + "       ");
        fileWriter.write("The minimum value is: " + minElem + "       ");
        fileWriter.close();
    }
}
