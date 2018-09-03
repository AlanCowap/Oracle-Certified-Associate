/** 
 *  Demo of StringBuilder
 *  - StringBuilder is identical to StringBuffer, except StringBuffer methods are synchronized
 *  - StringBuilder and StringBuffer are mutable
 *  - - invoking a method on a StringBuffer will usually change the StringBuffer
 *  - StringBuilder methods e.g. reverse, append, insert, delete.
 *  - Note StringBuilder uses append (as opposed to String which uses concat)
 *  - 
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.stringsarrays;

public class StringBuilding {

	public static void main(String[] args) {
		// StringBUilder (and StringBuffer) are MUTABLE
		StringBuilder sb = new StringBuilder("James Gosling");
		sb.reverse(); //no assignment needed, SB are MUTABLE
		System.out.println(sb);
		System.out.println("01234567890123456789");
		
		StringBuilder sa = sb.reverse();
		System.out.println(sa);
		System.out.println(sb); //watch out, object referred to by sb was reversed in line 11
		
		//append - Note concat is a String method, StringBuilder uses append.
		sb.append(" and Bill Joy");
		System.out.println(sb);
		
		sb.insert(13, ":)");
		System.out.println(sb);
		
		sb.delete(13, 15);
		System.out.println(sb);
		
		try {
			sb.delete(sb.indexOf(":"), sb.length());			
			//Throws a StringIndexOutOfBoundsException because ":" is not found and indexOf returns -1
			//then delete(-1,X) throws the Exception
		} catch (Exception e) {
			System.out.println("Delete failed, invalid index/indices and/or char not found");			
		}finally {
			System.out.println(sb);
		}
		
		sb.insert(13, ":)");
		System.out.println(sb);
		
		sb.delete(sb.indexOf(":"), sb.length()); 
		System.out.println(sb);

		
	}

}
