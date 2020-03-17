public class Grade {
    private int[] gradeCollected = new int[5];

    public void setStudentGrade(int[] grade) {
        gradeCollected = grade;
    }

    public int[] getStudentGrade() {
        return gradeCollected;
    }

    public int AddGrade() {
        int total = 0;
        for (int i : gradeCollected) {
            total = total + i;
        }
        return total;
    }

    public double averageGrade() {
        double average = AddGrade() / gradeCollected.length;

        return average;
    }

    public int maximumGrade() {
        int maximumGrade = gradeCollected[0];
        for (int grade : gradeCollected) {
            if (grade > maximumGrade) {
                maximumGrade = grade;
            }

        }
        return maximumGrade;
    }

    public int minimumGrade() {
        int minimumGrade = gradeCollected[0];
        for (int grade : gradeCollected) {
            if (grade < minimumGrade) {
                minimumGrade = grade;
            }

        }
        return minimumGrade;
    }
    public void displayArray(){
        for (int index= 0; index<gradeCollected.length; index++){
            System.out.println(gradeCollected[index]);
        }

    }

}
