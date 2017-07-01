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


public class _RECIPIENTS_0005fLISTED_jsp_11 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _RECIPIENTS_0005fLISTED_jsp_11( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_RECIPIENTS_0005fLISTED_jsp_11.dat");
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
            response.setContentType("text/html;charset=Cp1251");
            pageContext = _jspxFactory.getPageContext(this, request, response,
			"", true, 8192, true);

            application = pageContext.getServletContext();
            config = pageContext.getServletConfig();
            session = pageContext.getSession();
            out = pageContext.getOut();

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 23,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 23,53-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 24,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 24,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 24,134
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 24,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 24,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 24,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 25,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 25,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 29,0
                
                //Execute Bean Methods 
                java.util.Vector recipients = userIBank.getListRecipients();
                Recipient curRecipient = null;
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 29,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 35,64
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 35,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 35,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 35,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 117,20
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 117,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 117,119
                 for (int i=0; i  <  recipients.size(); i++){ curRecipient = (Recipient)recipients.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 117,121-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 119,126
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 119,129-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 119,165
                out.print(curRecipient.getId().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 119,167-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 119,176
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 119,179-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 119,217
                out.print( curRecipient.getId().getIdAsString() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 119,219-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 119,221
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 119,224-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 119,247
                out.print( curRecipient.rtName() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 119,249-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 120,28
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 120,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 120,53
                out.print( curRecipient.rtInn() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 120,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 121,28
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 121,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 121,54
                out.print( curRecipient.rtBill() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 121,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 122,28
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 122,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 122,53
                out.print( curRecipient.rtBic() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 122,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 124,20
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 124,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 124,25
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 124,27-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 133,54
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 133,57-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 133,74
                out.print(recipients.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 133,76-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 146,0
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
