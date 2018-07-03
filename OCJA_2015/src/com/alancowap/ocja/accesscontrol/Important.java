/** 
 *  Demo of import and static import
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.ocja.accesscontrol;

//Static imports
//import static java.util;				//can only import a field or member type
//import static java.util.ArrayList;	//can only import a field or member type
import static java.util.ArrayList.*;
//static import java.util.ArrayList.*;	//incorrect syntax

//Non-static imports
//import java.util;	//can't import a package
import java.util.*;
import java.util.ArrayList;
import java.util.ArrayList.*;
import com.alancowap.ocja.accesscontrol.sub.Middle.*;

public class Important {
	public void checkImport() {
//		accessTop();		//can't access non-static members through non-static import
//		int local = num;	//can't access non-static members through non-static import
	}
}
