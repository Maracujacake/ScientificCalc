// tentativa de criação de GUI - tem que adicionar na Main ainda uma instancia desse negocio
package gui;

// importações
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcGUI extends JFrame implements ActionListener{
    private JTextField textField;
    private JButton[] botoes;

    public CalculadoraGUI() {
        // Configurações básicas da janela
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

         // Inicializa os componentes
        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        botoes = new JButton[16];
        // numeros 0 - 9
        for (int i = 0; i < 10; i++) {
            botoes[i] = new JButton(String.valueOf(i));
            botoes[i].addActionListener(this);
        }

        // botoes adicionais de operacoes
        botoes[10] = new JButton("+");
        botoes[11] = new JButton("-");
        botoes[12] = new JButton("*");
        botoes[13] = new JButton("/");
        botoes[14] = new JButton("C");
        botoes[15] = new JButton("=");


         // Adiciona os botões à grade
        JPanel painelBotoes = new JPanel(new GridLayout(4, 4));
            for (JButton botao : botoes) {
                painelBotoes.add(botao);
            }
            add(painelBotoes, BorderLayout.CENTER);
 
            // Configurações finais da janela
            pack();
            setLocationRelativeTo(null);
            setVisible(true);
    }

        // Método actionPerformed para tratar eventos de botão
    @Override
    public void actionPerformed(ActionEvent e) {
        // Adicione o código para lidar com eventos de botão aqui
    }

    // Método principal
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraGUI());
    }
}

    
