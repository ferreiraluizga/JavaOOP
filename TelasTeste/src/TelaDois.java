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

public class TelaDois extends JFrame{
    public TelaDois(){
        super("Janela 1");
        Container tela = getContentPane();
        tela.setBackground(new Color(128, 125, 150));
        setSize(500, 100);
        setVisible(true);
    }
    public static void main(String []args){
        TelaDois app = new TelaDois();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
