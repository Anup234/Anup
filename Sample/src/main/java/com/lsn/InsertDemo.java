package com.lsn;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


public class InsertDemo 
{
    private static MongoClient mc;
	public static void main( String[] args )
    {
    	try{
    		mc = new MongoClient();
    		DB db=mc.getDB("anup");
    		DBCollection collection=db.getCollection("student");
    		BasicDBObject doc=new BasicDBObject();
    		doc.put("name", "deep");
    		doc.put("age", 28);
    		doc.put("status", "S");
    		collection.insert(doc);
    		 System.out.println( "Inserted" );
    		
    	}catch(Exception e){
    		
    	}
       
    }
    
}
