public class ArraySum {
    //Sumowanie tablicy: Stwórz metodę, która przyjmie jako argument tablicę liczb naturalnych i zsumuje jej wartości:
    //public int sumArray(int[] numbers)

    public int sumArray(int[] numbers){
        int result = 0;
        for(int num : numbers){
            result += num;
        }
        return result;
    }
}
