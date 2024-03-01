


public class Corda extends Instrumento{

    public Corda(String nom, int preu) {
        super(nom, preu);
    }

    public String tocar(){
        return super.tocar()+" Corda";
    }
}
