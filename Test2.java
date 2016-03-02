public class Test2 {
    public static void main(String[] args){
        Bottiglia2 b = new Bottiglia2();
        Bottiglia2 b1 = new Bottiglia2();
        
        /*
    		Per il metodo main viene allocato un nuovo frame che ha come parametri:
    			this	è l'identità dell'oggetto su cui viene chiamato il metodo, cioè
    					l'oggetto di tipo bottiglia che viene prima del punto)
    			q		verrà passato come parametro dalla chiamata
    		Quando il metodo termina, il frame viene disallocato.
    	*/
        b.riempi(2);
        System.out.println("Livello della bottiglia b: " + b.livello);
        
        b1.riempi(10);
        System.out.println("Livello della bottiglia b1: " + b1.livello);
    }
}
