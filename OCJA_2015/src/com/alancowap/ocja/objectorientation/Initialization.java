/** 
 *  Demo initialization blocks, constructors 
 *  - static and non-static initialization blocks
 *  - multiple classes and order of execution of init blocks and constructors 
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 * @see com.alancowap.ocja.sample.InitHier
 *  
 */
package com.alancowap.ocja.objectorientation;

public class Initialization {
static {System.out.println("Static init Init top");}
{System.out.println("init Init top");}
public static void main(String[] args) {
	System.out.println("Main method");
	new Initialization();
	Connection con = new Connection();
	con.toString();
	NewConnection.doStuff();
}

static {System.out.println("Static init Init bottom");} //should put init blocks near constructors
{System.out.println("init Init bottom");}
}


class Connection{
	static {System.out.println("Static init connection top");}
	static {System.out.println("Static init connection bottom");}
}

class NewConnection{
	static {System.out.println("Static init new connection top");}
	static {System.out.println("Static init new connection bottom");}
	public static void doStuff() {}
	
}

//Output:
//Static init Init top
//Static init Init bottom
//Main method
//init Init top
//init Init bottom
//Static init connection top
//Static init connection bottom
//Static init new connection top
//Static init new connection bottom
