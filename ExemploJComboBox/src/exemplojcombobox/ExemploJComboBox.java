/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplojcombobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJComboBox extends JFrame{
    //elementos da tela
    JComboBox lista;
    String cidades[] = {"Rio de Janeiro", "São Paulo", "Minas Gerais", "Espírito Santo",
    "Bahia", "Pernambuco", "Rio Grande do Sul", "Acre"};
    JButton exibir;
    JLabel rotulo;
    
    //construtor
    public ExemploJComboBox(){
        super("Exemplo de JComboBox"); //nome da janela
        
        //criação da tela
        Container tela = getContentPane();
        setLayout(null);
        
        exibir = new JButton("Exibir");
        rotulo = new JLabel("");
        lista = new JComboBox(cidades);
        lista.setMaximumRowCount(5);
        lista.setBounds(50, 50, 150, 30);
        exibir.setBounds(270, 50, 100, 30);
        rotulo.setBounds(50, 150, 200, 30);
        
        exibir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rotulo.setText("O estado é: " + lista.getSelectedItem().toString());
                    }
                }
        );
        
        tela.add(lista);
        tela.add(exibir);
        tela.add(rotulo);
        setSize(400, 250);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ExemploJComboBox app = new ExemploJComboBox();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
