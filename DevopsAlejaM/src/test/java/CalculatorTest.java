import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static  org.hamcrest.MatcherAssert.*;
import static  org.hamcrest.CoreMatchers.*;
public class CalculatorTest {

    private final Calculator calculator =  new Calculator();
    @Test
    public  void testMul(){
        int result =calculator.multiplication(2,3);
        assertThat(result, is(equalTo(6)));
        System.out.println(result);

    }

    @Test
    public  void testdiv(){
        int result2 =calculator.division(4,2);
        assertThat(result2, is(equalTo(2)));
        System.out.println(result2);


    }
}
