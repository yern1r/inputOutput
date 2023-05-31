import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        File directory = new File("folderTask5");
        directory.mkdir();
        File file = new File(directory, "bigText");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(file , "r")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter next page number or \"stop\" to exit");
            String input = scanner.nextLine();

            byte[] pageText = new byte[3000];

            while (!input.equals("stop")){
                int page = Integer.parseInt(input);
                randomAccessFile.seek((page - 1) * pageText.length);
                int count = randomAccessFile.read(pageText);
                System.out.println(new String(pageText,0,count));
                System.out.println("Enter next page number or \"stop\" to exit");
                input = scanner.nextLine();

            }
        }catch (Exception e){
                e.printStackTrace();
        }
    }
}
