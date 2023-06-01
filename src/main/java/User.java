import java.io.Serializable;

public class User extends Person implements Serializable {

    private int age;

    //transient - for objects which does not needs to serialize, just do not allow
    // and automatically will be filled
    private   Address address;

    public User(String name, String surname, int age, Address address) {
        super(name, surname);
        System.out.println("Constructor");

        this.age = age;
        this.address = address;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", address=" + address +
                '}';
    }
}
