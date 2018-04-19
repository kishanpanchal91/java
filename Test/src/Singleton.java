
public class Singleton {

	private String s1;
	private static Singleton s;
	
	private Singleton() {}

	
	public Singleton(String s1) {
		this.s1 = s1;
	}
	
	
	public static Singleton getInstance() {
		
		if(s==null)
			s= new Singleton();
		return s;
	}
	
}
