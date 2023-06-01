import java.io.*;

public class LastLesson {
    public static void main(String[] args) {
        File file = new File("user.usr");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        User user = new User("Nick" , "Abraham",20, new Address("Italy" , 12));

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))){
            objectOutputStream.writeObject(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
            User savedUser = (User) objectInputStream.readObject();
            System.out.println(savedUser);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
//interface serializable
//Serialization - transforming object into set of bytes
//ObjectInputStream(inputStream) for creating from bytes into object - Deserialization
//Externalization - is handed , you will write it by own , in serialization it is automatically

//desrialization - looking uid (unique) , for any changes it will also change