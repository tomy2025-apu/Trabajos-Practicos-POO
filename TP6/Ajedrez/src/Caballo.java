public class Caballo extends Piezas {

    public Caballo(String color, int velocidad, String comportamiento, String movimiento) {
        super(color, velocidad, comportamiento, movimiento);
    }

    public Caballo() {
    }


    @Override
    public  void Instanciar(Piezas cNegro[], Piezas cBlanco[]){
        for(int i=0;i<cNegro.length;i++){
            cNegro[i]= new Caballo("NEGRO",6,"LIGERO","...");
            cBlanco[i]= new Caballo("BLANCO",6,"LIGERO","...");
        }
    }
    

    @Override 
    public void Mover(){
        System.out.println("...");
    }
    
}
