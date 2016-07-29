package mk.blog;

public class Dependent {
	//this class depends on the helperObject
	Helping helperObject = new Helping();
	
	public void someMethod(){
		helperObject.helpingMethod();
	}
}
