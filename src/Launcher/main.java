package Launcher;
import Controlador.controlador;
import Modelo.modelo;
import Vista.vista;
import java.io.IOException;
/**
 *
 * @author golden
 */
public class launcher {
    public static void main(String[] args) throws IOException {
        modelo model = new modelo();
        vista view = new vista(model);
        controlador c = new controlador(model,view);
    }
}
