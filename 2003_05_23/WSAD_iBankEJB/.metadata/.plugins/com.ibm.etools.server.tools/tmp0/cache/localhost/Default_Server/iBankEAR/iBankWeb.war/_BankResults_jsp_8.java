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
import com.overstar.ildar.ibank.model.Bank;


public class _BankResults_jsp_8 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _BankResults_jsp_8( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("_BankResults_jsp_8.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 14,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 14,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 15,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 15,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 15,131
                com.overstar.ildar.ibank.model.Bank BankBean = null;
                boolean _jspx_specialBankBean  = false;
                 synchronized (request) {
                    BankBean= (com.overstar.ildar.ibank.model.Bank)
                    pageContext.getAttribute("BankBean",PageContext.REQUEST_SCOPE);
                    if ( BankBean == null ) {
                        _jspx_specialBankBean = true;
                        try {
                            BankBean = (com.overstar.ildar.ibank.model.Bank) Beans.instantiate(getClassLoader(), "com.overstar.ildar.ibank.model.Bank");
                        } catch (Exception exc) {
                             throw new ServletException (" Cannot create bean of class "+"com.overstar.ildar.ibank.model.Bank");
                        }
                        pageContext.setAttribute("BankBean", BankBean, PageContext.REQUEST_SCOPE);
                    }
                 } 
                if(_jspx_specialBankBean == true) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 15,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 15,131
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 15,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 16,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 16,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 20,0
                
                //Execute Bean Methods 
                java.util.Vector banks = BankBean.getBanks(request.getParameter("anBik"), request.getParameter("anBank_name"));
                Bank curBank = null;
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 20,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 35,8
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 35,10-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 35,87
                 for (int i=0; i  <  banks.size(); i++){ curBank = (Bank)banks.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 35,89-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 37,56
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 37,59-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 37,77
                out.print( curBank.getBik() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 37,79-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 37,81
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 37,84-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 37,102
                out.print( curBank.getBik() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 37,104-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 38,16
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 38,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 38,42
                out.print( curBank.rtBill_corr() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 38,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 39,16
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 39,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 39,42
                out.print( curBank.rtBank_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 39,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 40,16
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 40,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 40,37
                out.print( curBank.rtCity() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 40,39-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 41,16
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 41,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 41,41
                out.print( curBank.rtDelivery() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 41,43-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 43,8
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 43,10-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 43,13
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 43,15-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\BankResults.jsp" 49,0
                out.print(_jspx_html_data[11]);
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
