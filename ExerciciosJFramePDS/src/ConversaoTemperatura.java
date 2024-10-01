import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversaoTemperatura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCampoInserirTemperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversaoTemperatura frame = new ConversaoTemperatura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConversaoTemperatura() {
		setTitle("Conversão de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSauda = new JLabel("Informe a temperatura em Farenheit");
		lblSauda.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSauda.setBounds(108, 42, 262, 14);
		contentPane.add(lblSauda);
		
		txtCampoInserirTemperatura = new JTextField();
		txtCampoInserirTemperatura.setBounds(156, 67, 121, 20);
		contentPane.add(txtCampoInserirTemperatura);
		txtCampoInserirTemperatura.setColumns(10);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setBounds(97, 113, 312, 14);
		contentPane.add(lblResposta);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   try {
			            // Obtém a temperatura em Fahrenheit a partir do campo de texto
			            String textoTemperatura = txtCampoInserirTemperatura.getText();
			            double temperaturaFahrenheit = Double.parseDouble(textoTemperatura);
			            
			            // Converte para Celsius
			            double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;
			            
			            // Exibe o resultado
			            lblResposta.setText(String.format("Temperatura convertida para Celsius: %.2f °C", temperaturaCelsius));
			        } catch (NumberFormatException ex) {
			            // Exibe uma mensagem de erro se a entrada não for um número válido
			            lblResposta.setText("Por favor, insira um número válido.");
			        } catch (Exception ex) {
			            // Para capturar outras exceções
			            lblResposta.setText("Ocorreu um erro: " + ex.getMessage());
			        }
			}
		});
		btnConverter.setBounds(156, 170, 121, 23);
		contentPane.add(btnConverter);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnFechar.setBounds(156, 204, 121, 23);
		contentPane.add(btnFechar);
	}
}
