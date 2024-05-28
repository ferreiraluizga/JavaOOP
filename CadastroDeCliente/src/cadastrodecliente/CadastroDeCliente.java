/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastrodecliente;

/**
 *
 * @author ferreiraluizga
 */

//importando interface gráfica
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroDeCliente extends JFrame{
    //atributos e elementos a serem colocados na tela
    JLabel titulo, rotuloNome, rotuloCPF, rotuloRG, rotuloEndereco, rotuloCidade, rotuloEstado, rotuloCEP;
    JTextField textoNome, textoCPF, textoRG, textoEndereco, textoCidade, textoEstado, textoCEP;
    JButton cadastrar, sair;
    ImageIcon iconeCadastrar, iconeSair;
    
    //metodo construtor
    public CadastroDeCliente(){
        //rotulo da tela colocado com herança
        super("Cadastro de Cliente");
        
        //criação da tela
        Container tela = getContentPane();
        setLayout(null);
        
        //mudando cor de fundo
        tela.setBackground(new Color(212,208,200));
        
        //instanciação dos atributos
        titulo = new JLabel("Cadastro de Cliente");
        
        rotuloNome = new JLabel("Nome");
        textoNome = new JTextField(50);
        
        rotuloCPF = new JLabel("CPF");
        textoCPF = new JTextField(50);
        
        rotuloRG = new JLabel("RG");
        textoRG = new JTextField(50);
        
        rotuloEndereco = new JLabel("Endereço");
        textoEndereco = new JTextField(50);
        
        rotuloCidade = new JLabel("Cidade");
        textoCidade = new JTextField(50);
        
        rotuloEstado = new JLabel("Estado");
        textoEstado = new JTextField(50);
        
        rotuloCEP = new JLabel("CEP");
        textoCEP = new JTextField(50);
        
        iconeCadastrar = new ImageIcon("cadastrar.png");
        iconeSair = new ImageIcon("sair.png");
        
        cadastrar = new JButton("Cadastrar", iconeCadastrar);
        sair = new JButton("Sair", iconeSair);
        
        //posicionamento dos atributos
        titulo.setBounds(170, 20, 200, 20);
        rotuloNome.setBounds(50, 50, 80, 20);
        textoNome.setBounds(50, 70, 300, 20);
        rotuloCPF.setBounds(50, 100, 80, 20);
        textoCPF.setBounds(50, 120, 150, 20);
        rotuloRG.setBounds(50, 150, 80, 20);
        textoRG.setBounds(50, 170, 130, 20);
        rotuloEndereco.setBounds(50, 200, 80, 20);
        textoEndereco.setBounds(50, 220, 300, 20);
        rotuloCidade.setBounds(50, 250, 80, 20);
        textoCidade.setBounds(50, 270, 250, 20);
        rotuloEstado.setBounds(50, 300, 80, 20);
        textoEstado.setBounds(50, 320, 225, 20);
        rotuloCEP.setBounds(50, 350, 80, 20);
        textoCEP.setBounds(50, 370, 130, 20);
        cadastrar.setBounds(50, 410, 150, 50);
        sair.setBounds(210, 410, 150, 50);
        
        //atalhos
        cadastrar.setMnemonic(KeyEvent.VK_C);
        sair.setMnemonic(KeyEvent.VK_S);
        
        //alterando estilo do titulo
        titulo.setForeground(Color.red);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        
        //colocando atributos na tela
        tela.add(titulo);
        tela.add(rotuloNome);
        tela.add(textoNome);
        tela.add(rotuloCPF);
        tela.add(textoCPF);
        tela.add(rotuloRG);
        tela.add(textoRG);
        tela.add(rotuloEndereco);
        tela.add(textoEndereco);
        tela.add(rotuloCidade);
        tela.add(textoCidade);
        tela.add(rotuloEstado);
        tela.add(textoEstado);
        tela.add(rotuloCEP);
        tela.add(textoCEP);
        tela.add(cadastrar);
        tela.add(sair);
        
        //tamanho e visibilidade da tela
        setResizable(false);
        setSize(500, 550);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    //execução da janela
    public static void main(String[] args) {
        CadastroDeCliente app = new CadastroDeCliente();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
