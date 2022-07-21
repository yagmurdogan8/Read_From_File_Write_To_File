import java.io.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException {

        //C:/Users/1/IdeaProjects/LabHW10/src/
        File file = new File("C:/Users/1/IdeaProjects/LabHW10/src/input.txt");
        Scanner scan = new Scanner(file);

        int first = Integer.parseInt(scan.nextLine());
        int sum = 0;

        try {
            while (scan.hasNextLine()) {

                int num = Integer.parseInt(scan.nextLine());
                sum += num;

            }

            double doubleSum = (double) sum;
            double doubleFirst = (double) first;
            double avg = doubleSum / doubleFirst;
            System.out.println("Average of the numbers in the text file is: " + avg);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

