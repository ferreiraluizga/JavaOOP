/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;

public class TelaTres extends JFrame{
    public TelaTres(){
        super("Janela 1");
        Container tela = getContentPane();
        tela.setBackground(Color.yellow);
        setSize(500, 100);
        setVisible(true);
    }
    public static void main(String []args){
        TelaTres app = new TelaTres();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
