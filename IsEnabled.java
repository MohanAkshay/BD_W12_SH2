import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class isEnabled {
	public static void main(String args[]) throws IOException, MasterNotRunningException {
		
		Configuration c = HBaseConfiguration.create(); 
		HBaseAdmin hba = new HBaseAdmin(c); 
		boolean b = hba.isTableEnabled("Student"); 
		System.out.println(b);
	}
}
