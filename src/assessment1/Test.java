package assessment1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("123");
		aList.add("124");
		aList.add("125");
		aList.add("126");
		Iterator<String> iterator = aList.iterator();
		for (String obj : aList) {
			if (obj.equals("126")) {
				aList.remove(obj);
			}
		}
		System.out.println(aList);
	}
}
