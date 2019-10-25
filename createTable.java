import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class createTable {
	public static void main(String[] args) throws IOException {
		
		HBaseConfiguration hbc = new HBaseConfiguration(new Configuration());
		HTableDescriptor htd = new HTableDescriptor("Student");
     
		htd.addFamily(new HColumnDescriptor("c1")); 
		htd.addFamily(new HColumnDescriptor("c2")); 
		htd.addFamily(new HColumnDescriptor("c3"));
		
		HBaseAdmin hba = new HBaseAdmin(hbc);

		hba.createTable(htd);
		System.out.println("Created");
	}
}