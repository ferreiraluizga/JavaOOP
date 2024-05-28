package interfaceLogin;

/**
 *
 * @author ferreiraluizga
 */

//importando interface gráfica
import javax.swing.*;
import java.awt.*;

public class InterfaceLogin extends JFrame{
    //atributos e elementos a serem colocados na tela
    JLabel rotuloNome, rotuloSenha, rotuloComentario;
    JTextField textoNome, textoSenha, textoComentario;
    JButton entrar, cancelar;
    
    public InterfaceLogin(){
        //nomeando janela com herança
        super("Exemplo prático - Interface Login");
        
        //criação da tela
        Container tela = getContentPane();
        setLayout(null);
        
        //instaciação dos atributos
        rotuloNome = new JLabel("Nome");
        textoNome = new JTextField(50);
        rotuloSenha = new JLabel("Senha");
        textoSenha = new JTextField(50);
        rotuloComentario = new JLabel("Comentário");
        textoComentario = new JTextField(50);
        entrar = new JButton("OK");
        cancelar = new JButton("Cancelar");
        
        //mudando disposição do texto no comentario
        textoComentario.setHorizontalAlignment(JTextField.LEFT);
        
        //posicionando elementos
        rotuloNome.setBounds(20, 10, 80, 20);
        textoNome.setBounds(20, 30, 300, 20);
        rotuloSenha.setBounds(20, 60, 80, 20);
        textoSenha.setBounds(20, 80, 300, 20);
        rotuloComentario.setBounds(20, 110, 250, 20);
        textoComentario.setBounds(20, 130, 300, 100);
        entrar.setBounds(20, 240, 60, 30);
        cancelar.setBounds(90, 240, 90, 30);
        
        
        //adicionando à tela
        tela.add(rotuloNome);
        tela.add(textoNome);
        tela.add(rotuloSenha);
        tela.add(textoSenha);
        tela.add(textoComentario);
        tela.add(rotuloComentario);
        tela.add(entrar);
        tela.add(cancelar);
        
        //tamanho e visibilidade da tela
        setResizable(false);
        setSize(380, 400);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    //execução da janela
    public static void main(String[] args) {
        InterfaceLogin app = new InterfaceLogin();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
