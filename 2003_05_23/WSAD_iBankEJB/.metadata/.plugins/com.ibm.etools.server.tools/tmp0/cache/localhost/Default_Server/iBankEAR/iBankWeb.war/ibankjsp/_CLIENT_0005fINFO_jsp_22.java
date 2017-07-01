package ibankjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Vector;
import org.apache.jasper.runtime.*;
import java.beans.*;
import org.apache.jasper.JasperException;
import java.io.ByteArrayOutputStream;
import org.apache.jasper.compiler.ibmtsx.*;
import org.apache.jasper.compiler.ibmdb.*;
import java.sql.SQLException;
import com.overstar.ildar.ibank.model.*;
import com.overstar.ildar.ibank.model.accounts.*;
import com.overstar.ildar.ibank.servlets.*;
import com.overstar.ildar.ibank.servlets.util.*;


public class _CLIENT_0005fINFO_jsp_22 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _CLIENT_0005fINFO_jsp_22( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_CLIENT_0005fINFO_jsp_22.dat");
            oin = new ObjectInputStream(fin);
            _jspx_html_data = (char[][]) oin.readObject();
        } catch (Exception ex) {
            throw new JasperException("Unable to open data file");
        } finally {
            if (oin != null)
                try { oin.close(); } catch (IOException ignore) { }
        }
    }

    public void _jspService(HttpServletRequest request, HttpServletResponse  response)
        throws IOException, ServletException {

        JspFactory _jspxFactory = null;
        PageContext pageContext = null;
        HttpSession session = null;
        ServletContext application = null;
        ServletConfig config = null;
        JspWriter out = null;
        Object page = this;
        String  _value = null;
        setBooleanIgnoreException();
        try {

            if (_jspx_inited == false) {
                _jspx_init();
                _jspx_inited = true;
            }
            _jspxFactory = JspFactory.getDefaultFactory();
            response.setContentType("text/html; charset=windows-1251");
            pageContext = _jspxFactory.getPageContext(this, request, response,
			"", true, 8192, true);

            application = pageContext.getServletContext();
            config = pageContext.getServletConfig();
            session = pageContext.getSession();
            out = pageContext.getOut();

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 9,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 9,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 25,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 25,53-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 26,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 26,62-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 27,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 27,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 28,0
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 28,61-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 29,0
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 29,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 29,134
                com.overstar.ildar.ibank.model.IBank userIBank = null;
                boolean _jspx_specialuserIBank  = false;
                 synchronized (session) {
                    userIBank= (com.overstar.ildar.ibank.model.IBank)
                    pageContext.getAttribute("userIBank",PageContext.SESSION_SCOPE);
                    if ( userIBank == null ) {
                        _jspx_specialuserIBank = true;
                        try {
                            userIBank = (com.overstar.ildar.ibank.model.IBank) Beans.instantiate(getClassLoader(), "com.overstar.ildar.ibank.model.IBank");
                        } catch (Exception exc) {
                             throw new ServletException (" Cannot create bean of class "+"com.overstar.ildar.ibank.model.IBank");
                        }
                        pageContext.setAttribute("userIBank", userIBank, PageContext.SESSION_SCOPE);
                    }
                    String doSetAttribute = getInitParameter("dosetattribute");
                    if ((doSetAttribute != null) && (doSetAttribute.equalsIgnoreCase("true"))){
                        session.setAttribute("userIBank", userIBank);
                    }
                 } 
                if(_jspx_specialuserIBank == true) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 29,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 29,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 29,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 30,0
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 30,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 38,0
                
                //Execute Bean Methods 
                Vector bankAccounts = userIBank.getCurrentIClient().getBankAccountsAll(); 
                BankAccount curBankAccount = null;
                java.util.Date curDate = new java.util.Date();
                Cookie [] cookies = request.getCookies();
                String lastDate = ServletUtilities.getCookieValue(cookies, "lastDate", curDate.toString());
                java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 38,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 43,64
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 43,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 43,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 43,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 75,18
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 75,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 75,63
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 75,65-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 80,34
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 80,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 80,78
                out.print(userIBank.getCurrentIClient().rtInn_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 80,80-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 84,34
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 84,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 84,78
                out.print(userIBank.getCurrentIClient().rtFio_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 84,80-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 88,34
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 88,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 88,79
                out.print(userIBank.getCurrentIClient().rtAddr_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 88,81-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 92,34
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 92,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 92,75
                out.print(userIBank.getCurrentIClient().rtCity());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 92,77-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 96,34
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 96,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 96,113
                out.print(formatter.format((java.util.Date)userIBank.getCurrentIClient().rtReg_date()));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 96,115-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 101,38
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 101,40-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 101,145
                 for (int i=0; i  <  bankAccounts.size(); i++){ curBankAccount = (BankAccount)bankAccounts.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 101,147-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 102,48
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 102,51-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 102,90
                out.print(curBankAccount.getId().getId2AsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 102,92-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 103,38
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 103,40-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 103,43
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 103,45-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 108,34
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 108,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 108,46
                out.print( curDate );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 108,48-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 112,34
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 112,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 112,45
                out.print(lastDate);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 112,47-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 116,34
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 116,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 116,76
                out.print(userIBank.getCurrentIClient().rtPerms());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 116,78-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 137,27
                out.print(_jspx_html_data[20]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 137,30-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 137,38
                out.print(lastDate);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 137,40-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 137,44
                out.print(_jspx_html_data[21]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 137,47-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 137,56
                out.print( curDate );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 137,58-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 150,0
                out.print(_jspx_html_data[22]);
            // end

        } catch (Exception ex) {
            if ((out != null) && (out.getBufferSize() != 0)){
                out.clearBuffer();
            }
            pageContext.handlePageException(ex);
        } catch ( Throwable t) {
            if ((out != null) && (out.getBufferSize() != 0)){
                out.clearBuffer();
            }
            pageContext.handlePageException(new Exception(t.getMessage()));
        } finally {
            if ( out != null){
                out.flush();
            }
            _jspxFactory.releasePageContext(pageContext);
        }
    }
    private void setBooleanIgnoreException() {
        if (checkedAttributeIgnoreException) return;
        
        checkedAttributeIgnoreException = true;
        String initParamIgnoreException =(String)(getServletConfig().getInitParameter("jsp.repeatTag.ignoreException"));
        if ((initParamIgnoreException != null) && (initParamIgnoreException.toLowerCase().equals("true"))){ 
            throwException = false;
        }
    }
}
