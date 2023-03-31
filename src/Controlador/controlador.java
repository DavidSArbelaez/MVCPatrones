package Controlador;
import java.io.IOException;
import javax.swing.JFrame;
import Modelo.modelo;
import Vista.vista;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author golden
 */
public class controlador {
    private modelo model;
    private vista view;
    
    public controlador(modelo model, vista view) {
        this.model = model;
        this.view = view;
        this.generateRandomPosition();
        this.startTimer();
    }
    
    private void generateRandomPosition() {
        this.model.generateRandomPosition(500, 500);
    }
    
    private void startTimer() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                generateRandomPosition();
                view.update();
            }
        }, 0, 2000);
    }
    
}
