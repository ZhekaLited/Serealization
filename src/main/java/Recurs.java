import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Recurs {
    static FileOutputStream fos;

    private void getAllSubFoldersInPath(File path) throws IOException {
        File[] files=path.listFiles();
        try {
            for(File file: files) {
                if(file.isDirectory()) {// Проверяет что путь это директория а не файл
                    System.out.println("DIRECTORY:"+file.getCanonicalPath()); // Указывает уникальный путь папки
                    String s = "DIRECTORY:"+file.getCanonicalPath()+"\n";
                    fos.write(s.getBytes(), 0, s.getBytes().length);
                    getAllSubFoldersInPath(file);// Рекурсивно найти файлы
                } else {
                    System.out.println("FILE: "+file.getCanonicalPath());
                    String s = "FILE: "+file.getCanonicalPath()+"\n";
                    fos.write(s.getBytes(), 0, s.getBytes().length);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        Recurs fw = new Recurs();

        try {
// Каждый раз добавляет в существующий
            fos=new FileOutputStream("D:\\Android/notes.txt",true);
            String s = "\n====================\n";
            fos.write(s.getBytes(), 0, s.getBytes().length);

            fw.getAllSubFoldersInPath(new File("D:\\Android"));
            System.out.println("The file has been written");
        }
        catch (IOException e) {
            System.out.println(e);
        }
        finally {
            fos.close();
        }

        //Каждый раз создает новый файл или перезаписывает его

        /*  try {
            fos=new FileOutputStream("D:\\Android/notes.txt");
            fw.getAllSubFoldersInPath(new File("D:\\Android"));
        } catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        finally {
            fos.close();
        }
   */ }
}
