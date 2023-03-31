package Modelo;
import java.util.Random;
import java.awt.Point;
/**
 *
 * @author golden
 */
public class modelo {
    private ImageFactory imageFactory;
    private Point position;
    
    public modelo() {
        this.imageFactory = new ImageFactory();
        this.position = new Point(0, 0);
    }
    
    public void setPosition(int x, int y) {
        this.position.setLocation(x, y);
    }
    
    public Point getPosition() {
        return this.position;
    }
    
    public ImageFactory getImageFactory() {
        return this.imageFactory;
    }
    
    public void generateRandomPosition(int maxX, int maxY) {
        Random random = new Random();
        int x = random.nextInt(maxX);
        int y = random.nextInt(maxY);
        this.setPosition(x, y);
    }

}
