package assessment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("src/assessment2/abc1.txt");
		pw.println(100);
		pw.println(200);
		pw.println(300);
		pw.println(400);
		pw.println(500);
		pw.flush();

		PrintWriter pw1 = new PrintWriter("src/assessment2/abc2.txt");
		pw1.println("aaa");
		pw1.println("bbb");
		pw1.println("ccc");
		pw1.println("ddd");
		pw1.println("efg");
		pw1.println("eee");
		pw1.flush();

		BufferedReader br = new BufferedReader(new FileReader("src/assessment2/abc1.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("src/assessment2/abc2.txt"));

		BufferedWriter bw = new BufferedWriter(new FileWriter("src/assessment2/abc3.txt"));
		String str1;
		String str2;
		while ((str1 = br.readLine()) != null && (str2 = br1.readLine()) != null) {
			bw.write(str1);
			bw.newLine();
			bw.write(str2);
			bw.newLine();
			bw.flush();
			System.out.println("success fully merged..!");

		}
	}
}
