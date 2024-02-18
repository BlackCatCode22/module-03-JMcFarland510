package mystuff;
import java.security.PrivateKey;
import java.sql.Struct;

public class Driver {

        private String artist;
        private String genre;
        private String subGenre;
        private String hit;

        // constructor with parameters
        public Driver(String artist, String genre, String subGenre,  String hit) {

                this.artist = artist;
                this.genre = genre;
                this.subGenre = subGenre;
                this.hit = hit;

        }

        // Method output of the class driver
        public void music() {

                System.out.println("\n The name of the first artist is: " + this.artist + "\n");
                System.out.println("\n The genre of the first artist is: " + this.genre + "\n");
                System.out.println("\n The sub genre of the first artist is: " + this.subGenre + "\n");
                System.out.println("\n The number one hit of the first artist is: " + this.hit + "\n");

        }

}