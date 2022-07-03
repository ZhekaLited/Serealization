import java.io.Serializable;

public class Serial implements Serializable  {  // implements для понимания java что мы разрешаем сериализовать
    private int id;
    private String name;

    public Serial(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return id + " : " + name;
    }
}
