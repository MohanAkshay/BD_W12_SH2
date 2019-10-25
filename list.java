import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class list {
	public static void main(String args[]) throws IOException, MasterNotRunningException {
		
		Configuration c = HBaseConfiguration.create(); 
														
		HBaseAdmin hba = new HBaseAdmin(c);
		HTableDescriptor[] htd = hba.listTables();
															
		for (int i = 0; i < htd.length; i++) {
			System.out.println(htd[i].getNameAsString());
																	
		}
	}
}