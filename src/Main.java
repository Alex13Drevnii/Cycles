import java.io.File;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int count = 0; //Количество найденных путей
        while (true) {
            System.out.println("Введите путь к файлу:");
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            boolean fileExists = file.exists();

            boolean isDirectory = file.isDirectory();

            if (isDirectory) {
                System.out.println("Путь ведет к папке");
                continue;
            }
            if (!fileExists) System.out.println("Файла не существует");
            else {
                count++;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + count);
            }

        }
        }
}