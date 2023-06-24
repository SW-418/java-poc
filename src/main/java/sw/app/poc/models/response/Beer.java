package sw.app.poc.models.response;

public record Beer(int id, String name) {
    public Beer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
