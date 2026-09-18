public class Peon extends Piezas{

    public Peon(String color, int velocidad, String comportamiento, String movimiento) {
        super(color, velocidad, comportamiento, movimiento);
    }

    public Peon() {
    }
    


    @Override
    public  void Instanciar(Piezas pNegro[], Piezas pBlanco[]){
        for(int i=0;i<pNegro.length;i++){
            pNegro[i]= new Peon("NEGRO",2,"AGRESOR","LADINO");
            pBlanco[i]= new Peon("BLANCO",2,"AGRESOR","LADINO");
        }

    }

    
    @Override 
    public void Mover(){
        System.out.println("Ladino");
    }

    
}
