package br.com.java.trabalhando_com_arquivos;

import java.io.File;
import java.util.Scanner;

/***
 * 
 * @author dionatan
 *
 */

public class InformacaoCaminho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();		
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		sc.close();

	}

}
