public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Yayoi Kusama", "Japanese", 95, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Stephen King", "American", 77, "Writing", WritingStyle.FICTION);
        writer.displayInfo();

        System.out.println();
        
        Dancer dancer = new Dancer("Kim Yugyeom", "Korean", 27, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();

    }
}