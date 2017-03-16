package com.edureka.session_four;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by fame.issrani on 2/24/17.
 */
public class CustomFileNameFilter implements FilenameFilter {
	private String extension;
	CustomFileNameFilter(String extension){
		this.extension=extension.toLowerCase();
	}
	@Override
	public boolean accept(File dir, String name) {
		return name.toLowerCase().endsWith(extension);
	}
}
