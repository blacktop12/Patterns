package patrones;

public class LineaCerrada extends EstadoFabrica
{
    public LineaCerrada( Estado objState ) {
        this.objState = objState;
    }

    @Override
    public void mostrar() {
        System.out.println("Alerta roja");
    }
}