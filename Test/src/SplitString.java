import java.util.ArrayList;
import java.util.List;

public class SplitString {

	public static void main(String[] args) {
		
		int totalValue =11000;
		int pieceLength = 900;
		List<Integer> splittedValues = new ArrayList<Integer>();

		
		while(totalValue>pieceLength)
		{
			splittedValues.add(pieceLength);
			totalValue = totalValue-pieceLength;
		}
		splittedValues.add(totalValue);

		/*while(s.length()>cutlength)
		{
			 String s1= s.substring(0,cutlength);
			s=s.substring(cutlength,s.length());
			splittedStrings.add(s1);
		}
		splittedStrings.add(s);*/
		/*int loopCount = s.length()/9;
		int i =0;
		for(i=0;loopCount>0;i=i+9,loopCount--)
		{
			splittedStrings.add(s.substring(i, i+9));
		}
		splittedStrings.add(s.substring(i, s.length()));*/
		System.out.println(splittedValues);
	}
}