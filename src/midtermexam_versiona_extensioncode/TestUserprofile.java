package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        int genreChoice = scanner.nextInt();
        while (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid choice. Please choose a number between 1 and " + genres.length);
            genreChoice = scanner.nextInt();
        }

        UserProfile userProfile = new UserProfile(name, genres[genreChoice - 1]);
        System.out.println("UserProfile created for " + userProfile.getUserID() + " with favorite genre " + userProfile.getGenre());

        scanner.close();
    }
}
