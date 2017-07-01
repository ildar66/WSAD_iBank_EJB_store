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
import com.overstar.ildar.ibank.model.Bank;


public class _BANKS_0005fLISTED_jsp_0 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end
    // end

    static {
    }
    public _BANKS_0005fLISTED_jsp_0( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_BANKS_0005fLISTED_jsp_0.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 9,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 9,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 25,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 25,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,134
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,131
                com.overstar.ildar.ibank.model.Bank BankBean = null;
                boolean _jspx_specialBankBean  = false;
                 synchronized (session) {
                    BankBean= (com.overstar.ildar.ibank.model.Bank)
                    pageContext.getAttribute("BankBean",PageContext.SESSION_SCOPE);
                    if ( BankBean == null ) {
                        _jspx_specialBankBean = true;
                        try {
                            BankBean = (com.overstar.ildar.ibank.model.Bank) Beans.instantiate(getClassLoader(), "com.overstar.ildar.ibank.model.Bank");
                        } catch (Exception exc) {
                             throw new ServletException (" Cannot create bean of class "+"com.overstar.ildar.ibank.model.Bank");
                        }
                        pageContext.setAttribute("BankBean", BankBean, PageContext.SESSION_SCOPE);
                    }
                    String doSetAttribute = getInitParameter("dosetattribute");
                    if ((doSetAttribute != null) && (doSetAttribute.equalsIgnoreCase("true"))){
                        session.setAttribute("BankBean", BankBean);
                    }
                 } 
                if(_jspx_specialBankBean == true) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,131
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 28,0
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 28,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 32,0
                
                //Execute Bean Methods 
                java.util.Vector banks = BankBean.getBanks(request.getParameter("BIC"), request.getParameter("bankname"),request.getParameter("sort"));
                Bank curBank = null;
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 32,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 38,64
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 38,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 38,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 38,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 90,71
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 90,74-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 90,102
                out.print( request.getParameter("BIC"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 90,104-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 96,77
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 96,80-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 96,113
                out.print( request.getParameter("bankname"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 96,115-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 102,41
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 102,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 102,72
                out.print(request.getParameter("sort"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 102,74-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 117,8
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 117,10-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 117,87
                 for (int i=0; i  <  banks.size(); i++){ curBank = (Bank)banks.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 117,89-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,40
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,43-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,77
                out.print( curBank.getBik().getIdAsString() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,79-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,80
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,83-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,106
                out.print( curBank.rtBank_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,108-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,109
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,112-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,135
                out.print( curBank.rtBill_corr() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,137-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,165
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,168-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,202
                out.print( curBank.getBik().getIdAsString() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,204-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 120,16
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 120,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 120,42
                out.print( curBank.rtBill_corr() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 120,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 121,16
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 121,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 121,42
                out.print( curBank.rtBank_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 121,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 122,16
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 122,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 122,37
                out.print( curBank.rtCity() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 122,39-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 123,16
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 123,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 123,41
                out.print( curBank.rtDelivery() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 123,43-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 125,8
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 125,10-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 125,13
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 125,15-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 128,29
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 128,32-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 128,44
                out.print(banks.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 128,46-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 136,0
                out.print(_jspx_html_data[20]);
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
