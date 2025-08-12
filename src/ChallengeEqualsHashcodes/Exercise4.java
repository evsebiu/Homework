package ChallengeEqualsHashcodes;

import java.util.Objects;

/*Create a Song class with title, artist, and length fields.
Implement the equals() method to check only the title and artist fields.
 Implement the hashCode() method to use the title and artist fields to calculate the hash code.
 Test that two instances with the same title and artist return true for equals() and have the same hash code.
 */
public class Exercise4 {
    public static void main(String[] args) {

        Song song1=new Song("Miroase a vara din nou", "Kio", "02:35");
        Song song2 = new Song("Miroase a vara din nou", "Kio", "03:10");
        Song song3=new Song("Romaneste", "Parazitii", "03:25");

        System.out.println("Are song1 and song2 equals? " + song1.equals(song2));
        System.out.println("Are song2 and song3 equals? " + song2.equals(song3));
        System.out.println("Are song1 and song3 equals? " + song1.equals(song3));

        System.out.println("Song 1 have same hash code with song 2? " + (song1.hashCode() == song2.hashCode()));
    }
}

class Song{
    private String title;
    private String artist;
    private String length; // format : mm:ss

    public Song(String title, String arist, String length){
        this.title=title;
        this.artist=arist;
        this.length=length;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getLength(){
        return length;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj ) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song otherSong = (Song) obj;
        return Objects.equals(title, otherSong.title) && Objects.equals(artist, otherSong.artist);
    }
    @Override
    public int hashCode(){
        return Objects.hash(getArtist(), getTitle());
    }
}
