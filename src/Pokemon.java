public class Pokemon {
    private String type;
    private String name;

    public Pokemon(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void attack()
    {
        System.out.println(name + " attacks!");
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
