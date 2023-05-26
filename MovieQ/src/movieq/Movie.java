
package movieq;


public class Movie {
    private String name;
    private String genre;
    private String favoriteQuote;

    public Movie(String name, String genre, String favoriteQuote) {
        this.name = name;
        this.genre = genre;
        this.favoriteQuote = favoriteQuote;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getFavoriteQuote() {
        return favoriteQuote;
}

}

