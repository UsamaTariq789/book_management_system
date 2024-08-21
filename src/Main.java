import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final AuthorManager authorManager = new AuthorManager(scanner);
    private static final BookManager bookManager = new BookManager(authorManager,scanner);


    public static void main(String[] args) {
        while (true) {
            System.out.println("---Welcome to Book Management System---");
            System.out.println("1. Manage Authors");
            System.out.println("2. Manage Books");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.println("Entering Author Management... \n");
                    authorManager.manageAuthors(bookManager);
                    System.out.println("Returned to Main Menu from Author Management. \n");
                }
                case 2 -> {
                    System.out.println("Entering Book Management... \n");
                    bookManager.manageBooks();
                    System.out.println("Returned to Main Menu from Book Management. \n");
                }
                case 3 -> {
                    System.out.println("Exiting System. Goodbye! \n");
                    return; // Exit the program
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

}





































