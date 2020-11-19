package com.fcs.pdfgen.app;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fcs.pdfgen.dto.DataLinkDTO;
import com.fcs.pdfgen.dto.Node;
import com.fcs.pdfgen.util.FileUtil;

public class MainApp {
	
	public static void main(String[] args) throws IOException {		
		
		MainApp app=new MainApp();
		String currentDir=System.getProperty("user.dir");
		System.out.println(currentDir);
		app.createAllPDF(currentDir);
	}
	
	
	
	public void createAllPDF(String rootpath) throws IOException {
		
		FileUtil fileUtil=new FileUtil();
		LinkedHashMap<String, DataLinkDTO> outMap=fileUtil.scanFolder(new File(rootpath));
		FileOperation fileOp=new FileOperation();
		for (Map.Entry<String, DataLinkDTO> item : outMap.entrySet()) {

			Node d=fileOp.createDataObject(item.getValue().getDataUrl());
			
			CreatePDF pdf=new CreatePDF();						
			pdf.createPdf((rootpath+"\\"+item.getValue().getOutfileName()+".pdf"),d,item.getValue().getPhotoUrl(),item.getValue().getPhotoWithStructureUrl(),item.getValue().getLeftThumbUrl(),item.getValue().getRightThumbUrl());
		}	
		
	}

}
