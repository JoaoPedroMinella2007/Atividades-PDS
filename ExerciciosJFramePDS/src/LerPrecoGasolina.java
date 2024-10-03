import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LerPrecoGasolina extends JFrame {

	private JPanel contentPane;
	private JTextField txtCampoPrecoGasolina;
	private JTextField txtCampoTotalPagar;
	private JLabel lblReposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LerPrecoGasolina frame = new LerPrecoGasolina();
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
	public LerPrecoGasolina() {
		setTitle("Calcular preço da gasolina ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrecoGasolina = new JLabel("Gasolina R$: ");
		lblPrecoGasolina.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrecoGasolina.setBounds(63, 42, 157, 14);
		contentPane.add(lblPrecoGasolina);
		
		JLabel lblTotalPagar = new JLabel("Total a pagar R$:");
		lblTotalPagar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotalPagar.setBounds(30, 79, 190, 14);
		contentPane.add(lblTotalPagar);
		
		txtCampoPrecoGasolina = new JTextField();
		txtCampoPrecoGasolina.setBounds(144, 40, 190, 20);
		contentPane.add(txtCampoPrecoGasolina);
		txtCampoPrecoGasolina.setColumns(10);
		
		txtCampoTotalPagar = new JTextField();
		txtCampoTotalPagar.setBounds(144, 77, 190, 20);
		contentPane.add(txtCampoTotalPagar);
		txtCampoTotalPagar.setColumns(10);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setHorizontalAlignment(SwingConstants.CENTER);
		lblResposta.setBounds(63, 128, 361, 14);
		contentPane.add(lblResposta);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			          
					String precoGasolina = txtCampoPrecoGasolina.getText();
		            double precoGasosa = Double.parseDouble(precoGasolina);
		            
		            String totalPagar = txtCampoTotalPagar.getText();
		            double totalPagamento = Double.parseDouble(totalPagar);
		            
		            double Qlitros = totalPagamento / precoGasosa;
		                  
		            lblResposta.setText(String.format("Litros possiveis de Gasolina : %.2f L", Qlitros));
			           
		        } catch (Exception ex) {
		          
		            lblResposta.setText("Por favor, insira um número válido." + ex.getMessage());
			}
			}
		});
		btnCalcular.setBounds(170, 168, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(170, 202, 89, 23);
		contentPane.add(btnFechar);
		
		
	}

}
