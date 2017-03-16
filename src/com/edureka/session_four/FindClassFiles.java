package com.edureka.session_four;

import java.io.File;

/**
 * Created by fame.issrani on 2/24/17.
 */
public class FindClassFiles {
	public static void main(String[] args) {
		String extension=".class";
		String dir="/Users/fame.issrani/MyProjects/shopping_cart/out/production/shopping_cart/Client";
		File file = new File(dir);
		if(!file.exists()) System.out.println(dir + " Directory doesn't exists");
		File[] listFiles = file.listFiles(new CustomFileNameFilter(extension));
		if(listFiles.length ==0){
			System.out.println(dir + "doesn't have any file with extension "+extension);
		}else{
			// To get all the files starting with u
			for(File f : listFiles)
				if(f.getName().toLowerCase().startsWith("t")){

					System.out.println("File: "+dir+File.separator+f.getName());
				}
		}
	}
}
