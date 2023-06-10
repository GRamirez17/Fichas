package Fichas;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ImagenFichas {
    private String nombre;
    private ImageIcon imagen;
    private String tipo;

    public ImagenFichas(String nombre,String rutaImagen,String tipo) {
        this.nombre=nombre;
        this.imagen=new ImageIcon(rutaImagen);
        this.tipo=tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public String getTipo() {
        return tipo;
    }

    public static void main(String[] args){
        String RutaImagenesHeroes="C:\\Users\\USER\\Downloads\\Imágenes descargadas\\Fichas\\Héroes\\";
        String RutaImagenesVillanos="C:\\Users\\USER\\Downloads\\Imágenes descargadas\\Fichas\\Villanos\\";
        Map<Integer, String[]>RutasImagenesFichas=new HashMap<>();

        RutasImagenesFichas.put(1,new String[]{
            RutaImagenesHeroes+"Rango 1.png",
            RutaImagenesHeroes+"Rango 2.1.png",
            RutaImagenesHeroes+"Rango 2.2.png",
            RutaImagenesHeroes+"Rango 2.3.png",
            RutaImagenesHeroes+"Rango 2.4.png",
            RutaImagenesHeroes+"Rango 2.5.png",
            RutaImagenesHeroes+"Rango 2.6.png",
            RutaImagenesHeroes+"Rango 2.7.png",
            RutaImagenesHeroes+"Rango 2.8.png",  
            RutaImagenesHeroes+"Rango 3.1.png",
            RutaImagenesHeroes+"Rango 3.2.png",
            RutaImagenesHeroes+"Rango 3.3.png",
            RutaImagenesHeroes+"Rango 3.4.png",
            RutaImagenesHeroes+"Rango 3.5.png",
            RutaImagenesHeroes+"Rango 4.1.png",
            RutaImagenesHeroes+"Rango 4.2.png",
            RutaImagenesHeroes+"Rango 4.3.png",
            RutaImagenesHeroes+"Rango 4.4.png",
            RutaImagenesHeroes+"Rango 5.1.png",
            RutaImagenesHeroes+"Rango 5.2.png",
            RutaImagenesHeroes+"Rango 5.3.png",
            RutaImagenesHeroes+"Rango 5.4.png",
            RutaImagenesHeroes+"Rango 6.1.png",
            RutaImagenesHeroes+"Rango 6.2.png",
            RutaImagenesHeroes+"Rango 6.3.png",
            RutaImagenesHeroes+"Rango 6.4.png",
            RutaImagenesHeroes+"Rango 7.1.png",
            RutaImagenesHeroes+"Rango 7.2.png",
            RutaImagenesHeroes+"Rango 7.3.png",
            RutaImagenesHeroes+"Rango 8.1.png",
            RutaImagenesHeroes+"Rango 8.2.png",
            RutaImagenesHeroes+"Rango 9.png",
            RutaImagenesHeroes+"Rango 10.png",
            RutaImagenesHeroes+"Nova Blast.png",
            RutaImagenesHeroes+"Tierra-Héroes.png",
        });

        RutasImagenesFichas.put(2,new String[]{
            RutaImagenesVillanos+"Rango 1.png",
            RutaImagenesVillanos+"Rango 2.1.png",
            RutaImagenesVillanos+"Rango 2.2.png",
            RutaImagenesVillanos+"Rango 2.3.png",
            RutaImagenesVillanos+"Rango 2.4.png",
            RutaImagenesVillanos+"Rango 2.5.png",
            RutaImagenesVillanos+"Rango 2.6.png",
            RutaImagenesVillanos+"Rango 2.7.png",
            RutaImagenesVillanos+"Rango 2.8.png",
            RutaImagenesVillanos+"Rango 3.1.png",
            RutaImagenesVillanos+"Rango 3.2.png",
            RutaImagenesVillanos+"Rango 3.3.png",
            RutaImagenesVillanos+"Rango 3.4.png",
            RutaImagenesVillanos+"Rango 3.5.png",
            RutaImagenesVillanos+"Rango 4.1.png",
            RutaImagenesVillanos+"Rango 4.2.png",
            RutaImagenesVillanos+"Rango 4.3.png",
            RutaImagenesVillanos+"Rango 4.4.png",
            RutaImagenesVillanos+"Rango 5.1.png",
            RutaImagenesVillanos+"Rango 5.2.png",
            RutaImagenesVillanos+"Rango 5.3.png",
            RutaImagenesVillanos+"Rango 5.4.png",
            RutaImagenesVillanos+"Rango 6.1.png",
            RutaImagenesVillanos+"Rango 6.2.png",
            RutaImagenesVillanos+"Rango 6.3.png",
            RutaImagenesVillanos+"Rango 6.4.png",
            RutaImagenesVillanos+"Rango 7.1.png",
            RutaImagenesVillanos+"Rango 7.2.png",
            RutaImagenesVillanos+"Rango 7.3.png",
            RutaImagenesVillanos+"Rango 8.1.png",
            RutaImagenesVillanos+"Rango 8.2.png",
            RutaImagenesVillanos+"Rango 9.png",
            RutaImagenesVillanos+"Rango 10.png",
            RutaImagenesVillanos+"Pumpkin Bomb.png",
            RutaImagenesVillanos+"Tierra-Villanos.png",
        });

        ImagenFichas FichaHeroe=new ImagenFichas("Héroe",RutasImagenesFichas.get(1)[0],"Héroe");
        ImagenFichas FichaVillano= new ImagenFichas("Villano",RutasImagenesFichas.get(2)[0], "Villano");

        System.out.println(FichaHeroe.getNombre());

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelHeroe=new JLabel(FichaHeroe.getImagen());
        JLabel labelVillano=new JLabel(FichaVillano.getImagen());

        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(labelHeroe);
        frame.getContentPane().add(labelVillano);

        frame.pack();
        frame.setVisible(true);
    }
}



