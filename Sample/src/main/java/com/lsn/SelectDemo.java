package com.lsn;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class SelectDemo {

	private static MongoClient mc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			mc = new MongoClient();
			DB db=mc.getDB("anup");
			DBCollection collection=db.getCollection("student");
			/*
			//To find only one record from collection
			DBObject obj=collection.findOne();
			System.out.println(obj);
			*/
			DBCursor query=collection.find();
		
			/*DBCursor cursor=collection.find();
			while(cursor.hasNext()){
				System.out.println(cursor.next());
			}*/
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
