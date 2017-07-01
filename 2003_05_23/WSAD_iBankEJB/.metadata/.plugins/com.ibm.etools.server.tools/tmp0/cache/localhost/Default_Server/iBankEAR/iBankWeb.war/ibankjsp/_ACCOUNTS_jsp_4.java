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


public class _ACCOUNTS_jsp_4 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _ACCOUNTS_jsp_4( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_ACCOUNTS_jsp_4.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 6,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 6,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 24,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 24,53-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 25,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 25,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 25,134
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 25,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 25,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 25,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 26,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 26,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 31,0
                
                //Execute Bean Methods 
                //response.setContentType("text/html; charset=windows-1251");
                java.util.Vector bankAccounts = userIBank.getCurrentIClient().getBankAccountsAll();
                BankAccount curBankAccount = null;
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 31,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 36,64
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 36,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 36,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 36,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 81,20
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 81,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 81,127
                 for (int i=0; i  <  bankAccounts.size(); i++){ curBankAccount = (BankAccount)bankAccounts.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 81,129-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 83,35
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 83,38-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 83,73
                out.print(BankAccount.getType(curBankAccount));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 83,75-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 84,55
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 84,58-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 84,97
                out.print(curBankAccount.getId().getId2AsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 84,99-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 84,146
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 84,149-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 84,188
                out.print(curBankAccount.getId().getId2AsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 84,190-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 84,192
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 84,195-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 84,234
                out.print(curBankAccount.getId().getId2AsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 84,236-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 85,28
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 85,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 85,58
                out.print(curBankAccount.rtCurrency());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 85,60-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 86,40
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 86,43-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 86,75
                out.print(curBankAccount.rtCreate_amount());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 86,77-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 87,40
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 87,43-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 87,75
                out.print(curBankAccount.rtCreate_amount());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 87,77-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 88,28
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 88,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 88,61
                out.print(curBankAccount.rtCreate_date());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 88,63-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 90,20
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 90,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 90,25
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 90,27-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\ACCOUNTS.jsp" 102,0
                out.print(_jspx_html_data[15]);
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
