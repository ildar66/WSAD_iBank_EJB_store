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


public class _DOCUMENTS_jsp_103 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end
        
        private String isUp(String aSort, String name) {
         if(aSort.startsWith(name))
          { if(aSort.endsWith("desc")) 
             return (" <IMG width=8 height=7 hspace=3 src='/iBank/ibankjsp/images/down.gif' alt='по убыванию'> ");
            else
             return (" <IMG width=8 height=7 hspace=3 src='/iBank/ibankjsp/images/up.gif' alt='по возрастанию'> "); 
          }
         else return ("");      
        }
        
        private String checked(java.util.List aStatuses, String name) {
        if(aStatuses.contains(name))
          return (" CHECKED ");
        else
          return ("");  
        }
    // end

    static {
    }
    public _DOCUMENTS_jsp_103( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_DOCUMENTS_jsp_103.dat");
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 43,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 44,0
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 44,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 87,0
                
                //Execute Bean Methods 
                java.util.Vector documents = userIBank.getCurrentIClient().getDocumentsAll();
                Document curDocument = null;
                java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
                String fromDateStr = userIBank.getFromDate();
                java.util.Date fromDate = formatter.parse(fromDateStr);
                java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
                calendar.setTime(fromDate);
                String fromDateDD = String.valueOf(calendar.get(java.util.Calendar.DATE));
                String fromDateMM = String.valueOf( (calendar.get(java.util.Calendar.MONTH)+1) );
                String fromDateYY = String.valueOf(calendar.get(java.util.Calendar.YEAR));
                String toDateStr = userIBank.getToDate();
                java.util.Date toDate = formatter.parse(toDateStr);
                calendar.setTime(toDate);
                String toDateDD = String.valueOf(calendar.get(java.util.Calendar.DATE));
                String toDateMM = String.valueOf( (calendar.get(java.util.Calendar.MONTH)+1) );
                String toDateYY = String.valueOf(calendar.get(java.util.Calendar.YEAR));
                java.util.List statuses = java.util.Arrays.asList(userIBank.getStatuses());
                String sortBy = userIBank.getSortBy();
                //Определение периодов дат:
                calendar = new java.util.GregorianCalendar();
                String todayStr=formatter.format(calendar.getTime());
                String period1 = todayStr+","+todayStr;
                int dayOfWeek = calendar.get(java.util.Calendar.DAY_OF_WEEK);
                calendar.add( java.util.Calendar.DATE, -(dayOfWeek-calendar.getFirstDayOfWeek()) );
                String firstDayOfWeekStr=formatter.format(calendar.getTime());
                String period2 = firstDayOfWeekStr+","+todayStr;
                calendar = new java.util.GregorianCalendar();
                calendar.set(java.util.Calendar.DATE, 1);
                String firstDayOfMonth=formatter.format(calendar.getTime());
                String period3 = firstDayOfMonth+","+todayStr;
                int month = calendar.get(java.util.Calendar.MONTH)+1;
                if(month<4)
                  calendar.set(java.util.Calendar.MONTH , 0);
                if( (month>=4)&&(month<=6))
                  calendar.set(java.util.Calendar.MONTH , 3);
                if( (month>=7)&&(month<=9))
                  calendar.set(java.util.Calendar.MONTH , 6);
                  if(month>9)
                  calendar.set(java.util.Calendar.MONTH , 9);
                String firstDayOfQuarter=formatter.format(calendar.getTime()); 
                String period4 = firstDayOfQuarter+","+todayStr;     
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 87,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 92,64
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 92,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 92,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 92,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 289,52
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 289,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 289,61
                out.print(sortBy);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 289,63-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 309,75
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 309,78-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 309,89
                out.print(fromDateStr);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 309,91-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 310,116
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 310,119-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 310,129
                out.print(fromDateDD);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 310,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 311,117
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 311,120-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 311,130
                out.print(fromDateMM);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 311,132-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 312,115
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 312,118-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 312,128
                out.print(fromDateYY);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 312,130-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 313,74
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 313,77-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 313,86
                out.print(toDateStr);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 313,88-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 314,115
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 314,118-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 314,126
                out.print(toDateDD);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 314,128-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 315,116
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 315,119-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 315,127
                out.print(toDateMM);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 315,129-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 316,114
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 316,117-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 316,125
                out.print(toDateYY);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 316,127-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 319,42
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 319,45-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 319,52
                out.print(period1);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 319,54-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 320,42
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 320,45-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 320,52
                out.print(period2);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 320,54-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 321,42
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 321,45-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 321,52
                out.print(period3);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 321,54-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 322,42
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 322,45-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 322,52
                out.print(period4);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 322,54-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 328,128
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 328,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 328,152
                out.print(checked(statuses,"0"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 328,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 329,128
                out.print(_jspx_html_data[20]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 329,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 329,152
                out.print(checked(statuses,"1"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 329,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 330,128
                out.print(_jspx_html_data[21]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 330,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 330,152
                out.print(checked(statuses,"2"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 330,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 331,128
                out.print(_jspx_html_data[22]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 331,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 331,152
                out.print(checked(statuses,"3"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 331,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 332,128
                out.print(_jspx_html_data[23]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 332,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 332,152
                out.print(checked(statuses,"4"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 332,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 333,128
                out.print(_jspx_html_data[24]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 333,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 333,152
                out.print(checked(statuses,"5"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 333,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 334,128
                out.print(_jspx_html_data[25]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 334,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 334,152
                out.print(checked(statuses,"6"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 334,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 335,128
                out.print(_jspx_html_data[26]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 335,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 335,152
                out.print(checked(statuses,"7"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 335,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 344,138
                out.print(_jspx_html_data[27]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 344,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 344,167
                out.print(isUp(sortBy, "status_doc"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 344,169-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 345,138
                out.print(_jspx_html_data[28]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 345,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 345,166
                out.print(isUp(sortBy, "type_oper"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 345,168-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 346,138
                out.print(_jspx_html_data[29]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 346,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 346,165
                out.print(isUp(sortBy, "date_doc"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 346,167-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 347,138
                out.print(_jspx_html_data[30]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 347,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 347,164
                out.print(isUp(sortBy, "num_doc"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 347,166-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 348,138
                out.print(_jspx_html_data[31]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 348,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 348,166
                out.print(isUp(sortBy, "rcpt_name"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 348,168-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 349,138
                out.print(_jspx_html_data[32]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 349,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 349,163
                out.print(isUp(sortBy, "amount"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 349,165-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 351,21
                out.print(_jspx_html_data[33]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 351,23-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 352,115
                if(documents.size() > 0) {
                                        for (int i=0; i  <  documents.size(); i++){ curDocument = (Payment)documents.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 352,117-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 354,137
                out.print(_jspx_html_data[34]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 354,140-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 354,179
                out.print(curDocument.getDoc_id().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 354,181-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 354,191
                out.print(_jspx_html_data[35]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 354,194-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 354,233
                out.print(curDocument.getDoc_id().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 354,235-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 354,237
                out.print(_jspx_html_data[36]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 354,240-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 354,280
                out.print( Document.getStatus_docFull(curDocument));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 354,282-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 355,80
                out.print(_jspx_html_data[37]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 355,83-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 355,122
                out.print(curDocument.getDoc_id().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 355,124-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 356,38
                out.print(_jspx_html_data[38]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 356,41-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 356,67
                out.print( curDocument.rtDate_doc() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 356,69-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 357,109
                out.print(_jspx_html_data[39]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 357,112-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 357,151
                out.print(curDocument.getDoc_id().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 357,153-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 357,157
                out.print(_jspx_html_data[40]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 357,160-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 357,185
                out.print( curDocument.rtNum_doc() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 357,187-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 358,29
                out.print(_jspx_html_data[41]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 358,32-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 358,70
                out.print( ((Payment)curDocument).rtRcpt_name() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 358,72-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 359,41
                out.print(_jspx_html_data[42]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 359,44-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 359,79
                out.print( ((Payment)curDocument).rtAmount() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 359,81-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 361,22
                out.print(_jspx_html_data[43]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 361,24-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 362,30
                }
                                     } else { 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 362,32-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 366,19
                out.print(_jspx_html_data[44]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 366,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 366,23
                } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 366,25-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 372,46
                out.print(_jspx_html_data[45]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 372,49-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 372,65
                out.print(documents.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 372,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 395,0
                out.print(_jspx_html_data[46]);
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
