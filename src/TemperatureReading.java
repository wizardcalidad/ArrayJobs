
import java.util.Arrays;
import java.util.Scanner;

public class TemperatureReading {
    public static void main(String[] args) {
      int[] temp =new int [5];
      fillArray(temp);
      wasHot(temp);
    }

    public static void fillArray(int [] temp){
        Scanner sc = new Scanner(System.in);
        int index =0;
        for (index=0; index<temp.length;index++){
            System.out.println("enter todays temperature: ");
            temp[index] = sc.nextInt();
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void wasHot(int[]temp){
        int index=0;
        for (int overEighteen : temp){
            if (overEighteen > 18){
                System.out.println(overEighteen);
            }
            else{}
        }
    }
}
