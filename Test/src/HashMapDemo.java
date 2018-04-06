import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) throws IOException {
		
		List<String> l = new ArrayList<String>();
		System.out.println(l.add("Kishan"));
		System.out.println(l.add("Kishan"));

		
		
		/*//System.out.println("Please give words seperated with space");
		//File file = new File("D:\\p\\Work\\spring-workspace\\Test\\src\\words.txt");
		File file = new File("src\\words.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		String line = br.readLine();
		while(line!=null)
		{
			for(String word : line.split(" "))
			{
				if(!m.containsKey(word))
					m.put (word, 1);
				else
				{
					int i = m.get(word);
					i++;
					m.put(word, m.get(word)+1);
				}
			}
			line = br.readLine();
		}
		System.out.println(m.toString());
		
	}*/
	}
	
	

	

}
