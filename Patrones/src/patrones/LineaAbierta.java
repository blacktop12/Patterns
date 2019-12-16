package patrones;

public class LineaAbierta extends EstadoFabrica
{
	public LineaAbierta( Estado objState ) {
        this.objState = objState;
    }

    @Override
    public void mostrar() {
        System.out.println("Linea de produccion libre");
    }
}
