import java.util.Arrays;

//Top level class can be default or public access, protected and private not allowed
public class ConstructorApp{

	// Data Members
	private int num;
	private String name;

	protected ConstructorApp(){System.out.println("Constructing");}
	//allowed access modifiers for constructors: public protected default private

	// some disallowed modifiers: abstract final native strictfp static synchronized transient volatile 
	// allowed modifiers: 

	// This is not a constructor (it has a return type), it's a poorly named method
	void ConstructorApp(){System.out.println("Methoding");}

	public static void main(String[] args){
		ConstructorApp ca = new ConstructorApp();
		ca.ConstructorApp();
		String[] arr = new String[5];
		// arr.fill(arr, "initial"); // no such method
		Arrays.fill(arr, "initial");
		for(String s : arr){
			System.out.println(s + " ");
		}

	}
}


interface Modifiable{} // can't use protected, private