package files;

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
