import java.util.ArrayList;

public class TodoList {
    //TodoList: Stwórz klasę TodoList. Powinna zawierać konstruktor bez parametrów i następujące metody:
    //public void add(String task) - Dodaj zadanie do listy;
    //public void print() - Wydrukuj zadania z listy wraz z ich numerem na liście;
    //public void remove(int number) - Usuń zadanie z podanego numeru.

    private ArrayList<String> tasks = new ArrayList();
    public TodoList(){}
    public void add(String task){
        tasks.add(task);
    }
//    public void print(){
//        int i = 0;
//        for(String task : tasks){
//            System.out.println("Nr zadania na liście " + i );
//            System.out.println("Treść zadania: \n " + task );
//            i++;
//        }
//    }
    public void print(){
        for(int i = 0; i < tasks.size(); i++){
            System.out.println(i);
            System.out.println(tasks.get(i));
        }
    }
    public void remove(int number){
        tasks.remove(number);
    }
}
