public class Test1 {

    public static void main(String[] args) {
       // Ryba r = new Ryba();
      //  r.metSzablonowa();
        Karp k = new Karp();
        k.metSzablonowa();
        
    }
    
}

class Ryba{
    public Ryba (){}
    
        public final void metSzablonowa()
        {
            while(!end())
            {
                plyn();
                szukajJedzenia();
                jedz();
                odpoczywaj();
                spij();
            }
        }
        public void plyn(){
            System.out.println("Płyne"); 
        }
        protected void szukajJedzenia(){
            System.out.println("Szukam jedzenia..........................");
        }
        public void jedz(){
            System.out.println("Jem");
        }
        public void odpoczywaj(){
            System.out.println("Odpoczywam");
        }
        protected void spij(){
            try
            {Thread.sleep(1000);}
            catch(Exception e){
                
            }
        }
        private boolean end(){
            return false;
        }
}

class Karp extends Ryba{
    
    public Karp(){
        super();
    }
    @Override
    protected void spij(){
        try
            {Thread.sleep(100);}
            catch(Exception e){
                
            }
    }
    
    @Override
    protected void szukajJedzenia(){
        System.out.println("Szukam jedzenia na dnie rzeki");
    }
    
    
    
    
    
    
    
    
    
    
}