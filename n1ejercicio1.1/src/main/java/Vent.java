public class Vent extends Instrumento{
    public Vent (String nom,int preu){

        super(nom,preu);
}

    public String tocar(){
            return super.tocar()+" Vent";

}
    static String Metodecomprovacio(){

        return  "comprovació";
    }
}
