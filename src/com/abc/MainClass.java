/**
 * 
 */
package com.abc;

import java.util.HashMap;

/**
 * @author npagidala
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	static HashMap<String, Boolean> map = new HashMap<String, Boolean>();
	public static void main(String[] args) {
		
		
		
		map.put("Kenny", true);
		map.put("Joe", false);
		
		System.out.println(map.get("Kenny"));
		

	}

}
