import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class dropAll{
	public static void main(String[] args) throws IOException {
		
		Configuration c = HBaseConfiguration.create(); 
		HBaseAdmin hba = new HBaseAdmin(c); 
		String toremove = "S";
		hba.disableTables(toremove);
		hba.deleteTables(toremove);
		System.out.printf("deleted");
	}
}