package html.homePage;

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


public class _home_jsp_1 extends HttpJspBase {

    static char[][] _jspx_html_data = null;

    static {
    }
    public _home_jsp_1( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("html/homePage/_home_jsp_1.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 1,0-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 10,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 10,73-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 11,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 11,37-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 28,154
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 28,154-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 28,195
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_0 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_0.setPageContext(pageContext);
                _jspx_th_utc_resource_0.setParent(null);
                _jspx_th_utc_resource_0.setKey("jndiLookupPageTitle");
                try {
                    int _jspx_eval_utc_resource_0 = _jspx_th_utc_resource_0.doStartTag();
                    if (_jspx_eval_utc_resource_0 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_0 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 28,154-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 28,195
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_0.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_0.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 28,195-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 29,19
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 29,19-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 29,66
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_1 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_1.setPageContext(pageContext);
                _jspx_th_utc_resource_1.setParent(null);
                _jspx_th_utc_resource_1.setKey("jndiLookupPageDescription");
                try {
                    int _jspx_eval_utc_resource_1 = _jspx_th_utc_resource_1.doStartTag();
                    if (_jspx_eval_utc_resource_1 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_1 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 29,19-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 29,66
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_1.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_1.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 29,66-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 31,151
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 31,151-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 31,185
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_2 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_2.setPageContext(pageContext);
                _jspx_th_utc_resource_2.setParent(null);
                _jspx_th_utc_resource_2.setKey("ejbPageTitle");
                try {
                    int _jspx_eval_utc_resource_2 = _jspx_th_utc_resource_2.doStartTag();
                    if (_jspx_eval_utc_resource_2 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_2 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 31,151-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 31,185
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_2.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_2.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 31,185-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 32,19
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 32,19-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 32,59
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_3 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_3.setPageContext(pageContext);
                _jspx_th_utc_resource_3.setParent(null);
                _jspx_th_utc_resource_3.setKey("ejbPageDescription");
                try {
                    int _jspx_eval_utc_resource_3 = _jspx_th_utc_resource_3.doStartTag();
                    if (_jspx_eval_utc_resource_3 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_3 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 32,19-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 32,59
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_3.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_3.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 32,59-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 36,176
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 36,176-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 36,218
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
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 36,176-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 36,218
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_4.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_4.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 36,218-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 37,19
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 37,19-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 37,67
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_5 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_5.setPageContext(pageContext);
                _jspx_th_utc_resource_5.setParent(null);
                _jspx_th_utc_resource_5.setKey("jndiObjectsPageDescription");
                try {
                    int _jspx_eval_utc_resource_5 = _jspx_th_utc_resource_5.doStartTag();
                    if (_jspx_eval_utc_resource_5 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_5 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 37,19-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 37,67
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_5.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_5.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 37,67-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 39,172
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 39,172-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 39,213
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_6 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_6.setPageContext(pageContext);
                _jspx_th_utc_resource_6.setParent(null);
                _jspx_th_utc_resource_6.setKey("propertiesPageTitle");
                try {
                    int _jspx_eval_utc_resource_6 = _jspx_th_utc_resource_6.doStartTag();
                    if (_jspx_eval_utc_resource_6 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_6 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 39,172-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 39,213
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_6.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_6.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 39,213-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 40,19
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 40,19-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 40,66
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_7 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_7.setPageContext(pageContext);
                _jspx_th_utc_resource_7.setParent(null);
                _jspx_th_utc_resource_7.setKey("propertiesPageDescription");
                try {
                    int _jspx_eval_utc_resource_7 = _jspx_th_utc_resource_7.doStartTag();
                    if (_jspx_eval_utc_resource_7 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_7 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 40,19-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 40,66
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_7.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_7.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 40,66-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 47,154
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 47,154-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 47,189
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_8 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_8.setPageContext(pageContext);
                _jspx_th_utc_resource_8.setParent(null);
                _jspx_th_utc_resource_8.setKey("helpPageTitle");
                try {
                    int _jspx_eval_utc_resource_8 = _jspx_th_utc_resource_8.doStartTag();
                    if (_jspx_eval_utc_resource_8 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_8 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 47,154-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 47,189
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_8.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_8.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 47,189-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 48,19
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 48,19-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 48,60
                /* ----  utc:resource ---- */
                com.ibm.etools.utc.ResourceTag _jspx_th_utc_resource_9 = new com.ibm.etools.utc.ResourceTag();
                _jspx_th_utc_resource_9.setPageContext(pageContext);
                _jspx_th_utc_resource_9.setParent(null);
                _jspx_th_utc_resource_9.setKey("helpPageDescription");
                try {
                    int _jspx_eval_utc_resource_9 = _jspx_th_utc_resource_9.doStartTag();
                    if (_jspx_eval_utc_resource_9 == BodyTag.EVAL_BODY_TAG)
                        throw new JspTagException("Since tag handler class com.ibm.etools.utc.ResourceTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_utc_resource_9 != Tag.SKIP_BODY) {
                        do {
                        // end
                        // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 48,19-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 48,60
                        } while (false);
                    }
                    if (_jspx_th_utc_resource_9.doEndTag() == Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_utc_resource_9.release();
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 48,60-"C:\\WSAD_iBank\\.metadata\\.plugins\\com.ibm.etools.server.tools\\tmp0\\IBMUTC\\IBMUTC.ear\\UTC.war\\html\\homePage\\home.jsp" 54,7
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
