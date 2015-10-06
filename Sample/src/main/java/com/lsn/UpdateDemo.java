package com.lsn;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class UpdateDemo {
	 private static MongoClient mc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
    		mc = new MongoClient();
    		DB db=mc.getDB("anup");
    		DBCollection collection=db.getCollection("student");
    		DBObject doc=new BasicDBObject();
    		doc.put("name", "anmol");
    		DBObject docupdate=new BasicDBObject();
    		docupdate.put("$set", docupdate);
    		collection.update(doc, docupdate);
    	}catch(Exception e){
    		
    	}
	}

}
