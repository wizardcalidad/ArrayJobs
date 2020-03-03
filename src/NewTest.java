import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NewTest {
    String hotBabe;
    public Object ArraysTest;

//    @Test
//    void arrayLengthTest() {
//        int[] tallMen = new int[7];
//        int[] shortMen = {2, 1, 4, 3, 2};
//
//        assertEquals(7, tallMen.length);
//        assertEquals(6, tallMen.length - 1);
//
//        assertEquals(5, shortMen.length);
//
//        for (int i = 0; i < shortMen.length; i++) {
//            System.out.println("Index" + i + "=" + shortMen[i]);
//        }
//
//        System.out.println();
//        System.out.println();
//    }
//
////    @Test
////    void exceptionTest(){
////        String[] semicolonWomenInTech = {"Teni","Cynthia","Esther","Debbie", "Nonye", "Jeminat", "Oroma", "Evangel","Tope"};
////        try {
////            assertTrue(semicolonWomenInTech.length==9);
////            hotBabe.strip();
////            String badBabe = semicolonWomenInTech[10];
////        }catch(NullPointerException ex){
////            System.out.println("An null pointer exception is being handled...");
////            System.out.println(ex.getMessage());
////        }
////    }
////    @Test
////    void enhancedFortest(){
////        String[] semicolonWomenInTech = {"Teni","Cynthia","Esther","Debbie", "Nonye", "Jeminat", "Oroma", "Evangel","Tope"};
////        for (String techBabe : semicolonWomenInTech){
////            System.out.println(techBabe);
////        }
//
////    @Test
////    void passToMethodTest() {
////        String[] semicolonWomenInTech = {"Teni", "Cynthia", "Esther", "Debbie", "Nonye", "Jeminat", "Oroma", "Evangel", "Tope"};
////        String womanInTech = NewTest.getTechBabe(semicolonWomenInTech);
////        assertEquals("Teni", womanInTech);
////    }
//
////    public static String getTechBabe(String[] womenInTech) {
////        String result = womenInTech[0];
////        System.out.println("Woman in last index position is " + womenInTech[womenInTech.length]);
////    }
//
//    @Test
//    void multidimensionalArry() {
//        String [][] cohortAndsPriests = new String[4][2];
//
//        cohortAndsPriests[0][0] = "Pastor Brown";
//        cohortAndsPriests[0][1] = "Dipo";
//        cohortAndsPriests[1][0] = "Kayode";
//        cohortAndsPriests[1][1] = "Moby";
//        cohortAndsPriests[2][0] = "Tega";
//        cohortAndsPriests[2][1] = "Oroma";
//        cohortAndsPriests[3][0] = "Deborah";
//        cohortAndsPriests[3][1] = "Victor";
//
//        for (int i = 0; i< cohortAndsPriests.length;i++){
//            for (int j =0; j<cohortAndsPriests[i].length;j++){
//                System.out.println(cohortAndsPriests[i][j]);
//            }
//        }
//        System.out.println();
//        for(String[] cohortPriests : cohortAndsPriests){
//            for (String priest : cohortPriests){
//                System.out.println(priest);
//            }
//        }
//    }
//
//
//
//    @BeforeEach
//    void setUp() {
//    }

    @Test
    void arrayListTest() {
        ArrayList<String> semicolonWomenInTech = new ArrayList<>();
        semicolonWomenInTech.add("Oroma");
        semicolonWomenInTech.add("Teni");
        assertEquals(2,semicolonWomenInTech.size());
        semicolonWomenInTech.remove(0);
//        assertEquals(2,semicolonWomenInTech.size());
//        semicolonWomenInTech.remove(1);
    }
}