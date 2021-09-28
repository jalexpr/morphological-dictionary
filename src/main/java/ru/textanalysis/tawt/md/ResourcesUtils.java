package ru.textanalysis.tawt.md;

import java.io.InputStream;

public class ResourcesUtils {

	public static InputStream getResource(String pathZipFile) {
		return ResourcesUtils.class.getClassLoader().getResourceAsStream(pathZipFile);
	}
}
