import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(input);
            Serial serialone = (Serial) ois.readObject();
            Serial serialTwo = (Serial) ois.readObject();

            System.out.println(serialone);
            System.out.println(serialTwo);

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
