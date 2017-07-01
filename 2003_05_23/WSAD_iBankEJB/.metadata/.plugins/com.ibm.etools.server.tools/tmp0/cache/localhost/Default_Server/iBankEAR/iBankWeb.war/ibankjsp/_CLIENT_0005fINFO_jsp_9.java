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


public class _CLIENT_0005fINFO_jsp_9 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _CLIENT_0005fINFO_jsp_9( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_CLIENT_0005fINFO_jsp_9.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 24,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 24,53-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 25,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 25,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 25,134
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 25,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 25,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 25,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 31,64
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 31,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 31,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 31,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 63,18
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 63,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 63,63
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 63,65-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 68,34
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 68,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 68,78
                out.print(userIBank.getCurrentIClient().rtInn_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 68,80-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 72,34
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 72,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 72,78
                out.print(userIBank.getCurrentIClient().rtFio_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 72,80-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 76,34
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 76,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 76,79
                out.print(userIBank.getCurrentIClient().rtAddr_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 76,81-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 80,34
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 80,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 80,75
                out.print(userIBank.getCurrentIClient().rtCity());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 80,77-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 84,34
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 84,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 84,79
                out.print(userIBank.getCurrentIClient().rtReg_date());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 84,81-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 92,34
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 92,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 92,59
                out.print( new java.util.Date() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 92,61-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 100,34
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 100,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 100,76
                out.print(userIBank.getCurrentIClient().rtPerms());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 100,78-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 121,60
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 121,63-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 121,85
                out.print( new java.util.Date() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 121,87-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 134,0
                out.print(_jspx_html_data[12]);
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
