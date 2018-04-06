import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.lang.SerializationUtils;

import oracle.sql.BLOB;

public class TestHashMap {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.105:1521:orcl","CRESTELDUNDEV622","CRESTELDUNDEV622");
		StringBuilder sb = new StringBuilder();
		sb.append("select injectedvalue from TBLMACTIONMASTER where ACTIONMASTERID=?");
		System.out.println("Query to get injected values of action ::"+sb);
		PreparedStatement preparedStatement=con.prepareStatement(sb.toString());
		preparedStatement.setString(1, "330");
		ResultSet rs = preparedStatement.executeQuery();
		if(rs.next()) {
			Map<String,String> map = generateHashMapFromBLOB((BLOB)rs.getObject(1));
			//System.out.println((BLOB)rs.getBlob("injectedvalue"));
            }
}
	
	private static Map<String,String> generateHashMapFromBLOB(BLOB blobInjectedValue){
		HashMap<String,String> hmInjectedValue=null;
		String strMethodName="generateHashMapFromBLOB";
		
		try{
			System.out.println(blobInjectedValue);
			if(blobInjectedValue!=null){
				System.out.println(blobInjectedValue);

				byte[] byteInjectedValues=(byte[])SerializationUtils.deserialize( blobInjectedValue.getBytes());
			//	System.out.println( blobInjectedValue.getBytes());
				String strInjectedValues = new String(byteInjectedValues,"UTF-8");
			
				StringTokenizer strTokenizer=new StringTokenizer(strInjectedValues, ",");
				hmInjectedValue=new HashMap<String,String>();
				while(strTokenizer.hasMoreTokens()){
					
					String strSinlgeInjectedValue=strTokenizer.nextToken();
					
					StringTokenizer strTokenizerSingle=new StringTokenizer(strSinlgeInjectedValue,":");
					
					String strKey=strTokenizerSingle.nextToken();
					String strValue=strTokenizerSingle.nextToken();
					
					hmInjectedValue.put(strKey, strValue);
				}
			}
		}catch(Exception e){
System.out.println(e);		}
		
		return hmInjectedValue;
		
	}

}