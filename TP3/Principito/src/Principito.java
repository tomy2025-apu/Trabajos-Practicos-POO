public class Principito {
    private Flor FlorPrincipito;


    public Flor getFlorPrincipito() {
        return FlorPrincipito;
    }

    public void setFlorPrincipito(Flor florPrincipito) {
        this.FlorPrincipito = florPrincipito;
    }
    
    
    public void Cuidar(){

    }

    public void Regar(){
        
    }

    public void Quitar(){
        
    }

    public void Explorar(){
        
    }

    public void Amar(){
        
    }

    public  void ImprimirFlorPrincipito(){
        System.out.println("Actitud:" + FlorPrincipito.getActitud());
        System.out.println("Apariencia:" + FlorPrincipito.getApariencia());
        System.out.println("Estado:" + FlorPrincipito.getEstado());
        System.out.println("Orugas:" + FlorPrincipito.getOrugas());
    }

    
}
