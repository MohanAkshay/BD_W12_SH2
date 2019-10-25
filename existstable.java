import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class existstable {
	public static void main(String args[]) throws IOException {
		
		Configuration c = HBaseConfiguration.create(); 
		HBaseAdmin hba = new HBaseAdmin(c); 
		boolean b = hba.tableExists("Student");
		System.out.println("Already exists");
		System.out.println(b);
	}
}