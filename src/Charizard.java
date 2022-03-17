public class Charizard extends Pokemon{
    private boolean hasRoared;

    public Charizard(String t, String n)
    {
        super(t,n);
        hasRoared = false;
    }

    public void roar()
    {
        System.out.println("Roar!");
        hasRoared = true;
    }

    public void fireSpin()
    {
        System.out.println("Charizard uses fire spin!");
    }

    public boolean isHasRoared() {
        return hasRoared;
    }
}
