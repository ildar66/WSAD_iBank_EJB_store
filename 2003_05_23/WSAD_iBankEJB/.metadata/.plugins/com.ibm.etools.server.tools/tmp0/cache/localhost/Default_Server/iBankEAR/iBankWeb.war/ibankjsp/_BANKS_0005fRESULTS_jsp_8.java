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


public class _BANKS_0005fRESULTS_jsp_8 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _BANKS_0005fRESULTS_jsp_8( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_BANKS_0005fRESULTS_jsp_8.dat");
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
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 47,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 55,0
                
                //Execute Bean Methods 
                String sort = request.getParameter("sort");
                String operation = request.getParameter("operation");
                String bic = request.getParameter("BIC");
                String bankname = request.getParameter("bankname");
                java.util.Vector banks = BankBean.getBanks(bic, bankname, sort, operation);
                Bank curBank = null;
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 55,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 63,71
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 63,74-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 63,78
                out.print( bic);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 63,80-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 64,63
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 64,65-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 64,94
                if(operation.equals("and")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 64,96-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 64,104
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 64,106-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 64,107
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 64,109-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 70,77
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 70,80-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 70,90
                out.print( bankname );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 70,92-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 71,65
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 71,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 71,95
                if(operation.equals("or")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 71,97-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 71,105
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 71,107-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 71,108
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 71,110-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 79,41
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 79,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 79,48
                out.print(sort);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 79,50-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 80,46
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 80,49-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 80,58
                out.print(operation);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 80,60-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 95,8
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 95,10-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 95,87
                 for (int i=0; i  <  banks.size(); i++){ curBank = (Bank)banks.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 95,89-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,40
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,43-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,77
                out.print( curBank.getBik().getIdAsString() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,79-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,80
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,83-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,106
                out.print( curBank.rtBank_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,108-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,109
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,112-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,135
                out.print( curBank.rtBill_corr() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,137-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,165
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,168-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,202
                out.print( curBank.getBik().getIdAsString() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 97,204-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 98,16
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 98,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 98,42
                out.print( curBank.rtBill_corr() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 98,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 99,16
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 99,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 99,42
                out.print( curBank.rtBank_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 99,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 100,16
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 100,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 100,37
                out.print( curBank.rtCity() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 100,39-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 101,16
                out.print(_jspx_html_data[20]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 101,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 101,41
                out.print( curBank.rtDelivery() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 101,43-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 103,8
                out.print(_jspx_html_data[21]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 103,10-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 103,13
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 103,15-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,29
                out.print(_jspx_html_data[22]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,32-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,44
                out.print(banks.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,46-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 112,0
                out.print(_jspx_html_data[23]);
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
