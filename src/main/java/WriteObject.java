import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Serial serialOne = new Serial(1,"Bob");
        Serial serialTwo = new Serial(2,"Jack");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oot = new ObjectOutputStream(fos);
            oot.writeObject(serialOne);
            oot.writeObject(serialTwo);

            oot.close(); // Всегда должны закрывать
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
