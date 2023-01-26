package seminar_02;

import java.io.*;

public class Task_02 {
    public static void main(String[] args) {
        String str = "TEST";
        int count = 100;
        writesToFileManyTimes(str, count);
    }

    private static void writesToFileManyTimes(String str, int count) {
        str += "\n";
        try {
            File file = new File("C:\\Users\\andre\\IdeaProjects\\homework\\src\\main\\java\\seminar_02\\file.txt");
            FileOutputStream fos = new FileOutputStream(file, true);
            fos.write(str.toString().repeat(count).getBytes());

            fos.close();
        }

        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
