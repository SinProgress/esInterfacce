import java.util.ArrayList;
import java.util.List;

public class Famiglia {
    private String idStatoFamiglia;
    private int numeroComponenti;
    private Animale animaleDomestico;

    public Famiglia(String id,int n){
        this.idStatoFamiglia=id;
        this.numeroComponenti=n;
    }

    public String getIdStatoFamiglia(){
        return this.idStatoFamiglia;
    }

    public int getNumeroComponenti() {
        return numeroComponenti;
    }

    public Animale getAnimale(){
        return this.animaleDomestico;
    }

    public void inserisciAnimaleDomestico(Animale animale){
        this.animaleDomestico=animale;
    }
    /*public void inserisciCane(String colore,char sesso){
        this.animaleDomestico=new Dog(colore, sesso);
    }*/

}
