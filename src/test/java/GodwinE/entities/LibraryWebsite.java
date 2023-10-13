package GodwinE.entities;

import java.util.*;

public class LibraryWebsite {
    public static void main(String[] args) {
        Book book1 = new Book("ISBN 47895983874I 07466", "Michael Brown", "Romance", "Lovers", "12-12-1994",
                200);

        Book book2 = new Book("ISBN 827714016215 00311", "James Wise", "Crime", "Kill Bill", "05-04-2020",
                200);

        Book book3 = new Book("ISBN 827747746784 47858", "Lugi", "Fiction", "kiss", "03-02-2021",
                200);

        Book book4 = new Book("ISBN 478504389590 04850", "Will Smith", "Romance", "Fight", "13-09-2002",
                200);

        Book book5 = new Book("ISBN 123850860068 09645", "Chris Turker", "Rom-Com", "China", "02-08-1997",
                200);

        Book book6 = new Book("ISBN 039566734950 08850", "Bruce Lee", "Fight", "Pay Day", "07-03-1978",
                200);

        Book book7 = new Book("ISBN 559590589485 50588", "Ice-Cube", "Hip-Hop", "Camden", "01-09-2000",
                200);

        Book book8 = new Book("ISBN 0487394784945 0948", "Dre", "Hip-Hop", "The Hood", "04-10-2006",
                200);

        Book book9 = new Book("ISBN 8209467374684 9984", "Jackie Chan", "Fiction", "Tokyo", "09-08-2014",
                200);
    }


    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Magazines<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<



    List<String> publishingStyle = Arrays.asList("Weekly", "Monthly");

    Magazine mag1 = new Magazine("ISBN 89478489957 9048", "Fashion Fair", "01-09-2003", 39, publishingStyle);
    Magazine mag2 = new Magazine("ISBN 02745085457 9850", "Vanity Fair", "01-09-2003", 40, publishingStyle);
    Magazine mag3 = new Magazine("ISBN 20847948595 0948", "Gucci", "07-09-1994", 70, publishingStyle);
    Magazine mag4 = new Magazine("ISBN 30048754957 0958", "GQ", "19-20-2003", 100, publishingStyle);
    Magazine mag5 = new Magazine("ISBN 40984085747 9509", "Fashion Italy", "01-02-1970", 88, publishingStyle);
    Magazine mag6 = new Magazine("ISBN 03974563494 9580", "Mens Fashion", "10-08-2002", 56, publishingStyle);
    Magazine mag7 = new Magazine("ISBN 38946683099 9489", "Woman", "04-09-1953", 57, publishingStyle);



    HashMap<String, Integer> archive = new HashMap<String, Integer>();







}
