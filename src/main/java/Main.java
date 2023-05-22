import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) {
        File directory = new File("folder1");
        File file = new File("folder1/file1.txt");
        File file2 = new File("folder1/file2.txt");
        File file3 = new File("folder1/file3.txt");

        try {
            directory.mkdir();
            file.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File [] files = directory.listFiles((dir, name) -> name.contains("1"));
        for (File f :files) {
            System.out.println(f.getName());
        }
        //System.out.println(file.getName());
        //System.out.println(file.exists());
        //System.out.println(directory.isDirectory());
        //System.out.println(file.isFile());
    }
}
