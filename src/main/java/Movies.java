public class Movies {
    private int year;
    private int content_rating;

    private int imdb_score;
    private String language;

    public int getYear() {
        return year;
    }

    public int getScore() {
        return imdb_score;
    }

    public int getContent_rating() {
        return content_rating;
    }

    public String getLang() {
        return language;
    }

    public String toString() {
        return "Year: " + year + "\n" + "Score: " + imdb_score +
                "\n" + "Language: " + language + "\n" + "Rating: " + content_rating;
    }
}
