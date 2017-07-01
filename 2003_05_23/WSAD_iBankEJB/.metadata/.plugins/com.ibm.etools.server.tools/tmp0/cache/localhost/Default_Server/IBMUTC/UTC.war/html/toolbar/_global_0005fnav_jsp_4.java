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


public class _global_0005fnav_jsp_4 extends HttpJspBase {

    static char[][] _jspx_html_data = null;

    static {
    }
    public _global_0005fnav_jsp_4( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("html/toolbar/_global_0005fnav_jsp_4.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 1,0-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 12,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 12,73-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 13,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 13,37-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 29,61
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 29,61-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 29,91
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_0 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_0.setPageContext(pageContext);
                _jspx_th_utc_resource_0.setParent(null);
                _jspx_th_utc_resource_0.setKey("utcTitle");
                try {
                    int _jspx_eval_utc_resource_0 = _jspx_th_utc_resource_0.doStartTag();
                    if (_jspx_eval_utc_resource_0 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_0 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 29,61-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 29,91
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_0.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_0.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 29,91-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 32,142
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 32,142-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 32,177
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_1 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_1.setPageContext(pageContext);
                _jspx_th_utc_resource_1.setParent(null);
                _jspx_th_utc_resource_1.setKey("homePageTitle");
                try {
                    int _jspx_eval_utc_resource_1 = _jspx_th_utc_resource_1.doStartTag();
                    if (_jspx_eval_utc_resource_1 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_1 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 32,142-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 32,177
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_1.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_1.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 32,177-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 34,142
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 34,142-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 34,183
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_2 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_2.setPageContext(pageContext);
                _jspx_th_utc_resource_2.setParent(null);
                _jspx_th_utc_resource_2.setKey("jndiLookupPageTitle");
                try {
                    int _jspx_eval_utc_resource_2 = _jspx_th_utc_resource_2.doStartTag();
                    if (_jspx_eval_utc_resource_2 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_2 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 34,142-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 34,183
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_2.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_2.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 34,183-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 36,139
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 36,139-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 36,173
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_3 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_3.setPageContext(pageContext);
                _jspx_th_utc_resource_3.setParent(null);
                _jspx_th_utc_resource_3.setKey("ejbPageTitle");
                try {
                    int _jspx_eval_utc_resource_3 = _jspx_th_utc_resource_3.doStartTag();
                    if (_jspx_eval_utc_resource_3 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_3 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 36,139-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 36,173
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_3.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_3.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 36,173-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 38,153
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 38,153-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 38,195
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_4 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_4.setPageContext(pageContext);
                _jspx_th_utc_resource_4.setParent(null);
                _jspx_th_utc_resource_4.setKey("jndiObjectsPageTitle");
                try {
                    int _jspx_eval_utc_resource_4 = _jspx_th_utc_resource_4.doStartTag();
                    if (_jspx_eval_utc_resource_4 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_4 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 38,153-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 38,195
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_4.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_4.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 38,195-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 40,149
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 40,149-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 40,190
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_5 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_5.setPageContext(pageContext);
                _jspx_th_utc_resource_5.setParent(null);
                _jspx_th_utc_resource_5.setKey("propertiesPageTitle");
                try {
                    int _jspx_eval_utc_resource_5 = _jspx_th_utc_resource_5.doStartTag();
                    if (_jspx_eval_utc_resource_5 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_5 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 40,149-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 40,190
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_5.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_5.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 40,190-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 42,131
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 42,131-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 42,166
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_6 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_6.setPageContext(pageContext);
                _jspx_th_utc_resource_6.setParent(null);
                _jspx_th_utc_resource_6.setKey("helpPageTitle");
                try {
                    int _jspx_eval_utc_resource_6 = _jspx_th_utc_resource_6.doStartTag();
                    if (_jspx_eval_utc_resource_6 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_6 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 42,131-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 42,166
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_6.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_6.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 42,166-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\toolbar\\global_nav.jsp" 48,7
                out.print(_jspx_html_data[9]);
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
