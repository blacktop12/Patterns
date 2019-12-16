package patrones;

import java.util.ArrayList;
import java.util.List;

public class FabricadeAviones
{
	private List<IModelosLigeros> aviones;

    // --------------------

    public FabricadeAviones()
    {
        this.aviones = new ArrayList<IModelosLigeros>();
    }

    // --------------------

    public IModelosLigeros getLine( String marca )
    {
        for(IModelosLigeros avion : this.aviones)
        {
            if( avion.getMarca().equals(marca) )
            {
                System.out.println("Avion marca [" + marca + "] encontrado, se devuelve.");
                return avion;
            }
        }

        System.out.println("Fabricando avion marca [" + marca + "]");

        IModelosLigeros avion = new Aviones( marca );
        this.aviones.add( avion );

        return avion;
    }
}
