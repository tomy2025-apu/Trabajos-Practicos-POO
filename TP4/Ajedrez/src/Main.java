public class Main {
    
    public static void main(String[] args) {

    Tablero.MostrarTablero();

    Alfil []arregloAlfilN=new Alfil[2];
    Alfil []arregloAlfilB=new Alfil[2];
    Alfil a= new Alfil();
    a.Instanciar(arregloAlfilN,arregloAlfilB);



    
    
    Caballo []arregloCaballoN=new Caballo[2];
    Caballo []arregloCaballoB=new Caballo[2];
    Caballo c= new Caballo();
    c.Instanciar(arregloCaballoN,arregloCaballoB);
 

    Peon []arregloPeonN=new Peon[8];
    Peon []arregloPeonB=new Peon[8];
    Peon p= new Peon();
    p.Instanciar(arregloPeonN,arregloPeonB);
    

    Torre []arregloTorreN=new Torre[2];
    Torre []arregloTorreB=new Torre[2];
    Torre t= new Torre();
    t.Instanciar(arregloTorreN,arregloTorreB);

   
    

    Reina []reinaN = new Reina[1];
    Reina []reinaB = new Reina[1];
    Reina r= new Reina();
    r.Instanciar(reinaN,reinaB);
    

    Rey []reyN= new Rey[1];
    Rey []reyB= new Rey[1];
    Rey R= new Rey();
    R.Instanciar(reyN,reyB);
    


    System.out.println("PIEZAS NEGRAS:");
    imprimir(arregloAlfilN);
    System.out.println("\n");
    imprimir(arregloCaballoN);
    System.out.println("\n");
    imprimir(arregloPeonN);
    System.out.println("\n");
    imprimir(arregloTorreN);
    System.out.println("\n");
    imprimir(reinaN);
    System.out.println("\n");
    imprimir(reyN);
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("PIEZAS BLANCAS:");
    imprimir(arregloAlfilB);
    System.out.println("\n");
    imprimir(arregloCaballoB);
    System.out.println("\n");
    imprimir(arregloPeonB);
    System.out.println("\n");
    imprimir(arregloTorreB);
    System.out.println("\n");
    imprimir(reinaN);
    System.out.println("\n");
    imprimir(reyN);



    
    }

    
    public static void imprimir (Piezas arr[]){
        for(Piezas p:arr){
            System.out.println(p);
        }

    }







}
    
