package com.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfReader {
	
	URL url = null;
	InputStream IS = null;
	PDDocument pdDoc = null;
	String pdfContent =" ";
	
	public String readPdf(String Url)
	{
		try {
			url = new URL(Url);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		try {
			IS = url.openStream();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		BufferedInputStream fileParse = new BufferedInputStream(IS);
		
		try {
			pdDoc = PDDocument.load(fileParse);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			pdfContent = new PDFTextStripper().getText(pdDoc);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return pdfContent;
		
	}


}
