public class Pikachu extends Pokemon{
    private boolean hasSaidPika;

    public Pikachu(String t, String n)
    {
        super(t,n);
        hasSaidPika = false;
    }

    public void sayPika()
    {
        System.out.println("Pika Pika!");
        hasSaidPika = true;
    }

    public void thunderBolt()
    {
        System.out.println("Pikachu uses thunder bolt!");
    }

    public boolean isHasSaidPika() {
        return hasSaidPika;
    }
}
