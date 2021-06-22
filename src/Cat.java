public class Cat implements Animale{
    private String colore;
    private char sesso;
    public Cat(String colore, char sesso){
        this.colore=colore;
        this.sesso=sesso;
    }
    @Override
    public String verso() {
        return "miagola";
    }

    @Override
    public boolean isMammifero() {
        return true;
    }
}
