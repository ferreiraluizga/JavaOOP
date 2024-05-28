/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package janelacentralizada;

/**
 *
 * @author Admin
 */
import javax.swing.*;

public class JanelaCentralizada extends JFrame{
    
    public JanelaCentralizada(){
        super("Janela Centralizada");
        setSize(300, 150);
        setVisible(true);
        //para janela ficar centralizada
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        JanelaCentralizada app = new JanelaCentralizada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
