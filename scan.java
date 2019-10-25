import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

public class scan {
	public static void main(String args[]) throws IOException {
		
		Configuration c = HBaseConfiguration.create(); 
		String t = "Student"; 
		HTable ht = new HTable(c, t); 
		Scan s = new Scan(); 
		scan.addColumn(Bytes.toBytes("c3"), Bytes.toBytes("Gender"));
		ResultScanner scanner = ht.getScanner(scanable); 
		
		for (Result r = scanner.next(); r != null; r = scanner
				.next())
			System.out.println("Gender: " + r);
		scanner.close(); 
	}
}