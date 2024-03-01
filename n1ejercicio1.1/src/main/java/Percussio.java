

public class Percussio extends Instrumento{

    public Percussio(String nom, int preu){

       super(nom,preu);}


    public String tocar(){
        return super.tocar()+" Percussió";

}

}
