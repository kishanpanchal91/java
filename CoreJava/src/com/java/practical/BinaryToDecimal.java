
package com.java.practical;

public class BinaryToDecimal {

	public int binaryToDecimal(int binary)
	{
		int decimal = 0;
		int power = 0;
		
		while(true){
			if(binary == 0){
				break;
			} 
			else {
				int temp = binary%10;
				decimal += temp*Math.pow(2, power);
				binary = binary/10;
				power++;
			}
		}
		return decimal;
	}
	
	public static void main(String args[])
	{
		BinaryToDecimal obj = new BinaryToDecimal();
		
		System.out.println("Decimal of 1101 : "+obj.binaryToDecimal(1010));
		System.out.println("Decimal of 111101 : "+obj.binaryToDecimal(111101));
	}
	
}
