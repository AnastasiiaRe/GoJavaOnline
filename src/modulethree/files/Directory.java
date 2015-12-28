package src.modulethree.files;

import java.util.ArrayList;
import java.util.List;

/**
 * Directory
 */
public class Directory {
	private List<File> fileList;

	public Directory() {
		fileList = new ArrayList<File>();
	}

	public void addFileToList(File file) {
		if(file instanceof ImageFile) {
			throw new RuntimeException("You cannot add image to this directory");
		}
		fileList.add(file);
	}

	@Override
	public String toString() {
		String description = "My elements are: ";

		for (File file : fileList) {
			description += file.toString();
		}

		return description;
	}
}
