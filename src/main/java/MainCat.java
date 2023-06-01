import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainCat {
    public static void main(String[] args) {
        File file = new File("cats.cat");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        List<CatTask> cats = new ArrayList<>();
//        for (int i = 0 ; i < 10; i++){
//            cats.add(new CatTask("Name" + i, "Breed" + i, 1f));
//        }
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))){
//            objectOutputStream.writeObject(cats);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
            List<CatTask> cats = (List<CatTask>) objectInputStream.readObject();
            for (CatTask catTask : cats ) {
                System.out.println(catTask.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
