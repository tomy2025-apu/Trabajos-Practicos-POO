public class Alfil extends Piezas{

    public Alfil(String color, int velocidad, String comportamiento, String movimiento) {
        super(color, velocidad, comportamiento, movimiento);
    }

    public Alfil() {
    }

    

    @Override
    public  void Instanciar(Piezas aNegro[], Piezas aBlanco[]){
        for(int i=0; i<aNegro.length;i++){
            aNegro[i]= new Alfil("NEGRO",3,"SESGO","OBLICUO");
            aBlanco[i]= new Alfil("BLANCO",3,"SESGO","OBLICUO");
        }

    }
    

    @Override 
    public void Mover(){
        System.out.println("Oblicuo");
    }
    
}
