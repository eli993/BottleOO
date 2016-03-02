public class Test1{

    public static void main(String[] args) {
        Bottiglia1 b = new Bottiglia1();
        
        System.out.println("Valori di default di b:");
        System.out.println("Indirizzo: " + b + " - Capacita: " + b.capacita + " - Livello: " + b.livello);
        
        Bottiglia1 b1 = new Bottiglia1();
        
        System.out.println("Valori di default di b1:");
        System.out.println("Indirizzo: " + b1 + " - Capacita: " + b1.capacita + " - Livello: " + b1.livello);
        
        b.capacita = 20;
        
        System.out.println("Valori aggiornati di b:");
        System.out.println("Indirizzo: " + b + " - Capacita: " + b.capacita + " - Livello: " + b.livello);
        
        
        //Assegno a b2 l'indirizzo di b1 
        Bottiglia1 b2 = b1;
        System.out.println("Valori di default di b2:");
        System.out.println("Indirizzo: " + b2 + " - Capacita: " + b2.capacita + " - Livello: " + b2.livello);
        
        b.livello = b.capacita + 21;        
        
        /*  
            Con questa istruzione ho violato l'invariante di classe, 
            che impone che il livello sia sempre inferiore alla capacita.
        */
        
        System.out.println("Valori aggiornati di b:");
        System.out.println("Indirizzo: " + b + " - Capacita: " + b.capacita + " - Livello: " + b.livello);
        
        b2 = b;
        /*
            Assegno a b2 l'indirizzo di b.
        */
        System.out.println("Valori aggiornati di b2:");
        System.out.println("Indirizzo: " + b2 + " - Capacita: " + b2.capacita + " - Livello: " + b2.livello);
        
        
        /*
            Invoco il metodo riempi, che aggiunge del liquido nella bottiglia.
        */
        
        riempi(b, 10);
        riempi(b1, 10);
        
    }
    
    /*
        Al metodo, dal main, devo passare un oggetto di tipo bottiglia.
        Il tipo bottiglia, nel passaggio ai metodi si comporta esattamente come
        gli altri tipi.
        Il metodo riempi è un metodo che agisce sulla bottiglia, dunque 
        creiamo una nuova classe, denominata Bottiglia2 che conterrà anche i 
        metodi
    */
    public static void riempi (Bottiglia1 b, int q){
        b.livello = b.livello + q;
    }
    
}
