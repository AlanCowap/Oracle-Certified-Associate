/** 
 *  Demo of method modifiers:
 *   - Access modifiers: private, protected, <default>, public;
 *   - Non-Access modifiers: abstract, final, strictfp, synchronized, native
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.ocja.accesscontrol;

public abstract class ModifierMethod {

	//Access modifiers - see Top.java etc. for more examples.
	private void priv() {}
	void def() {}
	protected void pro(){}
	public void pub() {}
	
	public final void noOverride() {}
	public abstract void noImplementation();	//NB. No {}, No implementation of abstract method.
	public synchronized void oneAtATime() {}
	public native void nat();					//NB. No {}, No implementation of native method.
	public strictfp void strict() {}
	
	public final synchronized strictfp void all() {}
	
	public native void abna();
	abstract void abstracto();
	
}
