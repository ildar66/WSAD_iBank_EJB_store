package itso.ejb35.cmp.servlet;

import itso.ejb35.cmp.*;
import itso.ejb35.session.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 * Insert the type's description here.
 * Creation date: (10.04.2003 11:26:24)
 * @author: Shafigullin Ildar
 */
public class CustomerFindSF extends javax.servlet.http.HttpServlet {
    private static CustomerManagerHome customerMgrHome;
/**
 * Process incoming HTTP GET requests 
 * 
 * @param request Object that encapsulates the request to the servlet 
 * @param response Object that encapsulates the response from the servlet
 */
public void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

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
 * Insert the method's description here.
 * Creation date: (10.04.2003 11:43:05)
 * @return itso.ejb35.session.CustomerManagerHome
 */
private CustomerManagerHome getCustomerMgrHome() {
    if (customerMgrHome == null) {
        try {
            // Create a CustomerManager instance
            //java.util.Properties properties = new java.util.Properties();
            //properties.put(javax.naming.Context.PROVIDER_URL, "iiop://localhost:900/");
            //properties.put(javax.naming.Context.INITIAL_CONTEXT_FACTORY, "com.ibm.ejs.ns.jndi.CNInitialContextFactory");
            //javax.naming.InitialContext initialContext = new javax.naming.InitialContext(properties);
            javax.naming.InitialContext initialContext = new javax.naming.InitialContext();
            Object objHome = initialContext.lookup("ejb/itso/ejb35/session/CustomerManagerHome");
            customerMgrHome =
                (CustomerManagerHome) javax.rmi.PortableRemoteObject.narrow(objHome, CustomerManagerHome.class);
        }
        catch (Exception e) {
            System.out.println("Cannot retrieve the EJBHome for Customer");
        }
    }
    return customerMgrHome;
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
    getCustomerMgrHome();
}
/**
 * Process incoming requests for information
 * 
 * @param request Object that encapsulates the request to the servlet 
 * @param response Object that encapsulates the response from the servlet
 */
public void performTask(HttpServletRequest request, HttpServletResponse response) {
    // URL for the results page
    String url = "/ejb/cmpservlet/CustomerFindSF.jsp";
    // Read the input parameters from the HTML Form.
    String id = request.getParameter("CustomerID");
    int custId = (new Integer(id)).intValue();
    try {
        CustomerManager customerManager = customerMgrHome.create();
        // Find the customer
        Customer customer = customerManager.findCustomer(custId);
        java.util.Hashtable ht = customerManager.getAllProperties(customer);
        // Store hashtable and call JSP
        request.setAttribute("custht", ht);
        getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
    }
    catch (Throwable theException) {
        // uncomment the following line when unexpected exceptions
        // are occuring to aid in debugging the problem.
        System.out.println("Cannot find customer with id: " + id);
        theException.printStackTrace();
    }
}
}
