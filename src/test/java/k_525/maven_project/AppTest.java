package k_525.maven_project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testHelloWorld() {

        // Capture console output
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        System.setOut(new PrintStream(output));

        // Run the main method
        App.main(new String[] {});

        // Restore console output
        System.setOut(originalOut);

        // Check the output
        assertEquals("Hello World", output.toString().trim());
    }
}