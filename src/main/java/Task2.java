import java.io.*;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        File directory = new File("folderTask");
        directory.mkdir();
        File file = new File(directory, "names.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            //reading by array
            char[] array = new char[128];

            //quantity of symbols which were read
            int count = reader.read(array);

            StringBuilder result = new StringBuilder();

            while (count > 0) {
                result.append(new String(array, 0, count));
                count = reader.read(array);
            }

            String[] names = result.toString().split(" ");
            Arrays.stream(names)
                    .filter(name ->  name.startsWith("A"))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
