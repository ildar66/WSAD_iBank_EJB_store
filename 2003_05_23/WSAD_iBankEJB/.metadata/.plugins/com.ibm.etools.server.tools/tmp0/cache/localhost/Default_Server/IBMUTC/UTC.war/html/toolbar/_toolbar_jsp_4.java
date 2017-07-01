package html.toolbar;

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
import com.ibm.etools.utc.view.Toolbar;


public class _toolbar_jsp_4 extends HttpJspBase {

    static char[][] _jspx_html_data = null;

    static {
    }
    public _toolbar_jsp_4( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("html/toolbar/_toolbar_jsp_4.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 1,0-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 10,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 10,114-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 11,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 11,37-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 21,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 21,2-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 25,0
                 int pg = -1;
                   try {
                     pg = Integer.parseInt(request.getParameter("page"));
                   } catch (Exception e) { }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 25,2-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 29,116
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 29,119-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 29,141
                out.print( Toolbar.getImage(pg) );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 29,143-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 30,107
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 30,107-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 30,156
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_0 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_0.setPageContext(pageContext);
                _jspx_th_utc_resource_0.setParent(null);
                _jspx_th_utc_resource_0.setKey( Toolbar.getTitle(pg) );
                try {
                    int _jspx_eval_utc_resource_0 = _jspx_th_utc_resource_0.doStartTag();
                    if (_jspx_eval_utc_resource_0 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_0 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 30,107-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 30,156
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_0.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_0.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 30,156-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 33,0
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 33,3-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 33,46
                out.print( Toolbar.getExtraToolbarItems(request, pg) );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 33,48-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 35,0
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 35,2-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 36,26
                 String helpURL = Toolbar.getHelpURL(pg);
                   if (helpURL != null) { 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 36,28-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,28
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,31-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,40
                out.print( helpURL );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,42-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,53
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,56-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,86
                out.print( Toolbar.getHelpReturnURL(pg) );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,88-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,96
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,99-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,114
                out.print( Math.random() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,116-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,204
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,204-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,239
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_1 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_1.setPageContext(pageContext);
                _jspx_th_utc_resource_1.setParent(null);
                _jspx_th_utc_resource_1.setKey("helpPageTitle");
                try {
                    int _jspx_eval_utc_resource_1 = _jspx_th_utc_resource_1.doStartTag();
                    if (_jspx_eval_utc_resource_1 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_1 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,204-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,239
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_1.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_1.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 38,239-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 39,0
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 39,2-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 39,5
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 39,7-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\toolbar.jsp" 46,7
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
