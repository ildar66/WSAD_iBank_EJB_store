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


public class _RECIPIENTS_0005fCHOOSEN_jsp_19 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end
    // end

    static {
    }
    public _RECIPIENTS_0005fCHOOSEN_jsp_19( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_RECIPIENTS_0005fCHOOSEN_jsp_19.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 9,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 9,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 26,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 26,53-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 27,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 27,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 27,134
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 27,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 27,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 27,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 28,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 28,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 28,131
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 28,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 28,131
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 28,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 29,0
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 29,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 34,0
                
                response.setContentType("text/html; charset=windows-1251");
                //Execute Bean Methods 
                Recipient curRecipient = userIBank.getCurrentRecipient();
                BankBean = Bank.findWithBankPK(curRecipient.rtBic());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 34,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 39,64
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 39,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 39,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 39,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 122,198
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 122,201-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 122,224
                out.print( curRecipient.rtName() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 122,226-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 126,85
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 126,88-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 126,108
                out.print(curRecipient.rtInn());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 126,110-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 130,98
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 130,101-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 130,122
                out.print(curRecipient.rtBill());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 130,124-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 134,84
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 134,87-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 134,107
                out.print(curRecipient.rtBic());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 134,109-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 138,107
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 138,110-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 138,132
                out.print(BankBean.rtBank_name());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 138,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 142,130
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 142,133-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 142,155
                out.print(BankBean.rtBill_corr());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 142,157-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 146,199
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 146,202-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 146,229
                out.print( curRecipient.rtComments() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 146,231-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_CHOOSEN.jsp" 167,0
                out.print(_jspx_html_data[13]);
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
