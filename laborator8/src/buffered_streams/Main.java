package buffered_streams;

import java.io.*;

public class Main {
    public static void readUsingBufferedInputStream() {
        try (BufferedInputStream bufferedInputStream = new
                BufferedInputStream(
                new FileInputStream("input.txt"))) {
            while (bufferedInputStream.available() > 0) {
                int read = bufferedInputStream.read();
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeUsingBufferedOutputStream(String text) {
        try (BufferedOutputStream output = new BufferedOutputStream(
                new FileOutputStream("output.txt"))) {
            output.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readUsingBufferedWriter() {
        try (BufferedReader buffer = new BufferedReader(new
                FileReader("input.txt"))) {
            String line = buffer.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeUsingBufferedWriter(String text) {
        try (BufferedWriter buffer = new BufferedWriter(new
                FileWriter("output.txt"))) {
            buffer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
