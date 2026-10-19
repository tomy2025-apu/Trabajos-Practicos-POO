public class Tablero {

    private  Casillero [][]miTablero;

    public Tablero() {
        miTablero= new Casillero [8][8];
    }

    public Casillero[][] getMiTablero() {
        return miTablero;
    }

    public void setMiTablero(Casillero[][] miTablero) {
        this.miTablero = miTablero;
    }

    public static void MostrarTablero(){
        int fila, colum;
        for(fila = 0; fila < 8; fila++){
            for(colum = 0; colum < 8; colum++){     
                // Alternar los colores en blanco y negro
                if ((fila + colum) % 2 == 0) {
                    System.out.print("[B] ");  // Casillero blanco
                } else {
                    System.out.print("[N] ");  // Casillero negro
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    

    }
