package com.fcs.pdfgen.util;

import java.io.File;
import java.io.FileFilter;
import java.util.LinkedHashMap;

import com.fcs.pdfgen.dto.DataLinkDTO;

public class FileUtil {

	private static final String TXT_FILE = ".txt";
	private static final String JPG_FILE = ".jpg";
	private static final String BMP_FILE = ".bmp";
	private static final String BENEFICIARIES="//BENEFICIARIES";
	private static final String THUMB="//Thumb";

	FileFilter txtFilter = new FileFilter() {
		public boolean accept(File pathname) {
			if (pathname.getPath().endsWith(TXT_FILE))
				return true;
			return false;
		}
	};

	FileFilter jpgFilter = new FileFilter() {
		public boolean accept(File pathname) {
			if (pathname.getPath().endsWith(JPG_FILE))
				return true;
			return false;
		}
	};

	FileFilter bmpFilter = new FileFilter() {
		public boolean accept(File pathname) {
			if (pathname.getPath().endsWith(BMP_FILE))
				return true;
			return false;
		}
	};

	

	public LinkedHashMap<String, DataLinkDTO> scanFolder(File file) {

		LinkedHashMap<String, DataLinkDTO> inputMap = new LinkedHashMap<String, DataLinkDTO>();

		if (file.isDirectory()) {

			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {

				DataLinkDTO dataLinkDTO = new DataLinkDTO();

				if (files[i].isDirectory()) {

					File f = files[i];
					File[] txtFile = f.listFiles(txtFilter);
					File[] jpgFile = new File(f.getPath() + BENEFICIARIES).listFiles(jpgFilter);
					File[] bmpFile = new File(f.getPath() + THUMB).listFiles(bmpFilter);

					dataLinkDTO.setOutfileName(f.getName());

					if (txtFile.length > 0) {
						dataLinkDTO.setDataUrl(txtFile[0].getPath());
					}

					if (jpgFile.length > 0) {

						for (int p = 0; p < jpgFile.length; p++) {
							if (jpgFile[p].getName().contains("p2") || jpgFile[p].getName().contains("P2")) {
								dataLinkDTO.setPhotoUrl(jpgFile[p].getPath());
							} else if (jpgFile[p].getName().contains("p1") || jpgFile[p].getName().contains("P1")) {
								dataLinkDTO.setPhotoWithStructureUrl(jpgFile[p].getPath());
							}
						}

					}

					if (bmpFile.length > 0) {

						for (int k = 0; k < bmpFile.length; k++) {
							if (bmpFile[k].getName().contains("left") || bmpFile[k].getName().contains("Left")) {
								dataLinkDTO.setLeftThumbUrl(bmpFile[k].getPath());
							} else if (bmpFile[k].getName().contains("right")
									|| bmpFile[k].getName().contains("Right")) {
								dataLinkDTO.setRightThumbUrl(bmpFile[k].getPath());
							}
						}

					}
					inputMap.put(f.getName(), dataLinkDTO);
				}
			}
		}
		return inputMap;
	}

	
	public String getFileExtension(File file) {
		String fileName = file.toString();

		int index = fileName.lastIndexOf('.');
		if (index > 0) {
			String extension = fileName.substring(index + 1);
			return extension;
		}
		return null;
	}

}
