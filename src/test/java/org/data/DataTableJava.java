package org.data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataTableJava {

	public static void main(String[] args) {
		// 1 D without header
		List<String> li = new ArrayList<String>();
		li.add("Raju"); // ---.>0
		li.add("Raju@gmail.com");// --->1
		li.add("Raju@123");// --->2
		li.add("chennai");// --->3

		String string = li.get(2);
		System.out.println(string);

		// 1 D with header
		Map<String, String> mp = new LinkedHashMap<String, String>();
		mp.put("username", "Raju");
		mp.put("email", "Raju@gmail.com");
		mp.put("password", "raju@gmail.com");
		mp.put("location", "chennai");

		String string2 = mp.get("email");
		System.out.println(string2);

		// 2D without header
		List<ArrayList<String>> lis = new ArrayList<ArrayList<String>>();

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Raju");
		a1.add("Raju@gmail.com");
		a1.add("raju@321");
		a1.add("chennai");

		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Deepak");
		a2.add("deepak@gmail.com");
		a2.add("deepak@321");
		a2.add("Bangalore");

		lis.add(a1);
		lis.add(a2);

		ArrayList<String> arrayList = lis.get(1);
		String string3 = arrayList.get(3);
		System.out.println(string3);

		// 2D with header
		List<LinkedHashMap<String, String>> list = new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> mp1 = new LinkedHashMap<String, String>();
		mp1.put("username", "Raju");
		mp1.put("email", "raju@gmail.com");
		mp1.put("password", "raju@321");
		mp1.put("location", "chennai");

		LinkedHashMap<String, String> mp2 = new LinkedHashMap<String, String>();
		mp2.put("username", "Deepak");
		mp2.put("email", "Deepak@gmail.com");
		mp2.put("password", "Deepak@321");
		mp2.put("location", "Madurai");

		list.add(mp1);
		list.add(mp2);
		
		LinkedHashMap<String, String> linkedHashMap = list.get(0);
		String string4 = linkedHashMap.get("username");
		System.out.println(string4);

	}

}
