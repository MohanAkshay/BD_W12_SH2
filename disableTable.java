import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class disableTable {
	public static void main(String args[]) throws IOException, MasterNotRunningException {
		
		Configuration c = HBaseConfiguration.create(); 
														
		HBaseAdmin hba = new HBaseAdmin(c); 
		boolean disable = hba.isTableDisabled("Student"); 
		if (!disable) {
			hba.disableTable("Student"); 
			System.out.println("Disabled"); 
			}
		
}
}