public class Dog implements Animale{
    private String colore;
    private char sesso;
    public Dog(String colore, char sesso){
        this.colore=colore;
        this.sesso=sesso;
    }
    @Override
    public String verso() {
        return "abbaia";
    }

    @Override
    public boolean isMammifero() {
        return true;
    }
}
