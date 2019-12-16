package patrones;

public class Main 
{
	public static void main(String[] args)
    {
		FabricadeAviones fabrica = new FabricadeAviones();
		Estado objState = new Estado();

		objState.mostrarAviso();
		IModelosLigeros avion1 = fabrica.getLine( "Boeing" );
        IModelosLigeros avion2 = fabrica.getLine( "Airbus" );
        IModelosLigeros avion3 = fabrica.getLine( "Embraer" );
        IModelosLigeros avion4 = fabrica.getLine( "Boeing" );
        
        System.out.println("-------------------");

        avion1.fabricar( 1, 4 );
        avion2.fabricar( 2, 5 );
        avion3.fabricar( 3, 6 );
        avion4.fabricar( 4, 7 );
    }
	
}
