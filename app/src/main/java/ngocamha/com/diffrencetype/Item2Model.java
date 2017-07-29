package ngocamha.com.diffrencetype;

/**
 * Created by PL on 7/25/2017.
 */

public class Item2Model {
    String name;
    String content;

    public Item2Model(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
