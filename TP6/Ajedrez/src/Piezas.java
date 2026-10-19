public  abstract class Piezas {
    private String color;
    private int velocidad;
    private String comportamiento;
    private String movimiento;

    public Piezas(String color, int velocidad, String comportamiento, String movimiento) {
        this.color = color;
        this.velocidad = velocidad;
        this.comportamiento = comportamiento;
        this.movimiento = movimiento;
    }

    public Piezas() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public abstract void Mover();
    public abstract void Instanciar(Piezas arr[],Piezas arr2[]);




    @Override 
    public String toString(){
        return getClass().getSimpleName()+"\n"+"color: "+color+"\ncomportamiento: "+comportamiento+"\nmovimiento: "+movimiento+"\nvelocidad: "+velocidad;
    }

    
}
