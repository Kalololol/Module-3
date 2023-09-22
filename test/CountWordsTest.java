import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class CountWordsTest {
    private CountWords countWords = new CountWords();
    @Test
    public void testCountWords(){
        String word = "Ala ma kota, kota ma Ala";
        HashMap<String, Integer> resultTest = new HashMap<>();
        resultTest.put("Ala", 2);
        resultTest.put("ma", 2);
        resultTest.put("kota", 2);

        Assertions.assertEquals(resultTest, countWords.countWords1(word));
    }
}
