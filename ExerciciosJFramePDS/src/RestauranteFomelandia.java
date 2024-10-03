import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RestauranteFomelandia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCampoPesoPrato;
	private JTextField txtCampoValorQuilo;
	private JLabel lblResposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestauranteFomelandia frame = new RestauranteFomelandia();
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
	public RestauranteFomelandia() {
		setTitle("Restaurante Fomelândia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPesoPratoKG = new JLabel("Peso do prato (KG): ");
		lblPesoPratoKG.setHorizontalAlignment(SwingConstants.LEFT);
		lblPesoPratoKG.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPesoPratoKG.setBounds(27, 74, 133, 14);
		contentPane.add(lblPesoPratoKG);
		
		JLabel lblValorKG = new JLabel("Valor do quilo (KG):");
		lblValorKG.setHorizontalAlignment(SwingConstants.LEFT);
		lblValorKG.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValorKG.setBounds(27, 99, 133, 14);
		contentPane.add(lblValorKG);
		
		txtCampoPesoPrato = new JTextField();
		txtCampoPesoPrato.setHorizontalAlignment(SwingConstants.CENTER);
		txtCampoPesoPrato.setBounds(162, 72, 118, 20);
		contentPane.add(txtCampoPesoPrato);
		txtCampoPesoPrato.setColumns(10);
		
		txtCampoValorQuilo = new JTextField();
		txtCampoValorQuilo.setHorizontalAlignment(SwingConstants.CENTER);
		txtCampoValorQuilo.setBounds(162, 97, 118, 20);
		contentPane.add(txtCampoValorQuilo);
		txtCampoValorQuilo.setColumns(10);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setHorizontalAlignment(SwingConstants.CENTER);
		lblResposta.setBounds(39, 139, 351, 14);
		contentPane.add(lblResposta);
		
		JLabel lblInformacao = new JLabel("Restaurante Fomelândia");
		lblInformacao.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInformacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformacao.setBounds(91, 29, 271, 14);
		contentPane.add(lblInformacao);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
			           
					  String pesoPrato = txtCampoPesoPrato.getText();
			          float PesoDoPrato = Float.parseFloat(pesoPrato);
			          
			          String ValorQuilo = txtCampoValorQuilo.getText();
			          float ValorDoQuilo = Float.parseFloat(ValorQuilo);
			            			           
			          float totalPagar = PesoDoPrato * ValorDoQuilo;
			            
			          lblResposta.setText(String.format("Total a pagar: %.2f R$", totalPagar));
		        
		        } catch (Exception ex) {
		            
		            JOptionPane.showInternalMessageDialog(null, "Erro. Use um ponto (.) para separar casa decimal, e não uma virgula (,) !", "ERROR", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		btnCalcular.setBounds(162, 170, 118, 23);
		contentPane.add(btnCalcular);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(162, 214, 118, 23);
		contentPane.add(btnFechar);
		
	}
}
