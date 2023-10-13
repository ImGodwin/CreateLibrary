package GodwinE.entities;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LibraryWebsite {
    public static void main(String[] args) {

        Book book1 = new Book("ISBN47895983874I07466", "Michael Brown", "Romance", "Lovers", "12-12-1994",
                200);

        Book book2 = new Book("ISBN82771401621500311", "James Wise", "Crime", "Kill Bill", "05-04-2020",
                200);

        Book book3 = new Book("ISBN82774774678447858", "Lugi", "Fiction", "kiss", "03-02-2021",
                200);

        Book book4 = new Book("ISBN47850438959004850", "Will Smith", "Romance", "Fight", "13-09-2002",
                200);

        Book book5 = new Book("ISBN12385086006809645", "Chris Turker", "Rom-Com", "China", "02-08-1997",
                200);

        Book book6 = new Book("ISBN03956673495008850", "Bruce Lee", "Fight", "Pay Day", "07-03-1978",
                200);

        Book book7 = new Book("ISBN55959058948550588", "Ice-Cube", "Hip-Hop", "Camden", "01-09-2000",
                200);

        Book book8 = new Book("ISBN04873947849450948", "Dre", "Hip-Hop", "The Hood", "04-10-2006",
                200);

        Book book9 = new Book("ISBN82094673746849984", "Jackie Chan", "Fiction", "Tokyo", "09-08-2014",
                200);

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Magazines<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        List<String> publishingStyle = Arrays.asList("Weekly", "Monthly");

        Magazine mag1 = new Magazine("ISBN 89478489957 9048", "Fashion Fair", "01-09-2003", 39, publishingStyle);
        Magazine mag2 = new Magazine("ISBN 02745085457 9850", "Vanity Fair", "01-09-2003", 40, publishingStyle);
        Magazine mag3 = new Magazine("ISBN 20847948595 0948", "Gucci", "07-09-1994", 70, publishingStyle);
        Magazine mag4 = new Magazine("ISBN 30048754957 0958", "GQ", "19-20-2003", 100, publishingStyle);
        Magazine mag5 = new Magazine("ISBN 40984085747 9509", "Fashion Italy", "01-02-1970", 88, publishingStyle);
        Magazine mag6 = new Magazine("ISBN 03974563494 9580", "Mens Fashion", "10-08-2002", 56, publishingStyle);
        Magazine mag7 = new Magazine("ISBN 38946683099 9489", "Woman", "04-09-1953", 57, publishingStyle);




        List<Book> booksInStore = new ArrayList<>();
        booksInStore.add(book1);
        booksInStore.add(book2);
        booksInStore.add(book3);
        booksInStore.add(book4);
        booksInStore.add(book5);
        booksInStore.add(book6);
        booksInStore.add(book7);
        booksInStore.add(book8);
        booksInStore.add(book9);


        Random random = new Random();
        HashMap<Integer, List<Book>> archive = new HashMap<Integer, List<Book>>();
        boolean num = false;
        Scanner input = new Scanner(System.in);

       while(!num) {
           System.out.println("Type in book title to add to your archive: ");
           String name = input.nextLine();

           Predicate<Book> isBookTitleTrue = book -> book.getTitle().equals(name);

           List<Book> confirmedBook = booksInStore.stream().filter(isBookTitleTrue).toList();
           archive.put(random.nextInt(0, 50), confirmedBook);
           System.out.println(archive);


           //2. remove book using ISBN code
           System.out.println("Add ISBN to remove Book from Archive: ");
           String removeThisISBN = input.nextLine();

           Predicate<Book> confirmISBN = isbn -> isbn.getIsbnCode().equals(removeThisISBN);

           List<Book> isBookInArchive = booksInStore.stream().filter(confirmISBN).toList();
           archive.remove(isBookInArchive.getClass());
           System.out.println("This element has been removed successfully");

           //3.check by isbn
           System.out.println("Search with ISBN: ");
           String searchISBN = input.nextLine();


           Predicate<Book> getISBN = isbn -> isbn.equals(searchISBN);

           /*for (int i = 0; i < archive.size(); i++) {
               archive.getClass().equals(searchISBN);
               System.out.println(archive);
           }*/
           List<Book> isISBNCorrect = booksInStore.stream().filter(getISBN).toList();
           archive.containsKey(isISBNCorrect);
           System.out.println("You searched for: " + archive);

            //Check year of publication

           System.out.println("enter publication year: ");
           String confirmDate = input.nextLine();

           Predicate<Book> date = dateAdded -> dateAdded.equals(confirmDate);

           List<Book> dateOfPublication = booksInStore.stream().filter(date).toList();
           archive.containsKey(dateOfPublication);
           System.out.println("you checked for: " + archive);







       }


        input.close();



    }



























}
