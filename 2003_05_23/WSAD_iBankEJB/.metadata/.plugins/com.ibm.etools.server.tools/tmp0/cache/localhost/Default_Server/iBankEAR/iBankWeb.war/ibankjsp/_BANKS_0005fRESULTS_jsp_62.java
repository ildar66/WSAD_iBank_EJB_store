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


public class _BANKS_0005fRESULTS_jsp_62 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _BANKS_0005fRESULTS_jsp_62( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_BANKS_0005fRESULTS_jsp_62.dat");
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 5,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 59,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 59,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 60,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 60,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 60,131
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 60,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 60,131
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 60,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 61,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 61,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 71,0
                
                //Execute Bean Methods 
                String sort = request.getParameter("sort");
                String operation = request.getParameter("operation");
                String bic = request.getParameter("BIC");
                String bankname = request.getParameter("bankname");
                java.util.Vector banks = BankBean.getBanks(bic, bankname, sort, operation);
                Bank curBank = null;
                String fieldnames = request.getParameter("fieldnames");//"BIC|bankname|bankacc"
                String formname = request.getParameter("formname");
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 71,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 79,71
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 79,74-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 79,78
                out.print( bic);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 79,80-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 80,63
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 80,65-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 80,94
                if(operation.equals("and")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 80,96-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 80,104
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 80,106-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 80,107
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 80,109-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 86,77
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 86,80-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 86,90
                out.print( bankname );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 86,92-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 87,65
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 87,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 87,95
                if(operation.equals("or")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 87,97-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 87,105
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 87,107-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 87,108
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 87,110-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 92,47
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 92,50-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 92,60
                out.print(fieldnames);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 92,62-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 93,45
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 93,48-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 93,56
                out.print(formname);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 93,58-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 94,41
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 94,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 94,48
                out.print(sort);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 94,50-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 95,46
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 95,49-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 95,58
                out.print(operation);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 95,60-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 104,125
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 104,127-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 104,183
                if(sort.startsWith("bik")) { if(sort.endsWith("desc")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 104,185-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 104,272
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 104,274-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 104,280
                }else{
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 104,282-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 104,370
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 104,372-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 104,374
                }}
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 104,376-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 105,125
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 105,127-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 105,189
                if(sort.startsWith("bill_corr")) { if(sort.endsWith("desc")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 105,191-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 105,278
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 105,280-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 105,286
                }else{
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 105,288-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 105,376
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 105,378-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 105,380
                }}
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 105,382-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 106,125
                out.print(_jspx_html_data[20]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 106,127-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 106,189
                if(sort.startsWith("bank_name")) { if(sort.endsWith("desc")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 106,191-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 106,278
                out.print(_jspx_html_data[21]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 106,280-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 106,286
                }else{
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 106,288-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 106,376
                out.print(_jspx_html_data[22]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 106,378-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 106,380
                }}
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 106,382-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 107,125
                out.print(_jspx_html_data[23]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 107,127-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 107,184
                if(sort.startsWith("city")) { if(sort.endsWith("desc")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 107,186-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 107,273
                out.print(_jspx_html_data[24]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 107,275-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 107,281
                }else{
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 107,283-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 107,371
                out.print(_jspx_html_data[25]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 107,373-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 107,375
                }}
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 107,377-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,125
                out.print(_jspx_html_data[26]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,127-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,188
                if(sort.startsWith("delivery")) { if(sort.endsWith("desc")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,190-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,277
                out.print(_jspx_html_data[27]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,279-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,285
                }else{
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,287-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,375
                out.print(_jspx_html_data[28]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,377-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,379
                }}
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 108,381-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 110,8
                out.print(_jspx_html_data[29]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 110,10-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 111,88
                 if(banks.size() > 0) {
                            for (int i=0; i  <  banks.size(); i++){ curBank = (Bank)banks.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 111,90-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,42
                out.print(_jspx_html_data[30]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,45-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,79
                out.print( curBank.getBik().getIdAsString() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,81-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,82
                out.print(_jspx_html_data[31]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,85-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,108
                out.print( curBank.rtBank_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,110-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,111
                out.print(_jspx_html_data[32]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,114-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,137
                out.print( curBank.rtBill_corr() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,139-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,140
                out.print(_jspx_html_data[33]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,143-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,165
                out.print( curBank.rtDelivery() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,167-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,195
                out.print(_jspx_html_data[34]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,198-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,232
                out.print( curBank.getBik().getIdAsString() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 113,234-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 114,18
                out.print(_jspx_html_data[35]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 114,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 114,44
                out.print( curBank.rtBill_corr() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 114,46-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 115,18
                out.print(_jspx_html_data[36]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 115,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 115,44
                out.print( curBank.rtBank_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 115,46-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 116,18
                out.print(_jspx_html_data[37]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 116,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 116,39
                out.print( curBank.rtCity() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 116,41-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 117,18
                out.print(_jspx_html_data[38]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 117,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 117,43
                out.print( curBank.rtDelivery() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 117,45-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 119,8
                out.print(_jspx_html_data[39]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 119,10-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 120,17
                 }
                        } else { 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 120,19-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 122,8
                out.print(_jspx_html_data[40]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 122,10-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 122,13
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 122,15-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 127,29
                out.print(_jspx_html_data[41]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 127,32-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 127,44
                out.print(banks.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 127,46-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_RESULTS.jsp" 131,0
                out.print(_jspx_html_data[42]);
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
