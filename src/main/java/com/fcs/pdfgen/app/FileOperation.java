package com.fcs.pdfgen.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fcs.pdfgen.dto.Node;

public class FileOperation {
	
	
	public String readFile(String path) {
		
		String data=null;
		
		
		
		
		return data;
	}
	
	
	public Node createDataObject(String path) throws IOException {
		
		Node data=null;
		
		ObjectMapper mapper = new ObjectMapper();		
		BufferedReader fileReader = new BufferedReader(new FileReader(path));
	    JsonNode rootNode = mapper.readTree(fileReader);
	    data = mapper.treeToValue(rootNode, Node.class);   
	    	    
		return data;
	}

}
