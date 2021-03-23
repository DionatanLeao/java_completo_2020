package br.com.java.trabalhando_com_arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/***
 * 
 * @author dionatan
 *
 */

public class FileWriterBufferedWriter {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "/home/dionatan/workspace/working-files-java/teste.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
