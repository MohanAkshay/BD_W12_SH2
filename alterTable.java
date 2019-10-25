import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class alterTable {
	public static void main(String args[]) throws IOException,MasterNotRunningException {
		
		Configuration c = HBaseConfiguration.create(); 
														
		HBaseAdmin hba = new HBaseAdmin(c); 
		HColumnDescriptor hcd = new HColumnDescriptor("c4"); 
																		
		hba.addColumn("Student", hcd); 
	}
}