/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package janelaminimizada;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class JanelaMinimizada extends JFrame{
    public JanelaMinimizada(){
        super("Como exibir a janela minimizada");
        setSize(300, 150);
        setVisible(true);
        //para abrir janela minimizada
        setExtendedState(ICONIFIED);
    }
    public static void main(String[] args) {
        JanelaMinimizada app = new JanelaMinimizada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
