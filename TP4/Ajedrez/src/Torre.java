public class Torre extends Piezas{

    public Torre(String color, int velocidad, String comportamiento, String movimiento) {
        super(color, velocidad, comportamiento, movimiento);
    }

    public Torre() {
    }


    @Override
    public  void Instanciar(Piezas tNegro[], Piezas tBlanco[]){
        for(int i=0;i<tNegro.length;i++){
            tNegro[i]= new Torre("NEGRO",7,"HOMERICA","DIRECTA");
            tBlanco[i]= new Torre("BLANCO",7,"HOMERICA","DIRECTA");
        }

    }

    @Override 
    public void Mover(){
        System.out.println("Directa");
    }

    
    
}
