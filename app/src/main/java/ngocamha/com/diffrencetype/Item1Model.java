package ngocamha.com.diffrencetype;

/**
 * Created by PL on 7/25/2017.
 */

public class Item1Model {
    String name;
    int id;

    public Item1Model(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
