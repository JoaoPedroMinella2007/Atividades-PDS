import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ValidarIdade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JLabel lblResposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValidarIdade frame = new ValidarIdade();
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
	public ValidarIdade() {
		setTitle("Validador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(129, 94, 34, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(166, 91, 109, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(129, 125, 34, 14);
		contentPane.add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(166, 122, 109, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setBounds(58, 217, 333, 14);
		contentPane.add(lblResposta);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// mostrarResultado();		
				String nome = txtNome.getText();
				String idadeStr = txtIdade.getText();
				
				if(nome.isEmpty()) {
					
					lblResposta.setText("Por favor, insira o nome.");		
					
				return;
				}
				
				try{				
				
					int idade = Integer.parseInt(idadeStr);
					
					if(idade < 0) {
						
						lblResposta.setText("Idade negativa? Por favor, insira uma idade válida (>0)");
					
					return;
					}
					
					String mensagem = "Nome: " + nome + ", Idade: " + idade;
					
				if(idade < 18) {	
					mensagem += " (Menor de idade)";	
				}else {
					mensagem += " (Maior de idade)";
				}
					
					lblResposta.setText(mensagem);
					
				}catch(NumberFormatException ex) {
					
					lblResposta.setText("Por favor, insira uma idade válida!!!");
				}
			}
		});
		btnValidar.setBounds(177, 167, 89, 23);
		contentPane.add(btnValidar);
		
}
	
	/*private void mostrarResultado() {
		
		String nome = txtNome.getText();
		String idadeStr = txtIdade.getText();
		
		lblResposta.setText(nome);*/
		
	//}
}
