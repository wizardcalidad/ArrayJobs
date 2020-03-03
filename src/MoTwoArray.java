public class MoTwoArray {
    public static void main(String[] args) {
        int [] a = new int[20];
        for (int i =0; i < a.length; i++){
           if (i%2 ==0) {
               a[i] = 2;
           }
            System.out.println(a[i]);
        }

    }
}
