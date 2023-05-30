import java.io.*;
import java.util.Scanner;

public class WorkingWithOutputStream {
    public static void main(String[] args) {
        File directory = new File("folderbek");
        directory.mkdir();
        File file = new File(directory,"names.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //by writing true we can add to our text and not just overwriting
//        try(OutputStream outputStream = new FileOutputStream(file, true)){
//            String names = "\nBenzema Rodrygo Vinicius Modric Kroos Casemiro Alaba Militao Carvajal Mendy Courtois";
//            outputStream.write(names.getBytes());
//        }catch (Exception e) {
//           e.printStackTrace();
//        }

        //by buffer we can access files , fast
//        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file))){
//            long before = System.currentTimeMillis();
//        int a = inputStream.read();
//        StringBuilder result = new StringBuilder();
//        while (a != -1){
//            result.append((char) a);
//            a = inputStream.read();
//        }
//            long after = System.currentTimeMillis();
//            System.out.println(after - before);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! " );
        String result = scanner.nextLine();
        System.out.println("entered: " + result);
        System.out.println("enter a: ");
        int a = scanner.nextInt();
        System.out.println("enter b:");
        int b = scanner.nextInt();
        System.out.println("sum: " + (a + b));
    }
}
