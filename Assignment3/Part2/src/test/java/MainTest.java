import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import parser.Parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Parser parser;
    private File print_stream;
    private File true_output;

    @BeforeEach
    void initialize() throws FileNotFoundException {
        this.parser = new Parser();
        this.print_stream = new File("src/main/resources/print.txt");
        this.true_output = new File( "src/main/resources/expected_output.txt");

        PrintStream print = new PrintStream(print_stream);
        System.setOut(print);
    }

    @Test
    void test1() throws IOException {
            // start parsing
            parser.startParse(new Scanner(new File("src/main/resources/code2")));
        assertEquals(FileUtils.readLines(true_output), FileUtils.readLines(print_stream));
        }
    }