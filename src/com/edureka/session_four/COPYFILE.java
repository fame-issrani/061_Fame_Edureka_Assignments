package com.edureka.session_four;

import java.io.*;
import java.nio.file.Files;

/**
 * Created by fame.issrani on 2/24/17.
 */
 class CopyingFile{

	public static void copyFileUsingJava7Files(File source, File dest) throws IOException {
		Files.copy(source.toPath(), dest.toPath());

	}
}
 public class COPYFILE {
	 public static void main(String[] args) throws IOException {
		 File source=new File("resources/productCsv.csv");
		 File destination=new File("resources/test.csv");
		 CopyingFile.copyFileUsingJava7Files(source,destination);
	 }

}
