/** 
 *  Demo of Class modifiers: <default>, public; abstract, final, strictfp
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.ocja.accesscontrol;

public class ModifierClass {
	
	private void doStuff() {
//		NoMethods nom = new NoMethods();	//can't instantiate an Abstract class
	}
}

//public class OnlyOne{}			//Only have one top-level public class per file
class DefaultAccess{}				//Default access is implicit
//private class PrivateAccess{}		//Top level class can't be private
//protected class ProtectedAccess{}	//Top level class can't be protected

abstract class NoMethods{}
final class NoChildren{}
//class Countdown extends NoChildren{}	//can't extend a final class
strictfp class IEEE754{}				//All FP calculations in class follow IEEE754 standard