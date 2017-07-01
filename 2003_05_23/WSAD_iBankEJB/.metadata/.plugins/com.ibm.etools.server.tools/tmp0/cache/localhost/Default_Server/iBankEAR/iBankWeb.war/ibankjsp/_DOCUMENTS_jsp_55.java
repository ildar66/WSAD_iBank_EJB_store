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


public class _DOCUMENTS_jsp_55 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _DOCUMENTS_jsp_55( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_DOCUMENTS_jsp_55.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 6,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 6,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 24,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 24,53-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 25,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 25,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 25,134
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 25,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 25,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 25,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 26,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 26,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 42,0
                
                //Execute Bean Methods 
                //response.setContentType("text/html; charset=windows-1251");
                java.util.Vector documents = userIBank.getCurrentIClient().getDocumentsAll();
                Document curDocument = null;
                java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
                String fromDateStr = userIBank.getFromDate();
                java.util.Date fromDate = formatter.parse(fromDateStr);
                String fromDateDD = String.valueOf(fromDate.getDate());
                String fromDateMM = String.valueOf(fromDate.getMonth()+1);
                String fromDateYY = String.valueOf(fromDate.getYear()+1900);
                String toDateStr = userIBank.getToDate();
                java.util.Date toDate = formatter.parse(toDateStr);
                String toDateDD = String.valueOf(toDate.getDate());
                String toDateMM = String.valueOf(toDate.getMonth()+1);
                String toDateYY = String.valueOf(toDate.getYear()+1900);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 42,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 48,64
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 48,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 48,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 48,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 176,243
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 176,246-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 176,274
                out.print(request.getParameter("sort"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 176,276-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 195,75
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 195,78-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 195,89
                out.print(fromDateStr);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 195,91-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 196,116
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 196,119-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 196,129
                out.print(fromDateDD);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 196,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 197,117
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 197,120-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 197,130
                out.print(fromDateMM);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 197,132-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 198,115
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 198,118-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 198,128
                out.print(fromDateYY);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 198,130-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 199,74
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 199,77-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 199,86
                out.print(toDateStr);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 199,88-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 200,115
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 200,118-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 200,126
                out.print(toDateDD);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 200,128-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 201,116
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 201,119-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 201,127
                out.print(toDateMM);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 201,129-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 202,114
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 202,117-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 202,125
                out.print(toDateYY);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 202,127-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 245,20
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 245,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 245,114
                 for (int i=0; i  <  documents.size(); i++){ curDocument = (Payment)documents.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 245,116-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,126
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,129-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,168
                out.print(curDocument.getDoc_id().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,170-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,180
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,183-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,222
                out.print(curDocument.getDoc_id().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,224-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,268
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,271-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,310
                out.print(curDocument.getDoc_id().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,312-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,316
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,319-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,347
                out.print( curDocument.rtStatus_doc() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,349-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 248,28
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 248,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 248,57
                out.print( curDocument.rtDoc_type() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 248,59-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 249,28
                out.print(_jspx_html_data[20]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 249,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 249,57
                out.print( curDocument.rtDate_doc() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 249,59-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 250,28
                out.print(_jspx_html_data[21]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 250,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 250,56
                out.print( curDocument.rtNum_doc() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 250,58-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 251,28
                out.print(_jspx_html_data[22]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 251,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 251,69
                out.print( ((Payment)curDocument).rtRcpt_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 251,71-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 252,28
                out.print(_jspx_html_data[23]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 252,31-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 252,72
                out.print( ((Payment)curDocument).rtRcpt_account() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 252,74-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 254,20
                out.print(_jspx_html_data[24]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 254,22-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 254,25
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 254,27-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 262,46
                out.print(_jspx_html_data[25]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 262,49-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 262,65
                out.print(documents.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 262,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 278,0
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
