package DependentAPI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import DependentInterfaces.ProjectConstants;

public class APIs implements ProjectConstants {
	
	public void takeScreenshot(WebDriver driver, String name) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File(".\\Screenshots\\"+name+".jpg"));
	}
	
	
	
	public static String fetchProperties(String connString) throws FileNotFoundException, IOException
	{
		Properties prop = new Properties();
		prop.load(new FileInputStream(propertiesFile));	
		return prop.getProperty(connString);	
	}
	
	
	
	/* JDBC connection for String */
	public String DbConnectionSTR(String sql) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException
	{
		String connection = fetchProperties("DBconnection");
		String username = fetchProperties("username");
		String password = fetchProperties("password");	
		String result=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection bscsConn = DriverManager.getConnection(connection,username,password);
		Statement stmt = bscsConn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			result=rs.getString(1); 
		}
		
		return result;
	}
	
	/* JDBC connection for Int */
	public int DbConnectionINT(String sql) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException
	{
		String connection = fetchProperties("DBconnection");
		String username = fetchProperties("username");
		String password = fetchProperties("password");
		
		int result=0;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection bscsConn = DriverManager.getConnection(connection,username,password);
		Statement stmt = bscsConn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			result=rs.getInt(1); 
		}		
		return result;
	}
}
