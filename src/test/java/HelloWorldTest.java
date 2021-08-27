import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloAm () {
        //Arrange
        HelloWorld helloWorld = new HelloWorld();

        //Action
        String actualResult = helloWorld.greeting("Am");

        //Assert
        assertEquals("Hello Am", actualResult);
    }
}
