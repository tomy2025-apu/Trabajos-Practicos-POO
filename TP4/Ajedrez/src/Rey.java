public class Rey extends Piezas{

    public Rey(String color, int velocidad, String comportamiento, String movimiento) {
        super(color, velocidad, comportamiento, movimiento);
    }

    public Rey() {
    }

    @Override
    public  void Instanciar(Piezas RNegro[], Piezas RBlanco[]){
        RNegro[0]= new Rey("NEGRO",1,"POSTRERO","TENUE");
        RBlanco[0]= new Rey("BLANCO",1,"POSTRERO","TENUE");
    }

    @Override 
    public void Mover(){
        System.out.println("Tenue");
    }
    
}
