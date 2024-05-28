/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package janelamaximizada;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class JanelaMaximizada extends JFrame{
    public JanelaMaximizada(){
        super("Como exibir a janela maximizada");
        setSize(300, 150);
        setVisible(true);
        //para deixar janela maximizada
        setExtendedState(MAXIMIZED_BOTH);
    }
    public static void main(String[] args) {
        JanelaMaximizada app = new JanelaMaximizada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
