package Fichas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FunciónFichas extends JFrame {
    private FuncionamientoFichas FichaSeleccionada;
    private JButton BotonFichaJugador;
    private JButton BotonFichaOponente;

    public FunciónFichas(){
        FuncionamientoFichas FichaJugador=new FuncionamientoFichas("Ficha Jugador",1, false,false);
        FuncionamientoFichas FichaOponente= new FuncionamientoFichas("Ficha Oponente",2,false,false);

        BotonFichaJugador.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                FichaSeleccionada=FichaJugador;
            }
        });

        BotonFichaOponente.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                FichaSeleccionada=FichaOponente;
            }
        });

        // Lógica de ataque entre fichas
        BotonFichaJugador.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                if(FichaSeleccionada!=null&&FichaSeleccionada!=FichaJugador){
                    FichaSeleccionada.atacar(FichaJugador);
                }
            }
        });

        BotonFichaOponente.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                if(FichaSeleccionada!=null&&FichaSeleccionada!=FichaOponente){
                    FichaSeleccionada.atacar(FichaOponente);
                }
            }
        });
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                FunciónFichas juego=new FunciónFichas();
                juego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                juego.pack();
                juego.setVisible(true);
            }
        });
    }
}

