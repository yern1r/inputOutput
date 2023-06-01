import java.io.Serializable;

public class CatTask implements Serializable {
    private String name;
    private String breed;
    private float weight;

    public CatTask(String name, String breed, float weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
}
