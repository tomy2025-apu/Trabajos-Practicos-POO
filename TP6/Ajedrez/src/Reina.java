public class Reina extends Piezas {

    public Reina(String color, int velocidad, String comportamiento, String movimiento) {
        super(color, velocidad, comportamiento, movimiento);
    }

    public Reina() {
    }




    @Override
    public  void Instanciar(Piezas rNegro[], Piezas rBlanco[]){
        rNegro[0]= new Reina("NEGRO",9,"ARMADA","ENCARNIZADA");
        rBlanco[0]= new Reina("BLANCO",9,"ARMADA","ENCARNIZADA");
    }

    @Override 
    public void Mover(){
        System.out.println("Encarnizada");
    }

    
    
}
