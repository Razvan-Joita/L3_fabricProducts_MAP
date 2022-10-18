public class Product
{
    private final String name;
    private final int id;

    public Product(String Name, int id) {
        name = Name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }
}
