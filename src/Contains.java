import java.util.Scanner;
public class Contains {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arrayIn;
        arrayIn = new int[10];
        System.out.println(contains(arrayIn,7));
    }
    public static boolean contains(int[] arrayIn, int valueIn){
        valueIn=7;

        for (int currentElement : arrayIn){

            System.out.println("Enter value for your array");
            arrayIn[currentElement] = sc.nextInt();

            if (currentElement==valueIn){

                return true;
            }
        }
        return false;
    }
}
