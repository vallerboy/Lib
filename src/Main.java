import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lenovo on 16.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        new Main();
    }

    private Scanner scanner;
    private List<Book> bookList;

    public Main() {
        scanner = new Scanner(System.in);
        bookList = Utils.parseBooksFromFile(Paths.get("books.txt"));
        start();
    }


    private void start(){
        System.out.println("Witaj w mojej bibliotece!");

        String command;
        do{
            System.out.println("1 - Dodawanie ksiazki");
            System.out.println("2 - Wypozyczenie ksiazki");
            System.out.println("3 - Oddawanie ksiazki");
            System.out.println("4 - Wyswietl wolne pozycje");

            System.out.print("Wpisz polecenie: ");
            command = scanner.nextLine();
            parseChoice(command);

        }while (!command.equals("exit"));
    }

    private void parseChoice(String command) {
        switch (command){
            case "4": {

                break;
            }
        }
    }


}
