package assessment1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {

	public void serialize(Object obj) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("jbk.txt"));
		oos.writeObject(obj);
		System.out.println("Serialization complete");
	}

	public void deSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("jbk.txt"));
		System.out.println(ois.readObject());
//		ois.readObject();
		System.out.println("de serialization complete");
	}

	public static void main(String[] args) {
		Student std = new Student(111, "jbk", "Hyd");
		StudentTest sTest = new StudentTest();
		try {
			sTest.serialize(std);
			sTest.deSerialization();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
