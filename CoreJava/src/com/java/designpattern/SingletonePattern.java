package com.java.designpattern;

import java.lang.reflect.Constructor;

public class SingletonePattern {
public static void main(String[] args) throws Exception {
	/*Single single=Single.getInstance();
	single.print();*/
	
	 Class<Single> singletonClass = (Class<Single>) Class.forName("com.java.designpattern.Single");
	 Constructor<?>[] constructor=singletonClass.getDeclaredConstructors();
	 constructor[0].setAccessible(true);
	 constructor[0].newInstance();
	/* Single singletonReflection = singletonClass.get;
	 singletonReflection.print();*/
	 
	 
}
}

class Single{
	private static Single single=null;
	

	private Single()  {
		if( Single.single != null ) {
	        throw new InstantiationError( "Creating of this object is not allowed." );
	    }
	}
	public static Single getInstance() throws Exception {
		if(null==single) {
			single=new Single();
		}
		return single;
	}
	public void print() {
		System.out.println("This is private method of single class");
	}
}
