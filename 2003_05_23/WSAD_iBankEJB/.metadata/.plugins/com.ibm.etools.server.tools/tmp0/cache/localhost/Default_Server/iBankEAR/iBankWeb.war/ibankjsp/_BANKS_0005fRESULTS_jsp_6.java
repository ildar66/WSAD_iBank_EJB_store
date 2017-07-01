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
import com.overstar.ildar.ibank.model.Bank;


public class _BANKS_0005fRESULTS_jsp_6 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _BANKS_0005fRESULTS_jsp_6( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_BANKS_0005fRESULTS_jsp_6.dat");
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
            response.setContentType("text/html; charset=WINDOWS-1251");
            pageContext = _jspxFactory.getPageContext(this, request, response,
			"", true, 8192, true);

            application = pageContext.getServletContext();
            config = pageContext.getServletConfig();
            session = pageContext.getSession();
            out = pageContext.getOut();

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 5,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 5,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 45,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 45,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 46,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 46,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 46,131
                com.overstar.ildar.ibank.model.Bank BankBean = null;
                boolean _jspx_specialBankBean  = false;
                 synchronized (session) {
                    BankBean= (com.overstar.ildar.ibank.model.Bank)
                    pageContext.getAttribute("BankBean",PageContext.SESSION_SCOPE);
                    if ( BankBean == null ) {
                        _jspx_specialBankBean = true;
                        try {
                            BankBean = (com.overstar.ildar.ibank.model.Bank) Beans.instantiate(getClassLoader(), "com.overstar.ildar.ibank.model.Bank");
                        } catch (Exception exc) {
                             throw new ServletException (" Cannot create bean of class "+"com.overstar.ildar.ibank.model.Bank");
                        }
                        pageContext.setAttribute("BankBean", BankBean, PageContext.SESSION_SCOPE);
                    }
                    String doSetAttribute = getInitParameter("dosetattribute");
                    if ((doSetAttribute != null) && (doSetAttribute.equalsIgnoreCase("true"))){
                        session.setAttribute("BankBean", BankBean);
                    }
                 } 
                if(_jspx_specialBankBean == true) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 46,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 46,131
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 46,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 47,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 47,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 51,0
                
                //Execute Bean Methods 
                java.util.Vector banks = BankBean.getBanks(request.getParameter("BIC"), request.getParameter("bankname"));
                Bank curBank = null;
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 51,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 59,71
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 59,74-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 59,102
                out.print( request.getParameter("BIC"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 59,104-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 66,77
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 66,80-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 66,113
                out.print( request.getParameter("bankname"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 66,115-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 86,8
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 86,10-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 86,87
                 for (int i=0; i  <  banks.size(); i++){ curBank = (Bank)banks.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 86,89-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,40
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,43-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,77
                out.print( curBank.getBik().getIdAsString() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,79-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,80
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,83-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,106
                out.print( curBank.rtBank_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,108-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,109
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,112-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,135
                out.print( curBank.rtBill_corr() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,137-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,165
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,168-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,202
                out.print( curBank.getBik().getIdAsString() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 88,204-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 89,16
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 89,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 89,42
                out.print( curBank.rtBill_corr() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 89,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 90,16
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 90,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 90,42
                out.print( curBank.rtBank_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 90,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 91,16
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 91,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 91,37
                out.print( curBank.rtCity() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 91,39-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 92,16
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 92,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 92,41
                out.print( curBank.rtDelivery() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 92,43-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 94,8
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 94,10-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 94,13
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 94,15-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 99,29
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 99,32-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 99,44
                out.print(banks.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 99,46-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 103,0
                out.print(_jspx_html_data[17]);
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
