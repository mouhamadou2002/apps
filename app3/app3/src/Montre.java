
public class Montre extends Article {
    private final String nature;

    public Montre(int id, String lib, String nature) {
        super(id, lib);
        this.nature = nature;
    }

    @Override
    public String toString() {
        return super.toString() + ", nature='" + nature + "'";
    }
}