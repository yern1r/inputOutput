import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WorkingSymbols {
    public static void main(String[] args) {
        File directory = new File("fifthLesson");
        directory.mkdir();
        File file = new File(directory, "text.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw")){
//        randomAccessFile.seek(10);
//        randomAccessFile.writeBytes("*****siuuu****");
            randomAccessFile.seek(34);
            byte[] array = new byte[1024];
            randomAccessFile.read(array);
            System.out.println(new String(array));

            randomAccessFile.seek(1);
            randomAccessFile.read(array);
            System.out.println(new String(array));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
