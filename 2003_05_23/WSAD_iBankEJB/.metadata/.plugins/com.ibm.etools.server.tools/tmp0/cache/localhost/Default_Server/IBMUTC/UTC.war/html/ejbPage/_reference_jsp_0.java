package html.ejbPage;

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
import com.ibm.etools.utc.Tree;


public class _reference_jsp_0 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _reference_jsp_0( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("html/ejbPage/_reference_jsp_0.dat");
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
            response.setContentType("text/html; charset=utf-8");
            pageContext = _jspxFactory.getPageContext(this, request, response,
			"/error.jsp", true, 8192, true);

            application = pageContext.getServletContext();
            config = pageContext.getServletConfig();
            session = pageContext.getSession();
            out = pageContext.getOut();

            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 1,0-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 10,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 10,106-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 11,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 11,0-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 11,95
                com.ibm.etools.utc.view.ReferenceView referenceView = null;
                boolean _jspx_specialreferenceView  = false;
                 synchronized (session) {
                    referenceView= (com.ibm.etools.utc.view.ReferenceView)
                    pageContext.getAttribute("referenceView",PageContext.SESSION_SCOPE);
                    if ( referenceView == null ) {
                        _jspx_specialreferenceView = true;
                        try {
                            referenceView = (com.ibm.etools.utc.view.ReferenceView) Beans.instantiate(getClassLoader(), "com.ibm.etools.utc.view.ReferenceView");
                        } catch (Exception exc) {
                             throw new ServletException (" Cannot create bean of class "+"com.ibm.etools.utc.view.ReferenceView");
                        }
                        pageContext.setAttribute("referenceView", referenceView, PageContext.SESSION_SCOPE);
                    }
                    String doSetAttribute = getInitParameter("dosetattribute");
                    if ((doSetAttribute != null) && (doSetAttribute.equalsIgnoreCase("true"))){
                        session.setAttribute("referenceView", referenceView);
                    }
                 } 
                if(_jspx_specialreferenceView == true) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 11,0-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 11,95
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 11,95-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 25,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 25,2-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 25,37
                 referenceView.cacheTree(request); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 25,39-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 26,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 26,3-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 26,98
                out.print( Tree.getTableTree(request, "/html/ejbPage/reference.jsp", referenceView.getTreeRoot(), false) );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 26,100-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\ejbPage\\reference.jsp" 29,7
                out.print(_jspx_html_data[4]);
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
