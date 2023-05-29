import java.io.*;
import java.nio.charset.StandardCharsets;

public class savingInString {
    public static void main(String[] args) {
        File directory = new File("folder");
        directory.mkdir();
        File file = new File(directory, "names.txt");
        try {
            file.createNewFile();
        }catch (IOException e ){
            e.printStackTrace();
        }

        try (Reader reader  = new InputStreamReader( new FileInputStream(file) , StandardCharsets.UTF_8)) {
            long before = System.currentTimeMillis();
            //byte[] array = new byte[1000];
            //int count = reader.read();
            int a = reader.read();
            StringBuilder result = new StringBuilder();
            while (a > 0){
                result.append((char) a);
                a = reader.read();
            }
            //while (count > 0) {
                //result.append (new String(array, 0, count));
               // count = reader.read();
           // }
            System.out.println(result.toString());
            long after = System.currentTimeMillis();
            System.out.println(after - before);
        }catch (Exception e){
            e.printStackTrace();
        }
        }
    }

//Тип Стринш = иммутабельный(неизменяемый)
//StringBuilder
//StringBuffer - is more safety flow
//Reader = reads symbols