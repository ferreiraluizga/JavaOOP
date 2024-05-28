/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploformattedtextfield;

/**
 *
 * @author luizg
 */

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class ExemploFormattedTextField extends JFrame {
    JFormattedTextField cep, tel, cpf, data;
    JLabel rotulocep, rotulotel, rotulocpf, rotulodata;
    MaskFormatter mascaracep, mascaratel, mascaracpf, mascaradata;

    public ExemploFormattedTextField() {
        super("Exemplo com JFormattedTextField");
        Container tela = getContentPane();
        setLayout(null);

        rotulocep = new JLabel("CEP: ");
        rotulotel = new JLabel("Telefone: ");
        rotulocpf = new JLabel("CPF: ");
        rotulodata = new JLabel("Data: ");
        rotulocep.setBounds(50, 40, 100, 20);
        rotulotel.setBounds(50, 80, 100, 20);
        rotulocpf.setBounds(50, 120, 100, 20);
        rotulodata.setBounds(50, 160, 100, 20);

        try {
            mascaracep = new MaskFormatter("#####-###");
            mascaratel = new MaskFormatter("(##)####-####");
            mascaracpf = new MaskFormatter("###.###.###-##");
            mascaradata = new MaskFormatter("##/##/####");
            mascaracep.setPlaceholderCharacter('_');
            mascaratel.setPlaceholderCharacter('_');
            mascaracpf.setPlaceholderCharacter('_');
            mascaradata.setPlaceholderCharacter('_');
        } catch (ParseException excp) {
        }
        cep = new JFormattedTextField(mascaracep);
        tel = new JFormattedTextField(mascaratel);
        cpf = new JFormattedTextField(mascaracpf);
        data = new JFormattedTextField(mascaradata);
        
        cep.setBounds(150, 40, 100, 20);
        tel.setBounds(150, 80, 100, 20);
        cpf.setBounds(150, 120, 100, 20);
        data.setBounds(150, 160, 100, 20);
        
        tela.add(rotulocep);
        tela.add(rotulotel);
        tela.add(rotulocpf);
        tela.add(rotulodata);
        tela.add(cep);
        tela.add(tel);
        tela.add(cpf);
        tela.add(data);
        
        setSize(400, 250);
        setVisible(true);
    }
    public static void main(String args[]) {
        ExemploFormattedTextField app = new ExemploFormattedTextField();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

