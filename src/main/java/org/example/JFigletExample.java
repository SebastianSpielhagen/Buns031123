package org.example;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class JFigletExample {
    public static void main(String[] args) throws IOException {

        String text = "Hello World";

        String asciiArt = FigletFont.convertOneLine(text);
        System.out.println(asciiArt);
    }
}