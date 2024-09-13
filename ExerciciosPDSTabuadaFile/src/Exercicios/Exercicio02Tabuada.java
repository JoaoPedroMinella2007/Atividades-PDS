package Exercicios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio02Tabuada {

	public static void main(String[] args) throws IOException {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe um numero de 1 a 10: ");
		int num = leitura.nextInt();
		String nomeArquivo = "tabuada_" + num + ".txt";
		
		File file = new File(nomeArquivo);
		
		if(!file.exists()) {
			System.out.println("O arquivo não existe!");
		}else {
			System.out.println("O arquivo existe e se chama " + nomeArquivo);
			
			// Modificar o caminho do Arquivo conforme a máquina, neste caminho, usei a máquina do IFSC.
			String caminhoArquivo = "C:\\Users\\Aluno\\eclipse-workspace\\TabuadaPDS\\tabuada_2.txt"; 
				try {
					BufferedReader Leitor = new BufferedReader(new FileReader(caminhoArquivo));
					System.out.println("Lendo arquivo...");
					String Linha = "";
					while((Linha = Leitor.readLine()) != null) {
						System.out.println(Linha);
						
					}
				}catch(FileNotFoundException e){
					e.printStackTrace();
				}
		}

	}

}
