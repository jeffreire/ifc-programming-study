package arquivos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManipuladorDeArquivos {

	public static boolean verificarArquivo(String caminho) {
		File arquivo = new File(caminho);
		boolean existe = arquivo.exists();
		return existe;
	}

	public boolean criarArquivo(String caminho) {
		File arquivo = new File(caminho);
		try {
			return arquivo.createNewFile();
		} catch (IOException e) {
			return false;
		}
	}

	public static boolean escreverArquivo(String caminho, String conteudo) {
		try {
			FileWriter arq = new FileWriter(caminho, true);
			arq.write(conteudo);
			arq.close();
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	public static ArrayList<String> lerArquivo(String caminho) {
		ArrayList<String> texto = new ArrayList<String>();
		try {
			FileReader arq = new FileReader(caminho);
			BufferedReader bufferLeitura = new BufferedReader(arq);
			String linha = bufferLeitura.readLine();
			while (linha != null) {
				texto.add(linha);
				linha = bufferLeitura.readLine();
			}
			bufferLeitura.close();
		} catch (IOException e) {
			return null;
		}
		return texto;
	}
}