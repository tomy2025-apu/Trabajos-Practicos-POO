public class Main {
    public static void main(String[] args) {

        System.out.println("VIENVENIDO AL PROGRAMA PRINCIPITO");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Texto literario con la flor del principito:\n");
        
        Flor florPrincipito = new Flor();
        florPrincipito.setActitud("vanidosa");
        florPrincipito.setApariencia ("hermosa");
        florPrincipito.setEstado ("sola");
        florPrincipito.setOrugas(5);
        Principito miprincipito = new Principito();
        miprincipito.setFlorPrincipito (florPrincipito);

        System.out.println("El principito tenía una flor que amaba mucho. Cuidaba de ella todos los\r\n" +
        "días, la regaba y le quitaba las orugas. La flor, aunque un poco "+ florPrincipito.getActitud() +",\r\n"+ 
        "era muy " + florPrincipito.getApariencia() + " y agradecía al principito por su dedicación. Un día, el\r\n"+ 
        "principito decidió explorar otros planetas y, aunque no quería dejar " + florPrincipito.getEstado() + "\r\n" +
        "a su flor, sabía que debía continuar su viaje para aprender más sobre el universo. ");

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Texto literario con la flor secundaria:\n");
        

        Flor miFlor = new Flor();
        miFlor.setActitud ("timida");
        miFlor.setApariencia ("linda");
        miFlor.setEstado ("acompañada");
        miFlor.setOrugas(0);

        System.out.println("El principito tenía una flor que amaba mucho. Cuidaba de ella todos los\r\n" +
        "días, la regaba y le quitaba las orugas. La flor, aunque un poco "+ miFlor.getActitud() +",\r\n"+ 
        "era muy " + miFlor.getApariencia() + " y agradecía al principito por su dedicación. Un día, el\r\n"+ 
        "principito decidió explorar otros planetas y, aunque no quería dejar " + miFlor.getEstado() + "\r\n" +
        "a su flor, sabía que debía continuar su viaje para aprender más sobre el universo. ");

        System.out.println("---------------------------------------------------------------------------------");


        System.out.println("Atributos de la flor del principito:");
        miprincipito.ImprimirFlorPrincipito();

        System.out.println("\nAtributos de la flor secundaria:");
        System.out.println("Actitud:" + miFlor.getActitud());
        System.out.println("Apariencia:" + miFlor.getApariencia());
        System.out.println("Estado:" + miFlor.getEstado());
        System.out.println("Orugas:" + miFlor.getOrugas());

    }


}
