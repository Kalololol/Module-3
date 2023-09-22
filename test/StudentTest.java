import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    private Student student = new Student();

    @Test
    public void testSortedListNotEquals(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, 190, "Jan", "Kowalski"));
        students.add(new Student(26, 170, "Henryk", "Burakowski"));
        students.add(new Student(21, 190, "Jan", "Kowalski"));
        students.add(new Student(29, 190, "Jan", "Kowalski"));
        students.add(new Student(20, 190, "Jan", "Kowalski"));
        List<Student> afterSort = new ArrayList<>();
        afterSort.addAll(students);
        Collections.sort(afterSort);

        Assertions.assertNotEquals(students, afterSort);
    }
    @Test
    public void testSortedList(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, 190, "Jan", "Kowalski"));
        students.add(new Student(26, 170, "Henryk", "Burakowski"));
        students.add(new Student(21, 190, "Jan", "Kowalski"));
        students.add(new Student(29, 190, "Jan", "Kowalski"));
        students.add(new Student(20, 190, "Jan", "Kowalski"));
        List<Student> afterSort = new ArrayList<>();
        afterSort.addAll(students);

        Collections.sort(afterSort);

        Assertions.assertEquals(students, afterSort);
    }


}
