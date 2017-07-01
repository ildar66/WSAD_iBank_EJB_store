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
import com.overstar.ildar.ibank.model.IClient;


public class _IClientResults_jsp_0 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _IClientResults_jsp_0( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("_IClientResults_jsp_0.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 45,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 45,59-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 47,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 47,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 47,140
                com.overstar.ildar.ibank.model.IClient IClientBean = null;
                boolean _jspx_specialIClientBean  = false;
                 synchronized (session) {
                    IClientBean= (com.overstar.ildar.ibank.model.IClient)
                    pageContext.getAttribute("IClientBean",PageContext.SESSION_SCOPE);
                    if ( IClientBean == null ) {
                        _jspx_specialIClientBean = true;
                        try {
                            IClientBean = (com.overstar.ildar.ibank.model.IClient) Beans.instantiate(getClassLoader(), "com.overstar.ildar.ibank.model.IClient");
                        } catch (Exception exc) {
                             throw new ServletException (" Cannot create bean of class "+"com.overstar.ildar.ibank.model.IClient");
                        }
                        pageContext.setAttribute("IClientBean", IClientBean, PageContext.SESSION_SCOPE);
                    }
                    String doSetAttribute = getInitParameter("dosetattribute");
                    if ((doSetAttribute != null) && (doSetAttribute.equalsIgnoreCase("true"))){
                        session.setAttribute("IClientBean", IClientBean);
                    }
                 } 
                if(_jspx_specialIClientBean == true) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 47,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 47,140
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 47,140-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 49,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 49,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 78,0
                
                //Execute Bean Methods 
                IClientBean = IClientBean.findWithIClientPK(new java.lang.String(request.getParameter("anIdStr"))); 
                String method1 = IClientBean.rtPhone_cln(); 
                String method2 = IClientBean.rtStatus().toString(); 
                String method3 = IClientBean.rtSoato(); 
                String method4 = IClientBean.rtResident_flag(); 
                String method5 = IClientBean.rtReg_date().toString(); 
                String method6 = IClientBean.rtPerms(); 
                String method7 = IClientBean.rtOrdering_customer(); 
                String method8 = IClientBean.rtOkpo(); 
                String method9 = IClientBean.rtNum_dogov(); 
                String method10 = IClientBean.rtName_cln(); 
                String method11 = IClientBean.rtLock_word(); 
                String method12 = IClientBean.rtKpp(); 
                String method13 = IClientBean.rtInn_cln(); 
                String method14 = IClientBean.rtFio_cln(); 
                String method15 = IClientBean.rtFax_cln(); 
                String method16 = IClientBean.rtExt_client_id(); 
                String method17 = IClientBean.rtEmail_cln(); 
                String method18 = IClientBean.rtDoc_sign_num(); 
                String method19 = IClientBean.rtCountry_code(); 
                String method20 = IClientBean.rtCln_type(); 
                String method21 = IClientBean.rtCity_latin(); 
                String method22 = IClientBean.rtCity(); 
                String method23 = IClientBean.rtAddress_latin(); 
                String method24 = IClientBean.rtAddr_cln(); 
                String method25 = IClientBean.getClient_id().getIdAsString(); 
                String method26 = IClientBean.toStringFull();
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 78,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 95,9
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 95,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 95,19
                out.print(method1);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 95,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 103,9
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 103,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 103,19
                out.print(method2);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 103,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 111,9
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 111,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 111,19
                out.print(method3);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 111,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 119,9
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 119,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 119,19
                out.print(method4);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 119,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 127,9
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 127,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 127,19
                out.print(method5);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 127,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 135,9
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 135,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 135,19
                out.print(method6);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 135,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 143,9
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 143,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 143,19
                out.print(method7);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 143,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 151,9
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 151,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 151,19
                out.print(method8);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 151,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 159,9
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 159,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 159,19
                out.print(method9);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 159,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 167,9
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 167,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 167,20
                out.print(method10);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 167,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 175,9
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 175,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 175,20
                out.print(method11);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 175,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 183,9
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 183,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 183,20
                out.print(method12);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 183,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 191,9
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 191,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 191,20
                out.print(method13);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 191,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 199,9
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 199,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 199,20
                out.print(method14);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 199,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 207,9
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 207,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 207,20
                out.print(method15);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 207,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 215,9
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 215,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 215,20
                out.print(method16);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 215,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 223,9
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 223,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 223,20
                out.print(method17);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 223,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 231,9
                out.print(_jspx_html_data[20]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 231,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 231,20
                out.print(method18);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 231,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 239,9
                out.print(_jspx_html_data[21]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 239,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 239,20
                out.print(method19);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 239,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 247,9
                out.print(_jspx_html_data[22]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 247,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 247,20
                out.print(method20);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 247,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 255,9
                out.print(_jspx_html_data[23]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 255,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 255,20
                out.print(method21);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 255,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 263,9
                out.print(_jspx_html_data[24]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 263,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 263,20
                out.print(method22);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 263,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 271,9
                out.print(_jspx_html_data[25]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 271,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 271,20
                out.print(method23);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 271,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 279,9
                out.print(_jspx_html_data[26]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 279,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 279,20
                out.print(method24);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 279,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 287,9
                out.print(_jspx_html_data[27]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 287,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 287,20
                out.print(method25);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 287,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 295,9
                out.print(_jspx_html_data[28]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 295,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 295,20
                out.print(method26);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 295,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\IClientResults.jsp" 303,0
                out.print(_jspx_html_data[29]);
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
