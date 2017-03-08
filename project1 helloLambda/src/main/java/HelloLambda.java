import java.util.ArrayList;
import java.util.List;

public class HelloLambda {
    public static void main(String[] args) {
        List<String> allArtists = new ArrayList<>();
        allArtists.add("Beijing");
        allArtists.add("Shanghai");
        allArtists.add("Nanjing");
        allArtists.add("Xian");
        allArtists.add("Xian");
        allArtists.add("Xian");
        long count = allArtists.stream()
                .filter(artist -> artist.equals("Xian"))
                .count();
        System.out.println(count);

    }
}
