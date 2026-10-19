import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


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

    System.out.println("IMPRESION DE PIEZAS CON DATOS DESDE EL PROGRAMA:");
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
    System.out.println("==========================================================================================================");
    recorrerAreglo(arregloAlfilN);
    recorrerAreglo(arregloAlfilB);
    recorrerAreglo(arregloCaballoN);
    recorrerAreglo(arregloCaballoB);
    recorrerAreglo(arregloTorreN);
    recorrerAreglo(arregloTorreB);
    recorrerAreglo(arregloPeonN);
    recorrerAreglo(arregloPeonB);
    recorrerAreglo(reyN);
    recorrerAreglo(reyB);
    recorrerAreglo(reinaN);
    recorrerAreglo(reinaB);
    System.out.println("==========================================================================================================");
    System.out.println("IMPRESION DE PIEZAS CON DATOS DESDE LA BD:");
    mostrarPiezasBD();
    }

   ///METODOS/// 
    public static void imprimir (Piezas arr[]){
        for(Piezas p:arr){
            System.out.println(p);
        }
    }

    public static void mostrarPiezasBD()
	{
		//Objeto para ejecutar la consulta en la base de datos
    	AccesoD accesoBD = null;
    	Connection con = null;
    	Statement sentencia = null;
		ResultSet rs = null;
	
		// Se crea la consulta usando lenguaje SQL Estandar y almacenando en la variable query
		String query = "select idPieza, \n" + //
                        "TP.DescripciondePieza as TipoPieza , \n" + //
                        "C.Descripcion as Color, \n" + //
                        "P.Descripcion as ResumenPieza, \n" + //
                        "Posicion, \n" + //
                        "Movimiento, \n" + //
                        "Comportamiento, \n" + //
                        "Velocidad \n" + //
                        "from Pieza P inner join tipopieza TP on P.idtipoPieza = TP.idtipoPieza\n" + //
                        "inner join Color C on P.idColor = C.idColor";
        //En este bloque se ejecutan las sentencias necesarias para acceder a la BD y obtener la informacion
        try {
        	// Instancio un objeto de acceso a datos
        	accesoBD = new AccesoD();
			
            //Obtener la conexion para poder generar la sentencia de consulta
            con = accesoBD.getConexion();
            sentencia = con.createStatement();
            
            //Ejecuta la consulta y almacena el resultado en rs
            rs  = sentencia.executeQuery(query);
            
            // Procesa el resultSet y muestra la informacion obtenida desde la BD
            while(rs.next()){
            	
            		int idPieza = rs.getInt("IDPIEZA");
            		System.out.println("Pieza Nro: " + String.valueOf(idPieza)
                    + ", Tipo: " + rs.getString("TipoPieza") + ", Color: " + rs.getString("Color")
                    + ", Movimiento: " + rs.getString("MOVIMIENTO")
                    + ", Comportamiento: " + rs.getString("COMPORTAMIENTO") + ", Velocidad: " + rs.getInt("VELOCIDAD"));        	         		         			
			}    
        } catch (SQLException e) {
            System.err.println("Error al CARGAR DATOS");
        }
       finally
        {
        	try
        	{
        		// Cierra el ResultSet
        		if (rs!= null) rs.close();
        		// Cierra la sentencia
        		if (sentencia!= null) sentencia.close();
        		// Cierra la conexion
        		if (con != null) con.close();
        		
        	}catch (SQLException e)
        	{
        		System.err.println("Error al cerrar conexion");
        	}
        }
	}

    public static void insertarPiezasBD(Piezas p)
	{
		//Objeto para ejecutar la consulta en la base de datos
    	AccesoD accesoBD = null;
    	Connection con = null;
    	PreparedStatement sentencia = null;
		
		// Se crea la consulta usando lenguaje SQL Estandar y almacenando en la variable query
		String query = "INSERT INTO pieza(Descripcion, idColor, idTipoPieza, Movimiento, Comportamiento, Velocidad) VALUES(?, ?, ?, ?, ?, ?);";
        //En este bloque se ejecutan las sentencias necesarias para acceder a la BD y obtener la informacion
        try {
        	// Instancio un objeto de acceso a datos
        	accesoBD = new AccesoD();
			
            //Obtener la conexion para poder generar la sentencia de consulta
            con = accesoBD.getConexion();
            sentencia = con.prepareStatement(query);
            int idColor = obtenerColor(p);
            int idTipoPieza= obtenerClase(p);
            String des= p.getClass().getSimpleName() +" "+ p.getColor();

            sentencia.setString(1,des);
            sentencia.setInt(2,idColor);
            sentencia.setInt(3,idTipoPieza);
            sentencia.setString(4,p.getMovimiento());
            sentencia.setString(5,p.getComportamiento());
            sentencia.setInt(6,p.getVelocidad());

            sentencia.executeUpdate();
        System.out.println("Pieza insertada con éxito.");
        } catch (SQLException e) {
            System.err.println("Error al insertar la pieza.");
            e.printStackTrace();
        }
                    
    }
	
    public static int obtenerColor(Piezas p){
        int id=0;
        if (p.getColor() == "BLANCO") {
            id= 1;
        }else {
            id= 2;
        }
        return id;
    }

    public static int obtenerClase(Piezas p){
       int id=0;
       String clase= p.getClass().getSimpleName();
       if (clase == "Reina"){
            id=1;
       }else if (clase=="Rey"){
            id=2;
       }else if (clase=="Torre"){
            id=3;
       }else if (clase=="Alfil"){
            id=4;
       }else if (clase=="Caballo"){
            id=5;
       }else if (clase=="Peon"){
            id=6;
       } else{
        System.out.println("Pieza no valida");
       }
       return id; 
    }

    public static void recorrerAreglo(Piezas arr[]){
        for(Piezas p:arr){
            insertarPiezasBD(p);
        }
    }
}

