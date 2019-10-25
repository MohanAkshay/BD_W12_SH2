import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.util.Bytes;

public class delete {
	public static void main(String[] args) throws IOException {
		
		Configuration c = HBaseConfiguration.create();
		String t = "Student";
		HTable ht = new HTable(c, t); 
		Delete d = new Delete(Bytes.toBytes(04));
		d.deleteColumn(Bytes.toBytes("c3"), Bytes.toBytes("City"));
		
		ht.delete(d); 
		ht.close();
		System.out.println("Deleted");
	}
}