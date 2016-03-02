public class Bottiglia2 {
    public final int capacita = 20;
    public int livello;
    
    /* 
        Ha senso inserire questo metodo nella classe bottiglia perche' e' un'operazione
        propria della bottiglia.
    */
    
    public void riempi (int q){
        /*
            Scelgo di scegliere come livello il minimo tra capacita' massima e livello,
            cosi' se riempio troppo la bottiglia l'acqua va fuori e il livello corrisponde 
        */
        this.livello = Math.min(this.capacita, this.livello + q);
    }
    
    public void travasa (Bottiglia2 b){
    	b.riempi(this.livello);
    	this.livello = 0;
    }
}
