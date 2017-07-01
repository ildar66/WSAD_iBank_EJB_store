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


public class _error_jsp_1 extends HttpJspBase {

    static char[][] _jspx_html_data = null;

    static {
    }
    public _error_jsp_1( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("_error_jsp_1.dat");
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
        Throwable exception = (Throwable) request.getAttribute("javax.servlet.jsp.jspException");
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
			"", true, 8192, true);

            application = pageContext.getServletContext();
            config = pageContext.getServletConfig();
            session = pageContext.getSession();
            out = pageContext.getOut();

            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 1,0-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 10,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 10,69-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 11,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 11,37-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 25,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 25,0-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 25,34
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_0 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_0.setPageContext(pageContext);
                _jspx_th_utc_resource_0.setParent(null);
                _jspx_th_utc_resource_0.setKey("errorMessage");
                try {
                    int _jspx_eval_utc_resource_0 = _jspx_th_utc_resource_0.doStartTag();
                    if (_jspx_eval_utc_resource_0 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_0 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 25,0-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 25,34
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_0.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_0.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 25,34-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 26,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 26,3-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 26,27
                out.print( exception.getMessage() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 26,29-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 27,5
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 27,7-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 27,37
                 exception.printStackTrace(); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 27,39-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 29,0
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 29,0-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 29,31
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_1 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_1.setPageContext(pageContext);
                _jspx_th_utc_resource_1.setParent(null);
                _jspx_th_utc_resource_1.setKey("errorText");
                try {
                    int _jspx_eval_utc_resource_1 = _jspx_th_utc_resource_1.doStartTag();
                    if (_jspx_eval_utc_resource_1 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_1 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 29,0-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 29,31
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_1.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_1.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 29,31-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\error.jsp" 32,7
                out.print(_jspx_html_data[6]);
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
