import java.util.Scanner;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] a2DArray = {{11,-25,4,77},{-21,55,43,11}};

        System.out.println(a2DArray[0][1]);
        double[][] temperature;
        temperature = new double [4][7];
        for (int week =1; week <=temperature.length; week++){
            for (int day=1; day<=temperature[0].length; day++){
                System.out.println("Enter temperature for week " + week + "and day" + day);
                temperature[week-1][day-1] = sc.nextDouble();
            }
        }
    }
}
