/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cordefundo;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Admin
 */
public class CorDeFundo extends JFrame{
    public CorDeFundo(){
        super("Definindo a cor de fundo para a janela e icone");
        Container tela = getContentPane();
        //para criar icone e definir
        ImageIcon icone = new ImageIcon("homer.png");
        setIconImage(icone.getImage());
        tela.setBackground(new Color(128, 125, 150));
        setSize(500, 100);
        setVisible(true);
    }
    public static void main(String[] args) {
        CorDeFundo app = new CorDeFundo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
