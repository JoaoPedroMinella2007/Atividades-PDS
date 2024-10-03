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

public class CalcularBaseAlturaRetangulo extends JFrame {

	private JPanel contentPane;
	private JTextField txtCampoBase;
	private JTextField txtCampoAltura;
	private JLabel lblReposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcularBaseAlturaRetangulo frame = new CalcularBaseAlturaRetangulo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public double calcularPerimetro() {
			
		String Base = txtCampoBase.getText();
        double base = Double.parseDouble(Base);
        
        String Altura = txtCampoAltura.getText();
        double altura = Double.parseDouble(Base);
        
		return 2*(altura+base);
	}
	
	public double calcularAltura() {
		
		String Base = txtCampoBase.getText();
        double base2 = Double.parseDouble(Base);
        
        String Altura = txtCampoAltura.getText();
        double altura2 = Double.parseDouble(Base);
        
		return base2+altura2;
	}

	/**
	 * Create the frame.
	 */
	public CalcularBaseAlturaRetangulo() {
		setTitle("Calcular base e altura de um retângulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Base:");
		lblBase.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBase.setBounds(107, 105, 86, 14);
		contentPane.add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura: ");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAltura.setBounds(107, 132, 69, 14);
		contentPane.add(lblAltura);
		
		JLabel lblInformacao = new JLabel("Informe a base e a altura de um retângulo");
		lblInformacao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInformacao.setBounds(84, 50, 314, 14);
		contentPane.add(lblInformacao);
		
		txtCampoBase = new JTextField();
		txtCampoBase.setBounds(159, 103, 101, 20);
		contentPane.add(txtCampoBase);
		txtCampoBase.setColumns(10);
		
		txtCampoAltura = new JTextField();
		txtCampoAltura.setBounds(159, 130, 101, 20);
		contentPane.add(txtCampoAltura);
		txtCampoAltura.setColumns(10);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setBounds(65, 172, 343, 14);
		contentPane.add(lblResposta);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		           
					 lblResposta.setText(String.format("Retângulo com perímetro de tamanho " + calcularPerimetro() + " e altura " + calcularAltura()));
		           
		        } catch (NumberFormatException ex) {
		          
		            lblResposta.setText("Por favor, insira um número válido.");
		            
		        } catch (Exception ex) {
		            
		            lblResposta.setText("Ocorreu um erro: " + ex.getMessage());
		        }
			}
		});
		btnCalcular.setBounds(159, 197, 104, 23);
		contentPane.add(btnCalcular);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(159, 231, 104, 23);
		contentPane.add(btnFechar);
		
	}
	
}
