
public class Article {
    protected int id;
    protected String lib;

    public Article(int id, String lib) {
        this.id = id;
        this.lib = lib;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", lib='" + lib + '\'' +
                '}';
    }
}
