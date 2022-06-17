import java.io.File;

public class Recurs {

            private void getAllSubFoldersInPath(File path) {
                File[] files=path.listFiles();
                try {
                    for(File file: files)
                    {
                        if(file.isDirectory()) // Проверяет что путь это директория а не файл
                        {
                            System.out.println("DIRECTORY:"+file.getCanonicalPath()); // Указывает уникальный путь папки
                            getAllSubFoldersInPath(file);// Рекурсивно найти файлы
                        }
                        else
                        {
                            System.out.println("FILE: "+file.getCanonicalPath());
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


        public static void main(String[] args) {
            Recurs fw = new Recurs();
            fw.getAllSubFoldersInPath(new File("D:\\Новая папка"));
        }

    }
