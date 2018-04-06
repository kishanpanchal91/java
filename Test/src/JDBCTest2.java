import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class JDBCTest2 {
	char ch;

	public char getCh() {
		return ch;
	}


	public void setCh(char ch) {
		this.ch = ch;
	}


	public static void main(String[] args) {
		
		try {
			Map<Date,Object[]> map = new HashMap<Date,Object[]>();
			
			
			//1
			/*map.put(new SimpleDateFormat("dd-MM-yyyy").parse("20-02-2018"), new Object[] 
					{String.valueOf(new Long("2105") / Math.pow(10, 4)), 
							new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new java.sql.Date(System.currentTimeMillis())),
							
					});
			
			map.put(new SimpleDateFormat("dd-MM-yyyy").parse("22-02-2018"), new Object[] 
					{String.valueOf(new Long("18") / Math.pow(10, 4)), 
							new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new java.sql.Date(System.currentTimeMillis())),
							
					});
			map.put(new SimpleDateFormat("dd-MM-yyyy").parse("10-02-2018"), new Object[] 
					{String.valueOf(new Long("0") / Math.pow(10, 4)), 
							new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new java.sql.Date(System.currentTimeMillis())),
							
					});*/
			
			//2
			map.put(new SimpleDateFormat("dd-MM-yyyy").parse("20-02-2018"), new Object[] 
					{String.valueOf(new Long("2105") / Math.pow(10, 4))});
			
			map.put(new SimpleDateFormat("dd-MM-yyyy").parse("22-02-2018"), new Object[] 
					{String.valueOf(new Long("18") / Math.pow(10, 4))});
			map.put(new SimpleDateFormat("dd-MM-yyyy").parse("10-02-2018"), new Object[] 
					{String.valueOf(new Long("0") / Math.pow(10, 4))});
			TreeMap<Date, Object[]> tm = dataSortByDateDesc(map);
			
			//1
			/*for(Map.Entry<Date, Object[]> e : tm.entrySet()) {
				System.out.println(e.getKey());
				for(Object o : (Object[])e.getValue()) {
					if(o instanceof String)
						System.out.println((String)o);
					if(o instanceof Date)
						System.out.println((Date)o);
				}
				break;
			}*/
			
			//2
			 for(Map.Entry<Date, Object[]> e : tm.entrySet()) {
				 System.out.println((String)(((Object[])e.getValue())[0]));
				 System.out.println( new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(e.getKey()));
					break;
				}
			
			
			
			
			
			
			
			
			
			
			
			
			/*Map<Date,String> map1 = new SortedMap<Date, String>() {
			}; 
			
			Map<Date,String> map = new TreeMap<Date, String> (new Comparator<Date>() {

				@Override
				public int compare(Date o1, Date o2) {
					if(o1.after(o2))
						return -1;
					else if (o1.before(o2))
						return 1;
					else
						return 0;
				}
				
				
			});
			map.put(new SimpleDateFormat("dd-MM-yyyy").parse("20-02-2018"), "5.20");
			map.put(new SimpleDateFormat("dd-MM-yyyy").parse("18-02-2018"), "6.20");
			map.put(new SimpleDateFormat("dd-MM-yyyy").parse("21-02-2018"), "7.20");

			System.out.println(map.toString());*/
			
			
			
			
			
			
			
			
			
			
			/*Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.105:1521:orcl","CRESTELPLUGINDEV622","CRESTELPLUGINDEV622");
			PreparedStatement p = c.prepareStatement("UPDATE TBLTRPSFILEDETAILS SET WHICHFILE = ? WHERE TRANSACTIONID = ?");
			
			JDBCTest t = new JDBCTest();
			
			p.setString(1,String.valueOf(t.getCh()));
			p.setString(2, "8250152401402181634");

			int insertCount1 = p.executeUpdate();
			System.out.println("insertCount 1 : "+insertCount1);*/


			/*p.close();
			p=c.prepareStatement("insert into TBLTRPSFILEDETAILS(FILEDETAILID,FILEDID,TRANSACTIONID,BILLINGACCONTNUMBER,SERVICEINSTANCENUMBER,CARDNUMBER,BILLDATE,RETRYCOUNT,CREATEDATE,CREATEBY,STATUS) VALUES (SEQ_RPSFILEDETAILS.NEXTVAL,?,?,?,?,?,?,?,?,?,?)"); 
			p.setDouble(1, fileId);
			p.setString(2,"888888888");
			p.setString(3,"888888888");
			p.setString(4,"888888888");
			p.setString(5,"888888888");
			p.setDate(6,new java.sql.Date(new java.util.Date().getTime()));
			p.setInt(7, 5);
			p.setDate(8,new java.sql.Date(new java.util.Date().getTime()));
			p.setString(9,"kishan");
			p.setString(10,"Sent");
			int insertCount2 = p.executeUpdate();
			System.out.println("insertCount 2 : "+insertCount2);*/

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
	
	
	/*private static long  getSequenceValueForAutobillingRPS(Connection connection) throws Exception {
		  PreparedStatement preparedStatement = null;
		  StringBuilder sequenceQueryBuilder = new StringBuilder();
		  long autoBillingId = 0L;
		  try {
		   sequenceQueryBuilder.append("select SEQ_RPSFILESUMMARY.NEXTVAL from dual");
		   preparedStatement = connection.prepareStatement(sequenceQueryBuilder.toString());
		   ResultSet rs = preparedStatement.executeQuery();
		   if (rs.next())
		    autoBillingId = rs.getLong(1);
		  } catch (Exception e) {
		   throw e;
		  } finally {
			  preparedStatement.close();
		  }
		  return autoBillingId;
		 }*/
	
	public static TreeMap<Date,Object[]> dataSortByDateDesc(Map map) {
		  SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
		  
		 //Map<Date, String> map1 = new TreeMap<Date, String>(new Comparator<Date>() {
		  TreeMap<Date, Object[]> map1 = new TreeMap<Date, Object[]>(new Comparator<Date>() {
		      @Override
		      public int compare(Date o1, Date o2) {
		       if(o1.after(o2))
		        return -1;
		       else if (o1.before(o2))
		        return 1;
		       else
		        return 0;
		      }
		      
		      
		     });
		      map1.putAll(map);
		   
		   return map1;
		 }
	
}
