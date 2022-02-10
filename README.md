# markdown-parse

## Compiling, Testing, and Running

#### Unix (Mac or Linux)

```bash
# Compile
$ javac -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:. MarkdownParseTest.java

# Run tests
$ java -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore MarkdownParseTest

# Run MarkdownParse
$ java -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:. MarkdownParse test-file.md
```

#### Windows

```bash
# Compile
$ javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java

# Run tests
$ java -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest

# Run MarkdownParse
$ java -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParse test-file.md
```
