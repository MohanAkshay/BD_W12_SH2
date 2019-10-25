import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

public class TruncateTable {

	public static void main(String[] args) throws IOException {
		
		Configuration c= HBaseConfiguration.create();
		Connection conn = ConnectionFactory.createConnection(conf);
		String t = "Student"; 
		Admin admin = conn.getAdmin();
		admin.disableTables(t); 
		admin.truncateTable(TableName.valueOf(t), true); 
		admin.close();
	}
}
