package patrones;

public class Aviones implements IModelosLigeros 

{
		private String marca;

	    // --------------------

	    public Aviones( String marca )
	    {
	        this.marca = marca;
	    }

	    // --------------------

	    @Override
	    public String getMarca()
	    {
	        return this.marca;
	    }

	    // --------------------

	    @Override
	    public void fabricar( int hgr, int space )
	    {
	        System.out.println( "Fabricando avion [" + this.marca + "] en [" + hgr + "," + space + "]" );
	    }
}
