public class Instrumento {

    protected int preu;
    protected String nom;

    public Instrumento (String nom,int preu){

        this.preu=preu;
        this.nom=nom;
    }
    public String tocar (){
        return "Està sonant un instrument de ";
    }


}
