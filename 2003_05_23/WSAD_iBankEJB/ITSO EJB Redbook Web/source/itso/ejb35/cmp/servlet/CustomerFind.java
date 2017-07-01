package itso.ejb35.cmp.servlet;

import itso.ejb35.cmp.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 * Insert the type's description here.
 * Creation date: (09.04.2003 12:56:16)
 * @author: Shafigullin Ildar
 */
public class CustomerFind extends javax.servlet.http.HttpServlet {
	//private static java.util.ResourceBundle resCustomerFind = java.util.ResourceBundle.getBundle("CustomerFind");  //$NON-NLS-1$
	
/**
 * Process incoming HTTP GET requests 
 * 
 * @param request Object that encapsulates the request to the servlet 
 * @param response Object that encapsulates the response from the servlet
 */
public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

	performTask(request, response);

}
/**
 * Process incoming HTTP POST requests 
 * 
 * @param request Object that encapsulates the request to the servlet 
 * @param response Object that encapsulates the response from the servlet
 */
public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

	performTask(request, response);

}
/**
 * Returns the servlet info string.
 */
public String getServletInfo() {

	return super.getServletInfo();

}
/**
 * Initializes the servlet.
 */
public void init() {
	// insert code to initialize the servlet here

}
/**
 * Process incoming requests for information
 * 
 * @param request Object that encapsulates the request to the servlet 
 * @param response Object that encapsulates the response from the servlet
 */
public void performTask(HttpServletRequest request, HttpServletResponse response) {
    // Read the input parameter from the HTML Form
    String id = request.getParameter("CustomerID"); //$NON-NLS-1$
    //int custId = (new Integer(id)).intValue();
    int custId = Integer.parseInt(id);
    //if (resCustomerFind == null)
    //    resCustomerFind = java.util.ResourceBundle.getBundle("CustomerFind");
    // Set the results page URL
    //String url = resCustomerFind.getString("/ejb/cmpservlet/CustomerFi"); //$NON-NLS-1$
    String url = "/ejb/cmpservlet/CustomerFind.jsp";
    try {
        //......getInitialContext......
        javax.naming.InitialContext initialContext = new javax.naming.InitialContext();
        //Object objHome = initialContext.lookup(resCustomerFind.getString("itso/ejb35/cmp/Customer")); //$NON-NLS-1$
        Object objHome = initialContext.lookup("ejb/itso/ejb35/cmp/CustomerHome"); //$NON-NLS-1$
        CustomerHome customerHome = (CustomerHome) javax.rmi.PortableRemoteObject.narrow(objHome, CustomerHome.class);
        // Find the customer
        Customer customer = customerHome.findByPrimaryKey(new CustomerKey(custId));
        // Forward to the results JSP
        request.setAttribute("customer", customer); //$NON-NLS-1$
        getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
    }
    catch (Throwable theException) {
        // uncomment the following line when unexpected exceptions
        // are occuring to aid in debugging the problem.
        System.out.println("Exception thrown for customer with id:" + id); //$NON-NLS-1$
        theException.printStackTrace();
    }
}
}
