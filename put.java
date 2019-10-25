import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class put{
public static void main(String[] args) throws IOException {

	Configuration c = HBaseConfiguration.create(); 
String t  = "Student"; 
HTable ht = new HTable(c, t);  

Put r1 = new Put(Bytes.toBytes("row1"));

r1.add(Bytes.toBytes("c1"), Bytes.toBytes("Roll_No"),	Bytes.toBytes("011"));
r1.add(Bytes.toBytes("c1"),	Bytes.toBytes("Name"),		Bytes.toBytes("akshay"));
r1.add(Bytes.toBytes("c1"),	Bytes.toBytes("Course"),		Bytes.toBytes("CSE"));

r1.add(Bytes.toBytes("c2"), Bytes.toBytes("Gmail"),	Bytes.toBytes("akshay@gamil.com"));
r1.add(Bytes.toBytes("c2"),	Bytes.toBytes("Gender"),		Bytes.toBytes("M"));
r1.add(Bytes.toBytes("c2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("9876543210"));

r1.add(Bytes.toBytes("c3"),	Bytes.toBytes("Year"),		Bytes.toBytes("2017"));
r1.add(Bytes.toBytes("c3"),	Bytes.toBytes("Age"),		Bytes.toBytes("20"));
r1.add(Bytes.toBytes("c3"),	Bytes.toBytes("City"),		Bytes.toBytes("Delhi"));
hTable.put(r1); 


Put r2 = new Put(Bytes.toBytes("row2"));

r2.add(Bytes.toBytes("c1"), Bytes.toBytes("Roll_No"),	Bytes.toBytes("012"));
r2.add(Bytes.toBytes("c1"),	Bytes.toBytes("Name"),		Bytes.toBytes("mohan"));
r2.add(Bytes.toBytes("c1"),	Bytes.toBytes("Course"),		Bytes.toBytes("CSE"));

r2.add(Bytes.toBytes("c2"), Bytes.toBytes("Gmail"),	Bytes.toBytes("mohan@gamil.com"));
r2.add(Bytes.toBytes("c2"),	Bytes.toBytes("Gender"),		Bytes.toBytes("M"));
r2.add(Bytes.toBytes("c2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("9876543210"));

r2.add(Bytes.toBytes("c3"),	Bytes.toBytes("Year"),		Bytes.toBytes("2017"));
r2.add(Bytes.toBytes("c3"),	Bytes.toBytes("Age"),		Bytes.toBytes("21"));
r2.add(Bytes.toBytes("c3"),	Bytes.toBytes("City"),		Bytes.toBytes("Ambala"));
hTable.put(r2); 

Put r3 = new Put(Bytes.toBytes("row3"));

r3.add(Bytes.toBytes("c1"), Bytes.toBytes("Roll_No"),	Bytes.toBytes("013"));
r3.add(Bytes.toBytes("c1"),	Bytes.toBytes("Name"),		Bytes.toBytes("jawahar"));
r3.add(Bytes.toBytes("c1"),	Bytes.toBytes("Course"),		Bytes.toBytes("CSE"));

r3.add(Bytes.toBytes("c2"), Bytes.toBytes("Gmail"),	Bytes.toBytes("jawahar@gamil.com"));
r3.add(Bytes.toBytes("c2"),	Bytes.toBytes("Gender"),		Bytes.toBytes("M"));
r3.add(Bytes.toBytes("c2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("9876521360"));

r3.add(Bytes.toBytes("c3"),	Bytes.toBytes("Year"),		Bytes.toBytes("2017"));
r3.add(Bytes.toBytes("c3"),	Bytes.toBytes("Age"),		Bytes.toBytes("23"));
r3.add(Bytes.toBytes("c3"),	Bytes.toBytes("City"),		Bytes.toBytes("Delhi"));
hTable.put(r3); 

Put r4 = new Put(Bytes.toBytes("row4"));

r4.add(Bytes.toBytes("c1"), Bytes.toBytes("Roll_No"),	Bytes.toBytes("014"));
r4.add(Bytes.toBytes("c1"),	Bytes.toBytes("Name"),		Bytes.toBytes("mahesh"));
r4.add(Bytes.toBytes("c1"),	Bytes.toBytes("Course"),		Bytes.toBytes("CSE"));

r4.add(Bytes.toBytes("c2"), Bytes.toBytes("Gmail"),	Bytes.toBytes("mahesh@gamil.com"));
r4.add(Bytes.toBytes("c2"),	Bytes.toBytes("Gender"),		Bytes.toBytes("M"));
r4.add(Bytes.toBytes("c2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("9876565428"));

r4.add(Bytes.toBytes("c3"),	Bytes.toBytes("Year"),		Bytes.toBytes("2017"));
r4.add(Bytes.toBytes("c3"),	Bytes.toBytes("Age"),		Bytes.toBytes("19"));
r4.add(Bytes.toBytes("c3"),	Bytes.toBytes("City"),		Bytes.toBytes("Delhi"));
hTable.put(r4); 

Put r5 = new Put(Bytes.toBytes("row5"));

r5.add(Bytes.toBytes("c1"), Bytes.toBytes("Roll_No"),	Bytes.toBytes("015"));
r5.add(Bytes.toBytes("c1"),	Bytes.toBytes("Name"),		Bytes.toBytes("nikhil"));
r5.add(Bytes.toBytes("c1"),	Bytes.toBytes("Course"),		Bytes.toBytes("CSE"));

r5.add(Bytes.toBytes("c2"), Bytes.toBytes("Gmail"),	Bytes.toBytes("nikhil@gamil.com"));
r5.add(Bytes.toBytes("c2"),	Bytes.toBytes("Gender"),		Bytes.toBytes("M"));
r5.add(Bytes.toBytes("c2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("8869543210"));

r5.add(Bytes.toBytes("c3"),	Bytes.toBytes("Year"),		Bytes.toBytes("2017"));
r5.add(Bytes.toBytes("c3"),	Bytes.toBytes("Age"),		Bytes.toBytes("21"));
r5.add(Bytes.toBytes("c3"),	Bytes.toBytes("City"),		Bytes.toBytes("Delhi"));
hTable.put(r5); 

System.out.println("Data is inserted in the ",t," table");     
ht.close();   
}
}