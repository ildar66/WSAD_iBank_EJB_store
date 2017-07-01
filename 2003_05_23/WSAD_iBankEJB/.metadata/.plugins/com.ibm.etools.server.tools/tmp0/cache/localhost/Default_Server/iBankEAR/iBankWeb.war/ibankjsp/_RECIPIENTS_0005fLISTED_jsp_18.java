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


public class _RECIPIENTS_0005fLISTED_jsp_18 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _RECIPIENTS_0005fLISTED_jsp_18( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_RECIPIENTS_0005fLISTED_jsp_18.dat");
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 35,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 121,52
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 121,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 121,83
                out.print(request.getParameter("sort"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 121,85-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 133,20
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 133,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 133,119
                 for (int i=0; i  <  recipients.size(); i++){ curRecipient = (Recipient)recipients.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 133,121-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,126
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,129-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,165
                out.print(curRecipient.getId().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,167-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,176
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,179-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,217
                out.print( curRecipient.getId().getIdAsString() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,219-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,263
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,266-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,302
                out.print(curRecipient.getId().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,304-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,308
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,311-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,334
                out.print( curRecipient.rtName() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 135,336-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 136,28
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 136,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 136,53
                out.print( curRecipient.rtInn() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 136,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 137,28
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 137,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 137,54
                out.print( curRecipient.rtBill() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 137,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 138,28
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 138,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 138,53
                out.print( curRecipient.rtBic() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 138,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 140,20
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 140,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 140,25
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 140,27-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 153,55
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 153,58-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 153,75
                out.print(recipients.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 153,77-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_LISTED.jsp" 166,0
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
