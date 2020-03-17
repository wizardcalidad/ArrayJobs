public class Double {
    public static void main(String[] args) {
        int[] someArray = {2,5,1,9,11};
        //int doubleSomeArray =1;
//        for(int i=0; i<someArray.length;i++){
//          int  doubleSomeArray = 2 * (someArray[i]);
//
//
//            System.out.println("the double value of"+ i + " = "+ doubleSomeArray);
//        }
        for (int values : someArray){
            if (values >2) {
                System.out.println(values);
            }
        }
    }
}
