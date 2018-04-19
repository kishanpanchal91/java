import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest3 {

	public static void main(String[] args) {
			PreparedStatement preparedStatement = null;
		StringBuilder stringBuilder = null;
		long notificationAuditId = -1;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.105:1521:orcl","CRESTELPLUGINDEV622","CRESTELPLUGINDEV622");
		
			stringBuilder = new StringBuilder();
			stringBuilder.append(
					" insert into TBLTNOTIFICATIONAUDITDTL (NOTIFICATIONAUDITID,SERVICEINSTANCEACCOUNTNUMBER,YESID,TEMPLATEID,INPUTDATA,NOTIFICATIONTYPE,NOTIFICATIONADDRESS,NOTIFICATIONRESPONSECODE,RESPONSECODE,RESPONSEMESSAGE,NOTIFICATIONDATE,NOTIFICATIONSTATUS) ");
			stringBuilder.append(" values (NOTIFICATIONAUDITDTL_SEQUENCE.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?)");
			String generatedColumns[] = { "NOTIFICATIONAUDITID" };
			preparedStatement = c.prepareStatement(stringBuilder.toString(), generatedColumns);
			preparedStatement.setString(1, "400015625");
			preparedStatement.setString(2, "KP0001703@YES.MY");
			preparedStatement.setString(3, "EMAIL_CHANGE_PASSWORD");
			preparedStatement.setString(4, "<PASSWORD><7WGV1P3M>");
			preparedStatement.setString(5, "EMAIL");
				preparedStatement.setString(6, "KP0001703@STERLITE.COM");
			
			preparedStatement.setInt(7, -1);
			preparedStatement.setString(8, "Dummy");
			preparedStatement.setString(9,  "Dummy" );
			preparedStatement.setTimestamp(10, new java.sql.Timestamp(System.currentTimeMillis()));
			preparedStatement.setString(11, "Dummy");
			int response = preparedStatement.executeUpdate();
			if (response > 0) {
				ResultSet rs = preparedStatement.getGeneratedKeys();
				if (rs.next()) {
					  notificationAuditId = rs.getLong(1);
				}
				System.out.println("Notifition-->Data Saved-->Success-->notificationAuditId::"+notificationAuditId);
			} else {
				System.out.println("Some issue is occured while saving data.Please check.");
			}
		} catch (Exception e) {
			System.out.println("Error-->doSaveNotificationAuditDtl");
			
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
			} catch (Exception e) {
				System.out.println( "Error-->Closing Preparedstatement");
			}
		}
		System.out.println("End-->doSaveNotificationAuditDtl");
	}

}
