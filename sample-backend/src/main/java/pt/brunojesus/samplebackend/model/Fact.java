package pt.brunojesus.samplebackend.model;

public class Fact {

    private final int id;
    private final String content;

    public Fact(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public static Fact of(int id, String content) {
        return new Fact(id, content);
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
