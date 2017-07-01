package itso.ejb35.bmp;

import java.sql.Timestamp;
/**
* This is a Primary Key Class for the Entity Bean
**/
public class TransactionRecordKey implements java.io.Serializable {
    public Timestamp primaryKey;
    final static long serialVersionUID = 3206093459760846163L;

/**
* TransactionRecordKey() constructor 
*/
public TransactionRecordKey()  {
}
/**
* TransactionRecordKey(String key) constructor 
*/
public TransactionRecordKey(Timestamp key)  {
	primaryKey = key;
}
/**
* equals method
* - user must provide a proper implementation for the equal method. The generated 
*   method assumes the key is a String object.
*/
public boolean equals (Object o)  {
	if (o instanceof TransactionRecordKey) 
		return primaryKey.equals(((TransactionRecordKey)o).primaryKey);
	else
		return false;
}
/**
* hashode method
* - user must provide a proper implementation for the hashCode method. The generated
*    method assumes the key is a String object.
*/
public int hashCode ()  {
	return primaryKey.hashCode();
}
}
