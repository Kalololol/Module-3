import java.util.HashMap;

public class CountWords {
    //Liczenie słów w tekście: Napisz metodę, która przyjmując String, zwróci HashMapę, w której kluczem jest słowo, a wartością ilość wystąpień w tekście:
    //public HashMap<String, Integer> countWords(String text)
    //Jako tekst wykorzystaj wygenerowany tekst z https://www.lipsum.com/


    public HashMap<String, Integer> countWords(String text){
        HashMap<String, Integer> result = new HashMap<>();
        int sum = 0;
        String inputWords = "Lorem Ipsum is simply dummy text of the printing Lorem Ipsum Lorem Ipsum and typesetting industry. Lorem Ipsum has been the industry";
        String[] arrayWords = inputWords.split(" ");
        for(int i = 0; i < arrayWords.length; i++){
            if(text.equals(arrayWords[i])){
                sum++;
            }
        }
        result.put(text, sum );
        return result;
    }
    public HashMap<String, Integer> countWords1(String text){
        HashMap<String, Integer> result = new HashMap<>();
        String removeChars = "[,<.>/?;:'\"\\[\\]}{]";
        String textFormat = text.replaceAll(removeChars, "");
        String[] arrayWords = textFormat.split(" ");

        for(String word : arrayWords){
            if(result.containsKey(word)){
                int sum = result.get(word) + 1;
                result.replace(word, sum);
            }
            else{
                result.put(word, 1 );
            }
        }
        return result;
    }
}
