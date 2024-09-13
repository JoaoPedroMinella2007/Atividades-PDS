package Exercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01Tabuada {

	public static void main(String[] args) {
	
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe um número de 1 a 10: ");
		int num = leitura.nextInt();
		String nomeArquivo = "tabuada_" + num + ".txt";
		
		try (BufferedWriter escrita = new BufferedWriter (new FileWriter(nomeArquivo))){
			
			for (int i = 0; i <= 10; i++) {			
				escrita.write(num + " X " + i + " = " + (num * i));
				escrita.newLine();			
			}
			
			System.out.println("Tabuada salva no arquivo: "+ nomeArquivo);

		} catch (IOException e) {
			System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
			e.printStackTrace();
		}finally {
			leitura.close();
		}
	}

}
