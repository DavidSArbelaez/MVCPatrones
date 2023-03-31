package Vista;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import Modelo.modelo;
import javax.swing.JPanel;
/**
 *
 * @author golden
 */
public class vista {
    private modelo model;
    private JFrame frame;
    private JPanel panel;
    private BufferedImage image;
    
    public vista(modelo model) {
        this.model = model;
        this.frame = new JFrame("Flyweight pattern example");
        this.panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Point position = model.getPosition();
                BufferedImage image = model.getImageFactory().getImage();
                g.drawImage(image, position.x, position.y, null);
            }
        };
        this.panel.setPreferredSize(new Dimension(500, 500));
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().add(panel, BorderLayout.CENTER);
        this.frame.pack();
        this.frame.setVisible(true);
    }
    
    public void update() {
        this.panel.repaint();
    }
}
