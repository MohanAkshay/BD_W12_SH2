import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class drop {
	public static void main(String[] args) throws IOException {
		
		Configuration c = HBaseConfiguration.create(); 
		HBaseAdmin hba = new HBaseAdmin(c); 
		String t = "Student";
		hba.disableTable(t);
		hba.deleteTable(t); 
		System.out.printf(t," deleted);
	}
}