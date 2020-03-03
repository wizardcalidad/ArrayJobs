import java.util.Scanner;
import java.util.Arrays;
public class TemperatureCollector {
   static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
         double[] temp;
        System.out.println("How many temperature ot collect?: ");
        int size = keyboard.nextInt();
        temp = new double[size];

        fillArray(temp);
        double total = sum(temp);
        System.out.println("Sum of array values = " + total);
        double max = max(temp);
        System.out.println("Maximum array value = " + max);
        double min = min(temp);
        System.out.println("Minimum array value =" + min);

        System.out.print ("Enter value to find: ");
        int value = keyboard.nextInt();
        boolean found = contains(temp, value);
        if (found)
        {
            System.out.println(value + " is in the array");
        }
        else
        {
            System.out.println(value + " is not in the array");
        }
        System.out.print ("Enter value to find: ");
        int item = keyboard.nextInt();
        int index = search(temp, item);
        if (index == -999) // indicates value not found
        {
            System.out.println ("This value is not in the array");
        }
        else
        {
            System.out.println ("This value is at array index " + index);
        }
    }

    private static int search(double[] temp, int item) {
        for (int index =0; index <temp.length; index++){
            if ( temp[index]==item){
                return index;
            }
        }
        return -999;
    }

    private static boolean contains(double[] temp, int value) {
        for (double currentValue : temp){
            if (currentValue==value){
                return true;
            }
        }
        return false;
    }

    private static double min(double[] temp) {
        double min = temp[0];
        for (int index =0; index<temp.length; index++){
            if (temp[index]<min){
                 min = temp[index];
            }
        }
        return min;
    }

    private static double max(double[] temp) {
        double max = temp[0];
        for (int index =1; index<temp.length;index++){
            if (temp[index]>max){
                max = temp[index];
            }
        }
        return max;
    }

    private static double sum(double[] temp) {
       double total = 0;
       for (double currentVal : temp){
           total = total + currentVal;
       }
       return total;
    }

    private static void fillArray(double[] temp) {
        int index=0;
        for ( index =0; index<temp.length; index++) {
            System.out.println("Enter the value for the temperature: ");
            temp[index] = keyboard.nextInt();
        }
        System.out.println(Arrays.toString(temp));

    }

}
