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


public class _RECIPIENTS_0005fRESULTS_jsp_42 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _RECIPIENTS_0005fRESULTS_jsp_42( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_RECIPIENTS_0005fRESULTS_jsp_42.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 5,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 5,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 46,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 46,53-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 47,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 47,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 47,131
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 47,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 47,131
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 47,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 48,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 48,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 68,0
                
                //Execute Bean Methods 
                String sort = request.getParameter("sort");
                String operation = request.getParameter("operation");
                String fieldnames = request.getParameter("fieldnames"); //"receiver|receiverinn|receiveracc|receiverbic|receiverbank|receivercoracc"
                String formname = request.getParameter("formname"); 
                    
                String currentIClientID = request.getParameter("currentIClientID");
                IClient currentIClient = (IClient)session.getAttribute("currentIClient");
                if(currentIClient == null) {
                  currentIClient = IClient.findWithIClientPK(currentIClientID);
                  session.setAttribute("currentIClient", currentIClient);
                } 
                
                String name = request.getParameter("NAME"); 
                String inn = request.getParameter("INN");
                String bill = request.getParameter("BILL");
                String bic = request.getParameter("BIC"); 
                java.util.Vector recipients = currentIClient.getRecipients(name, inn, bill, bic, operation, sort);
                Recipient curRecipient = null;
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 68,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 77,104
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 77,107-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 77,111
                out.print(name);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 77,113-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 78,63
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 78,65-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 78,94
                if(operation.equals("and")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 78,96-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 78,104
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 78,106-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 78,107
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 78,109-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 83,92
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 83,95-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 83,98
                out.print(inn);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 83,100-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 87,106
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 87,109-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 87,113
                out.print(bill);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 87,115-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 88,65
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 88,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 88,95
                if(operation.equals("or")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 88,97-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 88,105
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 88,107-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 88,108
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 88,110-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 92,91
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 92,94-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 92,97
                out.print(bic);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 92,99-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 97,46
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 97,49-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 97,59
                out.print(fieldnames);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 97,61-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 98,44
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 98,47-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 98,55
                out.print(formname);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 98,57-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 99,40
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 99,43-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 99,47
                out.print(sort);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 99,49-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 100,45
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 100,48-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 100,57
                out.print(operation);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 100,59-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 101,52
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 101,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 101,71
                out.print(currentIClientID);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 101,73-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 118,4
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 118,6-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 118,156
                 for (int i=0; i  <  recipients.size(); i++){ curRecipient = (Recipient)recipients.elementAt(i); BankBean = Bank.findWithBankPK(curRecipient.rtBic());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 118,158-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,36
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,39-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,60
                out.print(curRecipient.rtName());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,62-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,63
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,66-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,86
                out.print(curRecipient.rtInn());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,88-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,89
                out.print(_jspx_html_data[20]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,92-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,113
                out.print(curRecipient.rtBill());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,115-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,116
                out.print(_jspx_html_data[21]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,119-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,139
                out.print(curRecipient.rtBic());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,142
                out.print(_jspx_html_data[22]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,145-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,167
                out.print(BankBean.rtBank_name());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,169-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,170
                out.print(_jspx_html_data[23]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,173-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,195
                out.print(BankBean.rtBill_corr());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,197-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,225
                out.print(_jspx_html_data[24]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,228-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,251
                out.print( curRecipient.rtName() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 120,253-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 121,12
                out.print(_jspx_html_data[25]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 121,15-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 121,37
                out.print( curRecipient.rtInn() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 121,39-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 122,12
                out.print(_jspx_html_data[26]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 122,15-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 122,38
                out.print( curRecipient.rtBill() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 122,40-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 123,12
                out.print(_jspx_html_data[27]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 123,15-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 123,37
                out.print( curRecipient.rtBic() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 123,39-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 125,4
                out.print(_jspx_html_data[28]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 125,6-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 125,9
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 125,11-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 128,29
                out.print(_jspx_html_data[29]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 128,32-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 128,49
                out.print(recipients.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 128,51-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\RECIPIENTS_RESULTS.jsp" 132,0
                out.print(_jspx_html_data[30]);
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
