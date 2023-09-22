import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySumTest {
    private ArraySum arraySumTest = new ArraySum();
    @Test
    public void testSumArrayValueNine(){
        int[] numbers = {1, 3, 5};
        Assertions.assertEquals(9, arraySumTest.sumArray(numbers));

    }
    @Test
    public void testSumArrayNegativeNumbers(){
        int[] numbers = {-1, -3};
        Assertions.assertEquals(-4,arraySumTest.sumArray(numbers));

    }
}
