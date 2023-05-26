package herencia.herencia;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Draw extends Canvas {

   private BufferedImage image;
   private BufferedImage image2;

   public Draw() {
       try {
           // Cargar la primera imagen desde el archivo PNG
           image = ImageIO.read(new File("C:\\Users\\PC\\chip.png"));
           // Cargar la segunda imagen desde el archivo PNG
           image2 = ImageIO.read(new File("C:\\Users\\PC\\pene.png"));
       } catch (Exception e) {
           e.printStackTrace();
       }
       
       addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Obtener las coordenadas del clic
                int x = e.getX();
                int y = e.getY();

                // Verificar si el clic se encuentra dentro de los límites de la imagen1
                if (x >= 10 && x <= 60 && y >= 10 && y <= 60) {
                    mostrarEspecificacionesImagen(image, "chip.png");
                }
                
                // Verificar si el clic se encuentra dentro de los límites de la imagen2
                if (x >= 70 && x <= 120 && y >= 10 && y <= 60) {
                    mostrarEspecificacionesImagen(image2, "pene.png");
                }
            }
        });
   }

   @Override
   public void paint(Graphics g) {
       // Dibujar la primera imagen en el objeto Canvas
       g.drawImage(image, 10, 10, 50, 50, this);
       // Dibujar la segunda imagen en el objeto Canvas
       g.drawImage(image2, 70, 10, 50, 50, this);
   }

   private void mostrarEspecificacionesImagen(BufferedImage img, String nombreImagen) {
       int width = img.getWidth();
       int height = img.getHeight();
       int type = img.getType();
       
       System.out.println("Especificaciones de la imagen: " + nombreImagen);
       System.out.println("Ancho: " + width);
       System.out.println("Alto: " + height);
       System.out.println("Tipo: " + type);
   }

   public static void main(String[] args) {
       Draw canvas = new Draw();
       Frame frame = new Frame();
       frame.setSize(300, 300);
       frame.add(canvas);
       frame.setVisible(true);
   }
}
