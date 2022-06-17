import java.io.*;

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
        String text = "Hello world!"; // строка для записи
        try
        {
            fos=new FileOutputStream("D:\\\\гк\\\\Androidi/notes.txt");
            // перевод строки в байты
            //byte[] buffer = text.getBytes();

            fw.getAllSubFoldersInPath(new File("D:\\гк\\Androidi"));
            System.out.println("The file has been written");
            fos.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
        }
