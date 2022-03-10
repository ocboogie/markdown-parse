
// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.Link;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;

public class MarkdownParse {
    static class LinkVisitor extends AbstractVisitor {
        ArrayList<String> links;

        LinkVisitor() {
            this.links = new ArrayList<>();
        }

        @Override
        public void visit(Link link) {
            this.links.add(link.getDestination());

            visitChildren(link);
        }
    }

    public static ArrayList<String> getLinks(String markdown) {
        Parser parser = Parser.builder().build();
        Node node = parser.parse(markdown);

        LinkVisitor visitor = new LinkVisitor();
        node.accept(visitor);
        return visitor.links;
    }

    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String contents = Files.readString(fileName);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
}