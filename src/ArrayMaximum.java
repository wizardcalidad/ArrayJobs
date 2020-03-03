import java.util.Scanner;
public class ArrayMaximum {
    private static Scanner sc = new Scanner(System.in);
    int[] element = new int[7];
    
    public static int max(int...element) {

        int maximumNum = element[0];

        for (int index = 0; index < element.length; index++) {
            if (element[index] > maximumNum) {
                maximumNum = element[index];
                System.out.println(maximumNum + " is" + "the maximum ");
            }
        }
        return maximumNum;
    }

    public static int sum(int... element){

        int total = 0;
        for (int index =0; index<element.length; index++){

            total = total + element[index];
        }
        return total;
    }

    public static void main(String... args) {
        int[] element = new int[7];
        int index =0;

        for ( index =0; index<element.length; index++) {
            System.out.println("enter another value " + (index + 1));
            element[index] = sc.nextInt();
        }
        System.out.println(element[index]);
        sum(element);
        max(element);
    }

//    static int sumArrray(int[] element)
//    {
//        int total = 0;
//        for (int currentElement : element)
//        {
//            total = total + currentElement;
//        }
//        return total;
//    }
//

}
