package patrones;

public class Estado 
{
	private EstadoFabrica objEstadoFab;

    // -------------------------------------------

    public Estado() {
        this.objEstadoFab = new LineaAbierta(this);
    }

    // -------------------------------------------

    public void setEstado( EstadoFabrica objEstadoFabricacion ) {
        this.objEstadoFab = objEstadoFabricacion;
    }

    // -------------------------------------------

    public void mostrarAviso() {
        this.objEstadoFab.mostrar();
    }
}
