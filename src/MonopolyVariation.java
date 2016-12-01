/**
 * Created by strejolopez on 12/1/16.
 */
public class MonopolyVariation {
    private String edition;
    private String publishedBy;
    private int publishedYear;

    public MonopolyVariation(String edition, String publishedBy, int publishedYear) {
        this.edition = edition;
        this.publishedBy = publishedBy;
        this.publishedYear = publishedYear;
    }
    public String getEdition() {
        return this.edition;
    }
    public String getPublishedBy() {
        return this.publishedBy;
    }
    public int getPublishedYear() {
        return this.publishedYear;
    }
}
