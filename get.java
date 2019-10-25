import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

public class GetDataFromTable {
	public static void main(String[] args) throws IOException {
		
		Configuration c = HBaseConfiguration.create(); 
		String t ="Student";
		HTable ht = new HTable(c, "Table"); 
		Get g = new Get(Bytes.toBytes("row1")); 
		Result r = ht.get(g); 
	
		byte[] value = r.getValue(Bytes.toBytes("c1"),Bytes.toBytes("Roll_No"));
		String s = Bytes.toString(value); 
		System.out.println("Roll_No: " + s);
	}
}