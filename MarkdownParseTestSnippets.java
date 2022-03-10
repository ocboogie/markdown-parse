import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class MarkdownParseTestSnippets {
    public static void assertLinks(List<String> expectedLinks, String fileName) throws IOException {
        Path filePath = Path.of(fileName);
        String contents = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(expectedLinks, links);
    }

    @Test
    public void testSnippet1() throws IOException {
        assertLinks(List.of("'google.com", "google.com", "ucsd.edu"), "testCases\\snippet1.md");
    }

    @Test
    public void testSnippet2() throws IOException {
        assertLinks(List.of("a.com", "a.com(())", "example.com"), "testCases\\snippet2.md");
    }

    @Test
    public void testSnippet3() throws IOException {
        assertLinks(List.of("https://www.twitter.com", "https://ucsd-cse15l-w22.github.io/", "https://cse.ucsd.edu/"), "testCases\\snippet3.md");
    }
}
