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


public class _BANKS_0005fLISTED_jsp_32 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end
    // end
        
        private String encode(HttpServletRequest request , String name) throws Exception {
          String clientEnc = request.getCharacterEncoding();
          if (clientEnc == null) {
            String requestEnc = "ISO-8859-5";
            clientEnc = "Cp1251";
            name = new String(name.getBytes(requestEnc), clientEnc);
          }
          return name;
        }
        
        private String checked(String name1, String name2) {
         if(name1.equals(name2))
          return (" CHECKED ");
         else
          return ("");  
        }
        
        private String isUp(String aSort, String name) {
         if(aSort.startsWith(name))
          { if(aSort.endsWith("desc")) 
             return (" <IMG width=8 height=7 hspace=3 src='/iBank/ibankjsp/images/down.gif' alt='по убыванию'> ");
            else
             return (" <IMG width=8 height=7 hspace=3 src='/iBank/ibankjsp/images/up.gif' alt='по возрастанию'> "); 
          }
         else return ("");      
        }
    // end

    static {
    }
    public _BANKS_0005fLISTED_jsp_32( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_BANKS_0005fLISTED_jsp_32.dat");
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
            response.setContentType("text/html; charset=windows-1251");
            pageContext = _jspxFactory.getPageContext(this, request, response,
			"", true, 8192, true);

            application = pageContext.getServletContext();
            config = pageContext.getServletConfig();
            session = pageContext.getSession();
            out = pageContext.getOut();

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 9,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 9,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 25,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 25,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,134
                com.overstar.ildar.ibank.model.IBank userIBank = null;
                boolean _jspx_specialuserIBank  = false;
                 synchronized (session) {
                    userIBank= (com.overstar.ildar.ibank.model.IBank)
                    pageContext.getAttribute("userIBank",PageContext.SESSION_SCOPE);
                    if ( userIBank == null ) {
                        _jspx_specialuserIBank = true;
                        try {
                            userIBank = (com.overstar.ildar.ibank.model.IBank) Beans.instantiate(getClassLoader(), "com.overstar.ildar.ibank.model.IBank");
                        } catch (Exception exc) {
                             throw new ServletException (" Cannot create bean of class "+"com.overstar.ildar.ibank.model.IBank");
                        }
                        pageContext.setAttribute("userIBank", userIBank, PageContext.SESSION_SCOPE);
                    }
                    String doSetAttribute = getInitParameter("dosetattribute");
                    if ((doSetAttribute != null) && (doSetAttribute.equalsIgnoreCase("true"))){
                        session.setAttribute("userIBank", userIBank);
                    }
                 } 
                if(_jspx_specialuserIBank == true) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,131
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,131
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 28,0
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 55,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 56,0
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 56,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 71,0
                
                //Execute Bean Methods 
                String sort = request.getParameter("sort");
                String operation = request.getParameter("operation");
                String bic = request.getParameter("BIC");
                String bankname = request.getParameter("bankname");
                if(bic==null) {
                  bic = "";
                  bankname = "";
                  sort = "bik";
                  operation = "and";
                }
                bankname = encode(request, bankname);
                java.util.Vector banks = BankBean.getBanks(bic, bankname , sort, operation);
                Bank curBank = null;
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 71,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 77,64
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 77,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 77,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 77,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 128,79
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 128,82-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 128,85
                out.print(bic);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 128,87-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 129,100
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 129,103-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 129,127
                out.print(checked(operation,"and"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 129,129-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 134,85
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 134,88-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 134,96
                out.print(bankname);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 134,98-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 135,100
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 135,103-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 135,126
                out.print(checked(operation,"or"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 135,128-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 140,52
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 140,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 140,59
                out.print(sort);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 140,61-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 141,57
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 141,60-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 141,69
                out.print(operation);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 141,71-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 150,136
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 150,139-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 150,156
                out.print(isUp(sort, "bik"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 150,158-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 151,136
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 151,139-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 151,162
                out.print(isUp(sort, "bill_corr"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 151,164-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 152,136
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 152,139-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 152,162
                out.print(isUp(sort, "bank_name"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 152,164-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 153,136
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 153,139-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 153,157
                out.print(isUp(sort, "city"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 153,159-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 154,136
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 154,139-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 154,161
                out.print(isUp(sort, "delivery"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 154,163-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 156,20
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 156,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 156,99
                 for (int i=0; i  <  banks.size(); i++){ curBank = (Bank)banks.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 156,101-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 158,28
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 158,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 158,65
                out.print( curBank.getBik().getIdAsString() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 158,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 159,28
                out.print(_jspx_html_data[20]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 159,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 159,54
                out.print( curBank.rtBill_corr() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 159,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 160,28
                out.print(_jspx_html_data[21]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 160,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 160,54
                out.print( curBank.rtBank_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 160,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 161,28
                out.print(_jspx_html_data[22]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 161,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 161,49
                out.print( curBank.rtCity() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 161,51-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 162,28
                out.print(_jspx_html_data[23]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 162,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 162,53
                out.print( curBank.rtDelivery() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 162,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 164,20
                out.print(_jspx_html_data[24]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 164,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 164,25
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 164,27-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 167,41
                out.print(_jspx_html_data[25]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 167,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 167,56
                out.print(banks.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 167,58-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 175,0
                out.print(_jspx_html_data[26]);
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
