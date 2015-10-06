package com.lsn;
import java.util.ArrayList;
import java.util.List;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class InsertManyDemo {

	private static MongoClient mc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			mc = new MongoClient();
			DB db=mc.getDB("anup"); 
			DBCollection collection =db.getCollection("student");
			DBObject doc1=new BasicDBObject();
			doc1.put("name", "anup");
			doc1.put("age","25");
			doc1.put("status", "A");
			DBObject doc2=new BasicDBObject();
			doc2.put("name","Srinivas");
			doc2.put("age", "28");
			doc2.put("status", "S");
			List<DBObject> al=new ArrayList<DBObject>();
			al.add(doc1);
			al.add(doc2);
			collection.insert(al);
			System.out.println("inserted");
			
			
		}
		catch(Exception e){
			
		}
	}

}
