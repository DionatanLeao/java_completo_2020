package br.com.java.trabalhando_com_arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/***
 * 
 * @author dionatan
 *
 */

public class Program {

	public static void main(String[] args) {

		File file = new File("/home/dionatan/workspace/working-files-java/teste.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
