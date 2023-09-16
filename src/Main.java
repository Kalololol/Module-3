import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        ArraySum arraySum = new ArraySum();
//        int[] numbers = {2, 2, 2, 2};
//        System.out.println(arraySum.sumArray(numbers));

//        TodoList todoList = new TodoList();
//        todoList.add("Pierwszy");
//        todoList.add("Drugi");
//        todoList.add("Trzeci");
//        todoList.add("Czwarty");
//        todoList.print();
//        todoList.remove(1);
//        todoList.print();

//        CountWords countWords = new CountWords();
//        countWords.countWords("Lorem");
//        System.out.println(countWords.countWords("Lorem"));

        List<Student> students = new ArrayList<>();
        students.add(new Student(23, 190, "Jan", "Kowalski"));
        students.add(new Student(26, 170, "Henryk", "Burakowski"));
        students.add(new Student(21, 190, "Jan", "Kowalski"));
        students.add(new Student(29, 190, "Jan", "Kowalski"));
        students.add(new Student(20, 190, "Jan", "Kowalski"));
        System.out.println("przed sortowaniem");
        for (Student s : students){
            System.out.println(s);
        }
        Collections.sort(students);
        System.out.println("Po sortowaniu");
        for (Student s : students){
            System.out.println(s);
        }

    }
}