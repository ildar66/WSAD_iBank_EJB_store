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


public class _DOCUMENTS_jsp_35 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _DOCUMENTS_jsp_35( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_DOCUMENTS_jsp_35.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 8,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 8,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 24,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 24,53-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 25,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 25,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 25,134
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 25,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 25,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 25,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 26,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 26,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 31,0
                
                //Execute Bean Methods 
                java.util.Vector V = userIBank.getCurrentIClient().getDocumentsAll();
                java.util.Vector Temp = new Vector(10);
                Payment curDoc = null;
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 31,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 37,64
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 37,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 37,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 37,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 164,52
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 164,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 164,83
                out.print(request.getParameter("sort"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 164,85-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 240,8
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 240,11-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 240,53
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 240,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 241,8
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 241,11-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 241,58
                out.print(userIBank.getCurrentIClient().getDocumentsAll());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 241,60-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 242,8
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 242,11-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 242,12
                out.print(V);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 242,14-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 243,8
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 243,11-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 243,22
                out.print(Temp.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 243,24-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 275,0
                out.print(_jspx_html_data[10]);
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
