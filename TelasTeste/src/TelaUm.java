/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

import javax.swing.*;
import java.awt.*;

public class TelaUm extends JFrame{
    public TelaUm(){
        super("Janela 1");
        Container tela = getContentPane();
        tela.setBackground(new Color(255, 120, 120));
        setSize(500, 100);
        setVisible(true);
    }
    public static void main(String []args){
        TelaUm app = new TelaUm();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
