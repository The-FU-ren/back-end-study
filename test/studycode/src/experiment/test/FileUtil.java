package experiment.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.StringJoiner;

public class FileUtil {

  public String readFile(String fileName) {
    FileReader reader = null;
    try {
      reader = new FileReader(fileName);
      BufferedReader bufferedReader = new BufferedReader(reader);
      String line = bufferedReader.readLine();
      StringJoiner content = new StringJoiner("\n");
      while (line != null) {
        content.add(line);
        line = bufferedReader.readLine();
      }
      return content.toString();
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public void writeFile(String fileName, String content) {
    FileWriter writer = null;
    try {
      writer = new FileWriter(fileName);
      writer.write(content);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
