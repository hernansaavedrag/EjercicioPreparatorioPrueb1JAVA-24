
/**
 *
 * @author Hernan
 */
public class Validaciones {
    
    public boolean esNombreValido(String nombre) {
        if (nombre.isEmpty()) {
            return false;
        }
        else{
            return true;
        }
    }

    public boolean esPrecioValido(double precio) {
        return precio > 0;
    }

    public boolean esCantidadValida(int cantidad) {
        return cantidad >= 0;
    }
    
    
    
}
