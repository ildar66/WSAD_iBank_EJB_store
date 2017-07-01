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


public class _CLIENT_0005fINFO_jsp_2 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _CLIENT_0005fINFO_jsp_2( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_CLIENT_0005fINFO_jsp_2.dat");
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
                com.overstar.ildar.ibank.model.IBank IBankBean = null;
                boolean _jspx_specialIBankBean  = false;
                 synchronized (session) {
                    IBankBean= (com.overstar.ildar.ibank.model.IBank)
                    pageContext.getAttribute("IBankBean",PageContext.SESSION_SCOPE);
                    if ( IBankBean == null ) {
                        _jspx_specialIBankBean = true;
                        try {
                            IBankBean = (com.overstar.ildar.ibank.model.IBank) Beans.instantiate(getClassLoader(), "com.overstar.ildar.ibank.model.IBank");
                        } catch (Exception exc) {
                             throw new ServletException (" Cannot create bean of class "+"com.overstar.ildar.ibank.model.IBank");
                        }
                        pageContext.setAttribute("IBankBean", IBankBean, PageContext.SESSION_SCOPE);
                    }
                    String doSetAttribute = getInitParameter("dosetattribute");
                    if ((doSetAttribute != null) && (doSetAttribute.equalsIgnoreCase("true"))){
                        session.setAttribute("IBankBean", IBankBean);
                    }
                 } 
                if(_jspx_specialIBankBean == true) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 25,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 25,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 25,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 31,64
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 31,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 31,109
                out.print(IBankBean.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 31,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 62,18
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 62,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 62,63
                out.print(IBankBean.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 62,65-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 67,34
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 67,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 67,78
                out.print(IBankBean.getCurrentIClient().rtInn_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 67,80-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 71,34
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 71,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 71,78
                out.print(IBankBean.getCurrentIClient().rtFio_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 71,80-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 75,34
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 75,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 75,79
                out.print(IBankBean.getCurrentIClient().rtAddr_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 75,81-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 79,34
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 79,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 79,75
                out.print(IBankBean.getCurrentIClient().rtCity());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 79,77-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 83,34
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 83,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 83,79
                out.print(IBankBean.getCurrentIClient().rtReg_date());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 83,81-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 91,34
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 91,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 91,59
                out.print( new java.util.Date() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 91,61-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 99,34
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 99,37-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 99,76
                out.print(IBankBean.getCurrentIClient().rtPerms());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 99,78-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 120,60
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 120,63-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 120,85
                out.print( new java.util.Date() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 120,87-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\CLIENT_INFO.jsp" 133,0
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
