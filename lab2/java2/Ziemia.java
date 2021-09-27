import static java.lang.System.out;

class PlaskaZiemia {
    private static PlaskaZiemia jedyna = new PlaskaZiemia();
    private int Ludnosc = 1000;

    private PlaskaZiemia() {
        Ludnosc += 200;
    }

    public static PlaskaZiemia DajEgzemplarz() {
        return jedyna;

    }

    public void DajInfo() {
        out.println("Liczba Ludzi= " + Ludnosc);
    }
}

public class  Ziemia{
    public static void main(String[] Args)
    {
        
        PlaskaZiemia[]tablica = new PlaskaZiemia[10];

        for(int i = 0; i < tablica.length; i++)
        {
            tablica[i] = PlaskaZiemia.DajEgzemplarz();
        }
        
        for(PlaskaZiemia K:tablica)
            K.DajInfo();
    }
}