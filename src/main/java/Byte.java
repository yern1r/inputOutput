import java.io.*;

public class Byte {
    public static void main(String[] args) {
        File file = new File("1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //to read data by bytes use abstract class
        // will automatically close
        //inputStream.close(); --closeable

        //for reading data from files
        try ( InputStream inputStream = new FileInputStream(file)){
            int a = inputStream.read();
            //if there is no data
            while (a != -1){
                System.out.print((char) a);
                a = inputStream.read();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
