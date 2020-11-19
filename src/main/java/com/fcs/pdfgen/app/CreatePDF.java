package com.fcs.pdfgen.app;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import com.fcs.pdfgen.dto.Node;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;

public class CreatePDF {

	public void createPdf(String path, Node dataObj, String photo,String photoStr, String leftThumb, String rightThumb)
			throws FileNotFoundException, MalformedURLException {

		// Creating a PdfWriter
		PdfWriter writer = new PdfWriter(path);

		// Creating a PdfDocument
		PdfDocument pdfDoc = new PdfDocument(writer);

		// Adding a new page
		pdfDoc.addNewPage();

		// Creating a Document
		Document document = new Document(pdfDoc);

		// Paragraph para = new Paragraph (data);
		Table tbl = createTableData(dataObj, photo, photoStr,leftThumb, rightThumb);

		document.add(tbl);
		// Closing the document
		document.close();
		System.out.println("PDF Created");
	}

	public Table createTableData(Node dataObj, String photo, String photoStr, String leftThumb, String rightThumb)
			throws MalformedURLException {

		// float [] pointColumnWidths = {300F,100F};

		ImageData lThumb = ImageDataFactory.create(leftThumb);
		Image imageLT = new Image(lThumb);
		imageLT.setWidthPercent(95);

		Cell imgLT = new Cell();
//	     imgLT.setBorder(Border.NO_BORDER);
//	     imgLT.setPadding(0f);
		imgLT.add(imageLT);

		ImageData rThumb = ImageDataFactory.create(rightThumb);
		Image imageRT = new Image(rThumb);
		imageRT.setWidthPercent(95);

		Cell imgRT = new Cell();
//	     imgRT.setBorder(Border.NO_BORDER);
//	     imgRT.setPadding(0f);
		imgRT.add(imageRT);

		Table main = new Table(1);
		Cell header = new Cell();
		header.setBold();
		header.setTextAlignment(TextAlignment.CENTER);
		header.add("BIOMETRIC SURVEY DETAILS");
		main.addHeaderCell(header);

		Table table1 = new Table(new float[] { 4, 2 });
		table1.setWidthPercent(100);
		table1.setFontSize(8f);

		Table data = new Table(2);

		data.addCell(new Cell().add("SUID NO"));
		data.addCell(new Cell().add(dataObj.getSuidNumber()));

		data.addCell(new Cell().add("STRUCTURE/LAND USE/STATUS"));
		data.addCell(new Cell().add(dataObj.getSpinnerStructureStatus()));

		data.addCell(new Cell().add("OCCUPYING STRUCTURE SINCE"));
		data.addCell(new Cell().add(dataObj.getTextOccupingStructureSince()));

		data.addCell(new Cell().add("NAME OF OWNER"));
		data.addCell(new Cell().add(dataObj.getTextOwnerName()));

		data.addCell(new Cell().add("NAME OF OCCUPANT"));
		data.addCell(new Cell().add(dataObj.getTextOccupantName()));

		data.addCell(new Cell().add("OCCUPANT & OWNER RELATION"));
		data.addCell(new Cell().add(""));

		data.addCell(new Cell().add("TYPE OF OCCUPANT"));
		data.addCell(new Cell().add(dataObj.getSpinnerTypeOfOccupant()));

		data.addCell(new Cell().add("ADDRESS"));
		data.addCell(new Cell().add(dataObj.getTextAddress()));

		Cell dataCell = new Cell();
		dataCell.setBorder(null);
		dataCell.setPadding(0f);
		dataCell.add(data);
		table1.addCell(dataCell);

		ImageData dataPhoto = ImageDataFactory.create(photo);
		Image image = new Image(dataPhoto);
		image.setWidthPercent(100);
		
		ImageData dataPhotoStr = ImageDataFactory.create(photoStr);
		Image imageStr = new Image(dataPhotoStr);
		imageStr.setWidthPercent(100);

		Cell imgCell = new Cell();
		imgCell.setPadding(0f);
		imgCell.add(image);
		table1.addCell(imgCell);

		// ---------------------------------------------------------//

		Table table2 = new Table(3);
		table2.setFontSize(8f);

		table2.addCell(new Cell().add("STRUCTURE LENGTH"));
		// data2.addCell(new Cell().add(""));

		table2.addCell(new Cell().add("STRUCTURE WIDTH"));
		// data2.addCell(new Cell().add(""));

		table2.addCell(new Cell().add("Photo"));

		// ----------------------------------------------------------//

		Table table3 = new Table(new float[] { 4, 2 });
		table3.setWidthPercent(100);
		table3.setBorder(Border.NO_BORDER);
		table3.setFontSize(8f);
		table3.setPadding(0f);

		Table data3 = new Table(2);
		data3.setBorder(Border.NO_BORDER);
		data3.setPadding(0f);

		data3.addCell(new Cell().add("TAX RECEIPT NO"));
		data3.addCell(new Cell().add(dataObj.getTextHouseTaxReceiptNo()));

		data3.addCell(new Cell().add("DETAILS"));
		Table details = new Table(2);
		details.addCell("OCCUPANT");
		details.addCell("OWNER");

		Cell detailsCell = new Cell();
		detailsCell.setBorder(Border.NO_BORDER);
		detailsCell.setPadding(0f);
		detailsCell.add(details);
		data3.addCell(detailsCell);

		data3.addCell(new Cell().add("ADHAR CARD"));
		Table detailsAdhar = new Table(2);
		detailsAdhar.addCell(dataObj.getTextAadharCardNo());
		detailsAdhar.addCell("-");

		Cell detailsAdharCell = new Cell();
		detailsAdharCell.setBorder(Border.NO_BORDER);
		detailsAdharCell.setPadding(0f);
		detailsAdharCell.add(detailsAdhar);
		data3.addCell(detailsAdharCell);

		data3.addCell(new Cell().add("PAN CARD"));
		Table detailsPAN = new Table(2);
		detailsPAN.addCell(dataObj.getTextPanCardNo());
		detailsPAN.addCell("-");

		Cell detailsPANCell = new Cell();
		detailsPANCell.setBorder(Border.NO_BORDER);
		detailsPANCell.setPadding(0f);
		detailsPANCell.add(detailsPAN);
		data3.addCell(detailsPANCell);

		data3.addCell(new Cell().add("VOTER ID"));
		Table detailsVOTE = new Table(2);
		detailsVOTE.addCell("-");
		detailsVOTE.addCell("-");
		Cell detailsVOTECell = new Cell();
		detailsVOTECell.setBorder(Border.NO_BORDER);
		detailsVOTECell.setPadding(0f);
		detailsVOTECell.add(detailsVOTE);
		data3.addCell(detailsVOTECell);

		data3.addCell(new Cell().add("ELECTRICITY BILL"));
		Table detailsEL = new Table(2);
		detailsEL.addCell("-");
		detailsEL.addCell("-");
		Cell detailsELCell = new Cell();
		detailsELCell.setBorder(Border.NO_BORDER);
		detailsELCell.setPadding(0f);
		detailsELCell.add(detailsEL);
		data3.addCell(detailsELCell);

		data3.addCell(new Cell().add("PASSPORT"));
		Table detailsPASS = new Table(2);
		detailsPASS.addCell("-");
		detailsPASS.addCell("-");
		Cell detailsPASSCell = new Cell();
		detailsPASSCell.setBorder(Border.NO_BORDER);
		detailsPASSCell.setPadding(0f);
		detailsPASSCell.add(detailsPASS);
		data3.addCell(detailsPASSCell);

		Cell dataCell3 = new Cell();
		dataCell3.setBorder(Border.NO_BORDER);
		dataCell3.setPadding(0f);
		dataCell3.add(data3);
		table3.addCell(dataCell3);

		// ---------------------------------------------------------//

		Table imgThumb = new Table(2);
//	     imgThumb.setWidthPercent(100);
//	     imgThumb.setBorder(Border.NO_BORDER);
//	     imgThumb.setPadding(0f);	
		imgThumb.setTextAlignment(TextAlignment.CENTER);

		imgThumb.addCell(imgLT);
		imgThumb.addCell(imgRT);

		Cell ltTxt = new Cell();
		imgThumb.setWidthPercent(100);
		ltTxt.setPadding(0f);
		ltTxt.add("LEFT THUMB");

		Cell rtTxt = new Cell();
		imgThumb.setWidthPercent(100);
		rtTxt.setPadding(0f);
		rtTxt.add("RIGHT THUMB");

		imgThumb.addCell(ltTxt);
		imgThumb.addCell(rtTxt);

		Cell imgCell3 = new Cell();
		imgCell3.setPadding(0f);
		imgCell3.add(imgThumb);

		table3.addCell(imgCell3);

		// --------------------------------------------------------//

		Table table4 = new Table(new float[] { 2, 4 });
		table4.setWidthPercent(100);
		table4.setBorder(Border.NO_BORDER);
		table4.setFontSize(8f);
		table4.setPadding(0f);

		table4.addCell(new Cell().add("REMARK"));
		table4.addCell(new Cell().add("-"));

		// --------------------------------------------------------//

		Table table5 = new Table(1);
		table5.setWidthPercent(100);
		table5.setBorder(Border.NO_BORDER);
		table5.setFontSize(8f);
		table5.setPadding(0f);
		table5.addCell(new Cell().add("."));
		table5.addCell(new Cell().add("."));

		// --------------------------------------------------------//
		Table table6 = new Table(1);
		table6.setWidthPercent(100);
		table6.setBorder(Border.NO_BORDER);
		table6.setTextAlignment(TextAlignment.CENTER);
		table6.setFontSize(8f);
		table6.setPadding(0f);
		table6.addCell(new Cell().add("PHOTO WITH STRUCTURE"));
//		Image imageStr = new Image(dataPhotoStr);
//		image1.setWidthPercent(50);

		Cell imgCell1 = new Cell();
		imgCell1.setPadding(0f);
		imgCell1.add(imageStr);
		imgCell1.setHorizontalAlignment(HorizontalAlignment.CENTER);
		imgCell1.setVerticalAlignment(VerticalAlignment.MIDDLE);
		table6.addCell(imgCell1);

		// -------------------------------------------------//

		Table table7 = new Table(2);
		table7.setWidthPercent(100);
		table7.setBorder(Border.NO_BORDER);
		table7.setFontSize(8f);
		table7.setPadding(0f);
		table7.addCell(new Cell().add("TECHCOMM URBAN MANAGEMENT CONSULTANTS & SERVICES PROVIDERS"));
		table7.addCell(new Cell().add("BIOMETRIC SURVEY DONE BY KTZ PVT. LTD., OFFICE : 9820111909"));

		Cell mainCell = new Cell();
		mainCell.setBorder(Border.NO_BORDER);
		mainCell.setPadding(0f);
		mainCell.add(table1);
		mainCell.add(table2);
		mainCell.add(table3);
		mainCell.add(table4);
		mainCell.add(table5);
		mainCell.add(table6);
		mainCell.add(table7);
		main.addCell(mainCell);

		return main;
	}

}
