import java.io.*;
import java.util.Scanner;

public class File_display {

    public static void main (String args[]){

                // Program info

        System.out.println("Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt ");

                // Data processing

        try (FileReader fr = new FileReader( "file_16.txt" )){

            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {

                System.out.println(scan.nextLine());

            }

            fr.close();
        }

        catch (IOException exc) {
            System.out.println("Ошибка ввода/вывода: " + exc);
        }
    }
}
