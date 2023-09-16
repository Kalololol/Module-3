import static java.lang.CharSequence.compare;

public class Student implements Comparable<Student> {
    //Sortowanie listy: Zaimplementuj klasę Student z polami: age, height, name, lastName. Zaimplementuj interfejs Comparable, w taki sposób, aby
    // głównym kryterium było nazwisko, drugim wiek. Stwórz listę 5 obiektów i użyj metody sort.
    private int age;
    private int height;
    private String name;
    private String lastName;

    public Student(int age, int height, String name, String lastName){
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
    }

    public void setAge(int ageParameter){
        age = ageParameter;
    }
    public int getAge(){
        return  age;
    }
    public void setHeight(int heightParameter){
        height = heightParameter;
    }
    public int getHeight(){
        return height;
    }
    public void setName(String nameParameter){
        name = nameParameter;
    }
    public String getName(){
        return name;
    }
    public void setLastName(String lastNameParameter){
        lastName = lastNameParameter;
    }
    public String getLastName(){
        return lastName;
    }

    @Override
    public int compareTo(Student o) {
        int result = this.getLastName().compareTo(o.getLastName());
        if(result != 0){
            return result;
        }else {
            return Integer.compare(getAge(), o.age);
        }
    }
    @Override
    public String toString() {
        return "Student " + getLastName() + " wiek: "  + getAge();
    }
}
