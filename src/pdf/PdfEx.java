package pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfEx {

	public static void main(String[] args) throws FileNotFoundException {
		Document document = new Document();
		ArrayList<Student> aList = new ArrayList<Student>();
		aList.add(new Student("Balakrishna", "22208", "877647333", "Hyderabad"));
		aList.add(new Student("Jonnadula", "22208", "877647333", "Hyderabad"));
		aList.add(new Student("JBK", "22208", "877647333", "Hyderabad"));
		aList.add(new Student("BK J", "22208", "877647333", "Hyderabad"));
		aList.add(new Student("Hello world", "22208", "877647333", "Hyderabad"));
		aList.add(new Student("And this is ", "22208", "877647333", "Hyderabad"));
		aList.add(new Student("My name is ", "22208", "877647333", "Hyderabad"));
		
		Iterator<Student> iterator = aList.iterator();
		
		try {
			PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("src\\pdf\\xyz.pdf"));
			document.open();
			while (iterator.hasNext()) { 
				Student std = iterator.next();
				document.add(new Paragraph("Name : " + std.getName() + ", Id : " + std.getId() + ", Phone : "
						+ std.getPhone() + ", Address : " + std.getAdd()));
			}
			document.close();
			System.out.println("Connection closed");

		} catch (IOException | DocumentException e) {

		}
	}

}
