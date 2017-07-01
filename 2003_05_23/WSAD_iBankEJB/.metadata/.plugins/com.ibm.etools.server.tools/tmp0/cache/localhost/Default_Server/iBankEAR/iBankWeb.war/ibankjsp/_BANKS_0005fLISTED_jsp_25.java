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


public class _BANKS_0005fLISTED_jsp_25 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end
    // end

    static {
    }
    public _BANKS_0005fLISTED_jsp_25( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_BANKS_0005fLISTED_jsp_25.dat");
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
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 28,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 42,0
                
                //Execute Bean Methods 
                String sort = request.getParameter("sort");
                String operation = request.getParameter("operation");
                String bic = request.getParameter("BIC");
                String bankname = request.getParameter("bankname");
                if(bic==null) {
                  bic = "";
                  bankname = "";
                  sort = "bik";
                  operation = "and";
                }
                java.util.Vector banks = BankBean.getBanks(bic, bankname , sort, operation);
                Bank curBank = null;
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 42,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 48,64
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 48,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 48,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 48,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 99,79
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 99,82-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 99,85
                out.print(bic);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 99,87-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 100,71
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 100,73-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 100,102
                if(operation.equals("and")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 100,104-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 100,112
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 100,114-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 100,115
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 100,117-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 105,85
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 105,88-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 105,96
                out.print(bankname);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 105,98-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 106,73
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 106,75-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 106,103
                if(operation.equals("or")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 106,105-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 106,113
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 106,115-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 106,116
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 106,118-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 111,52
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 111,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 111,59
                out.print(sort);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 111,61-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 112,57
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 112,60-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 112,69
                out.print(operation);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 112,71-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 127,20
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 127,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 127,99
                 for (int i=0; i  <  banks.size(); i++){ curBank = (Bank)banks.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 127,101-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 129,28
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 129,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 129,65
                out.print( curBank.getBik().getIdAsString() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 129,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 130,28
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 130,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 130,54
                out.print( curBank.rtBill_corr() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 130,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 131,28
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 131,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 131,54
                out.print( curBank.rtBank_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 131,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 132,28
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 132,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 132,49
                out.print( curBank.rtCity() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 132,51-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 133,28
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 133,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 133,53
                out.print( curBank.rtDelivery() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 133,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 135,20
                out.print(_jspx_html_data[20]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 135,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 135,25
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 135,27-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 138,41
                out.print(_jspx_html_data[21]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 138,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 138,56
                out.print(banks.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 138,58-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 146,0
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
