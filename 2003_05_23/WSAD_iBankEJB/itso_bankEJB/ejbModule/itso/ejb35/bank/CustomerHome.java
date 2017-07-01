package itso.ejb35.bank;

import java.util.*;
/**
 * This is a Home interface for the Entity Bean
 */
public interface CustomerHome extends javax.ejb.EJBHome {
/**
 * create method for a CMP entity bean
 * @return itso.ejb35.bank.Customer
 * @param argCustomerID int
 * @exception javax.ejb.CreateException The exception description.
 * @exception java.rmi.RemoteException The exception description.
 */
itso.ejb35.bank.Customer create(int argCustomerID) throws javax.ejb.CreateException, java.rmi.RemoteException;
/**
 * 
 * @return itso.ejb35.bank.Customer
 * @param argCustomerID int
 * @param aTitle java.lang.String
 * @param aFirstName java.lang.String
 * @param aLastName java.lang.String
 * @param aUserID java.lang.String
 * @param aPassword java.lang.String
 * @exception String The exception description.
 * @exception String The exception description.
 */
itso.ejb35.bank.Customer create(int argCustomerID, java.lang.String aTitle, java.lang.String aFirstName, java.lang.String aLastName, java.lang.String aUserID, java.lang.String aPassword) throws javax.ejb.CreateException, java.rmi.RemoteException;
    public Enumeration findByLastName(String aName) throws javax.ejb.FinderException, java.rmi.RemoteException;
/**
 * findByPrimaryKey method comment
 * @return itso.ejb35.bank.Customer
 * @param key itso.ejb35.bank.CustomerKey
 * @exception java.rmi.RemoteException The exception description.
 * @exception javax.ejb.FinderException The exception description.
 */
itso.ejb35.bank.Customer findByPrimaryKey(itso.ejb35.bank.CustomerKey key) throws java.rmi.RemoteException, javax.ejb.FinderException;
    public Customer findByUserID(String aUserID) throws javax.ejb.FinderException, java.rmi.RemoteException;
}
