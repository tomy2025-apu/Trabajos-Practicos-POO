public class Flor {
    private String estado;
    private String apariencia;
    private String actitud;
    private int orugas;

    public void Agradecer(){

    }

    public Flor(String estado, String apariencia, String actitud, int orugas) {
        this.estado = estado;
        this.apariencia = apariencia;
        this.actitud = actitud;
        this.orugas = orugas;
    }

    public Flor() {
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public String getActitud() {
        return actitud;
    }

    public void setActitud(String actitud) {
        this.actitud = actitud;
    }

    public int getOrugas() {
        return orugas;
    }

    public void setOrugas(int orugas) {
        this.orugas = orugas;
    }

    
    

    
}