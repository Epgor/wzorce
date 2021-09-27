class Kot
{
    private static Kot jedyny = new Kot();
    private int nr = 0;
    private Kot()
    {
        nr++;
    }
    public static Kot DajEgzemplarz()
    {
        return jedyny;
        
    }
    public void daj_glos()
    {
        System.out.println("To ja singleton nr= "+nr);
    }
}

public class  singleton{
    public static void main(String[] Args)
    {
        
        Kot[]tablica = new Kot[10];

        for(int i = 0; i < tablica.length; i++)
        {
            tablica[i] = Kot.DajEgzemplarz();
        }
        
        for(Kot K:tablica)
            K.daj_glos();
    }
}