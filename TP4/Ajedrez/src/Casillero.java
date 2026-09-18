public class Casillero {
    private String color;
    private String coordenada;



    public Casillero() {

    }

    public Casillero(String color, String coordenada) {
        this.color = color;
        this.coordenada = coordenada;
    }



    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCoordenada() {
        return coordenada;
    }
    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

    
}
