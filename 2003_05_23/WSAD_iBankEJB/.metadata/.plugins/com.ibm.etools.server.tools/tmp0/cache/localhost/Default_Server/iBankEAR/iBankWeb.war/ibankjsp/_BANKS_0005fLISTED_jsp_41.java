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
import com.overstar.ildar.ibank.model.references.*;
import com.overstar.ildar.ibank.servlets.util.*;


public class _BANKS_0005fLISTED_jsp_41 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _BANKS_0005fLISTED_jsp_41( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_BANKS_0005fLISTED_jsp_41.dat");
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 25,64-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 26,61-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,134
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 27,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 29,0
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 29,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 53,0
                
                //Execute Bean Methods 
                String sort = request.getParameter("sort");
                String operation = request.getParameter("operation");
                String bic = request.getParameter("BIC");
                String bankname = request.getParameter("bankname");
                int pagenumber = 1;
                String pagenumberStr = request.getParameter("pagenumber");
                if(pagenumberStr != null)
                  pagenumber = Integer.parseInt(pagenumberStr);
                if(bic==null) {
                  bic = "";
                  bankname = "";
                  sort = "bik";
                  operation = "and";
                }
                bankname = ServletUtilities.encode(request, bankname);
                java.util.Vector banks = BankTransactionMgr.getBanks(bic, bankname , sort, operation);
                int bankssize = banks.size();
                int pagesize = 20;
                int pagecount = ( (bankssize%pagesize == 0) ? bankssize/pagesize : (bankssize/pagesize + 1) ); 
                pagenumber = Math.max(1, Math.min(pagenumber, pagecount));
                
                Bank curBank = null;
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 53,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 59,64
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 59,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 59,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 59,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 112,79
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 112,82-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 112,85
                out.print(bic);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 112,87-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 113,100
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 113,103-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 113,144
                out.print(ServletUtilities.checked(operation,"and"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 113,146-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 118,85
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 118,88-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 118,96
                out.print(bankname);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 118,98-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,101
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,104-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,144
                out.print(ServletUtilities.checked(operation,"or"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 119,146-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 124,52
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 124,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 124,59
                out.print(sort);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 124,61-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 125,57
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 125,60-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 125,69
                out.print(operation);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 125,71-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 126,58
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 126,61-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 126,71
                out.print(pagenumber);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 126,73-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 135,136
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 135,139-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 135,173
                out.print(ServletUtilities.isUp(sort, "bik"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 135,175-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 136,136
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 136,139-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 136,179
                out.print(ServletUtilities.isUp(sort, "bill_corr"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 136,181-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 137,136
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 137,139-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 137,179
                out.print(ServletUtilities.isUp(sort, "bank_name"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 137,181-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 138,136
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 138,139-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 138,174
                out.print(ServletUtilities.isUp(sort, "city"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 138,176-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 139,136
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 139,139-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 139,178
                out.print(ServletUtilities.isUp(sort, "delivery"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 139,180-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 141,20
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 141,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 144,96
                 if(banks.size() > 0) {
                                         int start = (pagenumber-1)*20;
                                         int end = Math.min(pagenumber*20, bankssize); 
                                         for (int i=start; i  <  end; i++){ curBank = (Bank)banks.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 144,98-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 146,33
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 146,36-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 146,70
                out.print( curBank.getBik().getIdAsString() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 146,72-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 147,33
                out.print(_jspx_html_data[20]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 147,36-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 147,59
                out.print( curBank.rtBill_corr() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 147,61-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 148,33
                out.print(_jspx_html_data[21]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 148,36-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 148,59
                out.print( curBank.rtBank_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 148,61-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 149,33
                out.print(_jspx_html_data[22]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 149,36-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 149,54
                out.print( curBank.rtCity() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 149,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 150,33
                out.print(_jspx_html_data[23]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 150,36-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 150,58
                out.print( curBank.rtDelivery() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 150,60-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 152,22
                out.print(_jspx_html_data[24]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 152,24-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 153,32
                 }
                                       } else { 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 153,34-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 155,20
                out.print(_jspx_html_data[25]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 155,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 155,25
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 155,27-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 158,11
                out.print(_jspx_html_data[26]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 158,13-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 158,34
                 if(pagecount > 0) { 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 158,36-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 164,69
                out.print(_jspx_html_data[27]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 164,72-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 164,86
                out.print((pagenumber-1));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 164,88-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 165,69
                out.print(_jspx_html_data[28]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 165,72-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 165,86
                out.print((pagenumber+1));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 165,88-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 166,72
                out.print(_jspx_html_data[29]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 166,75-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 166,84
                out.print(pagecount);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 166,86-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 168,41
                out.print(_jspx_html_data[30]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 168,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 168,54
                out.print(pagenumber);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 168,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 168,60
                out.print(_jspx_html_data[31]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 168,63-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 168,72
                out.print(pagecount);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 168,74-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 172,10
                out.print(_jspx_html_data[32]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 172,12-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 172,13
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 172,15-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 173,41
                out.print(_jspx_html_data[33]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 173,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 173,56
                out.print(banks.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 173,58-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\BANKS_LISTED.jsp" 181,0
                out.print(_jspx_html_data[34]);
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
