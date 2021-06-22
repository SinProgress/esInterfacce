import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner inputUtente = new Scanner(System.in);
        List<Famiglia> famiglieComune = new ArrayList<Famiglia>();
        boolean ch = true;
        while (ch) {
            System.out.println("Inserisci id famiglia");
            String id = inputUtente.next();
            System.out.println("Inserisci nr componenti");
            int componenti = inputUtente.nextInt();
            Famiglia famiglia = new Famiglia(id, componenti);
            System.out.println("Ha animali domestici? cane o gatto");
            while (inputUtente.next().equals("si")) {
                System.out.println("Hanno un cane?");
                if (inputUtente.next().equals("si")) {
                    System.out.println("Di che colore è il cane?");
                    String colore = inputUtente.next();
                    System.out.println("Di che sesso è? M - F");
                    char sesso = inputUtente.next().charAt(0);
                    famiglia.inserisciAnimaleDomestico(new Dog(colore, sesso));
                    break;
                } else {
                    System.out.println("Di che colore è il gatto?");
                    String colore = inputUtente.next();
                    System.out.println("Di che sesso è? M - F");
                    char sesso = inputUtente.next().charAt(0);
                    famiglia.inserisciAnimaleDomestico(new Cat(colore, sesso));
                    break;
                }
            }
            famiglieComune.add(famiglia);
            System.out.println("Vuoi inserire un' altra famiglia?");
            ch = inputUtente.next().equals("si");
        }
        System.out.println("Dammi id famiglia");
        String id2 = inputUtente.next();
        for (Famiglia f : famiglieComune) {
            if (f.getIdStatoFamiglia().equals(id2)) {
                System.out.print("La famiglia " + id2 + " ha " + f.getNumeroComponenti() + " componenti");
                if(f.getAnimale()!=null) System.out.println(" e un animale che " + f.getAnimale().verso());
                else System.out.println(" e nessun animale domestico");
            }
        }
    }
}


