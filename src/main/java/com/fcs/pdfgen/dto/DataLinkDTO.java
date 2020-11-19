package com.fcs.pdfgen.dto;

public class DataLinkDTO {
	
	private String dataUrl;
	private String photoUrl;
	private String rightThumbUrl;
	private String leftThumbUrl;
	private String photoWithStructureUrl;
	private String outfileName;
	
	public String getDataUrl() {
		return dataUrl;
	}
	public void setDataUrl(String dataUrl) {
		this.dataUrl = dataUrl;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getRightThumbUrl() {
		return rightThumbUrl;
	}
	public void setRightThumbUrl(String rightThumbUrl) {
		this.rightThumbUrl = rightThumbUrl;
	}
	public String getLeftThumbUrl() {
		return leftThumbUrl;
	}
	public void setLeftThumbUrl(String leftThumbUrl) {
		this.leftThumbUrl = leftThumbUrl;
	}
	public String getPhotoWithStructureUrl() {
		return photoWithStructureUrl;
	}
	public void setPhotoWithStructureUrl(String photoWithStructureUrl) {
		this.photoWithStructureUrl = photoWithStructureUrl;
	}
	public String getOutfileName() {
		return outfileName;
	}
	
	public void setOutfileName(String outfileName) {
		this.outfileName = outfileName;
	}
	
	@Override
	public String toString() {
		return "DataLinkDTO [dataUrl=" + dataUrl + ", photoUrl=" + photoUrl + ", rightThumbUrl=" + rightThumbUrl
				+ ", leftThumbUrl=" + leftThumbUrl + ", photoWithStructureUrl=" + photoWithStructureUrl
				+ ", outfileName=" + outfileName + "]";
	}

	

}
