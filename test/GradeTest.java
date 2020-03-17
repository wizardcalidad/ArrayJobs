import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    Grade studentGrade;
    @BeforeEach
    void setUp() {
        studentGrade =  new Grade();
        int[] grade = {20, 30, 35, 25, 40};
        studentGrade.setStudentGrade(grade);

    }
    @Test
    void arrayCanTakeGradeTest(){
        assertEquals(20,studentGrade.getStudentGrade()[0]);
    }

    @Test
    void addGradeTest(){
        assertEquals(150, studentGrade.AddGrade());
    }

    @Test
    void averageGradeTest(){
        assertEquals(30,studentGrade.averageGrade());
    }

    @Test
    void maximumGradeTest(){
        assertEquals(40, studentGrade.maximumGrade());
    }

    @Test
    void minimumGradeTest(){
        assertEquals(20,studentGrade.minimumGrade());
    }

}