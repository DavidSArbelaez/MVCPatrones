package Vista;

import javax.swing.*;

public class vista extends JPanel{
    public void paintComponent(Graphics g){
  
        super.paintComponent(g);
         
        File miimagen= new File("./src/imgs/messi.jpeg");
         
        try{
            imagen=ImageIO.read(miimagen); //lanza excepción
        }
        catch(IOException e){
         System.out.println("La imagen no se encuentra");
        }
         
        g.drawImage(imagen, 0, 0, null);  
         
    }  
}