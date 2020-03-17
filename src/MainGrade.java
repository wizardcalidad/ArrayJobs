public class MainGrade {
    public static void main(String[] args) {
        Grade studentGrade =  new Grade();
        int[] grade = {20, 30, 35, 25, 40};
        studentGrade.setStudentGrade(grade);


        studentGrade.displayArray();
        System.out.println(studentGrade.AddGrade());
        System.out.println(studentGrade.averageGrade());
        System.out.println(studentGrade.maximumGrade());
        System.out.println(studentGrade.minimumGrade());
    }
}
