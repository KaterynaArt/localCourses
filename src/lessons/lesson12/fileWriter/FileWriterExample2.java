package lessons.lesson12.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {


        public static void main(String[] args) throws IOException {
            FileWriter fileWriter = new FileWriter("src/lessons/lesson12/fileWriter/result.txt");
            fileWriter.write("Hello world");
            fileWriter.close();
        }

    }

