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
import com.overstar.ildar.ibank.model.documents.*;


public class _DOCUMENTS_jsp_133 extends HttpJspBase {

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
        
        private String selected(String name1, String name2) {
        if(name1.equals(name2))
          return (" SELECTED ");
        else
          return ("");  
        }
    // end

    static {
    }
    public _DOCUMENTS_jsp_133( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_DOCUMENTS_jsp_133.dat");
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 25,63-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 26,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 26,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 26,134
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 26,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 26,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 26,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 27,0
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 51,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 52,0
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 52,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 98,0
                
                //Execute Bean Methods 
                java.util.Vector documents = userIBank.getCurrentIClient().getDocumentsAll();
                Document curDocument = null;
                //определение типа, статусов, сортировки документа:
                String doc_type = String.valueOf( userIBank.getDocTransMgr().getDoc_type() ) ;
                java.util.List statuses = java.util.Arrays.asList(userIBank.getDocTransMgr().getStatuses());
                String sortBy = userIBank.getDocTransMgr().getSortBy();
                //установка дат("от" и "до"):
                java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
                String fromDateStr = userIBank.getDocTransMgr().getFromDate();
                java.util.Date fromDate = formatter.parse(fromDateStr);
                java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
                calendar.setTime(fromDate);
                String fromDateDD = String.valueOf(calendar.get(java.util.Calendar.DATE));
                String fromDateMM = String.valueOf( (calendar.get(java.util.Calendar.MONTH)+1) );
                String fromDateYY = String.valueOf(calendar.get(java.util.Calendar.YEAR));
                String toDateStr = userIBank.getDocTransMgr().getToDate();
                java.util.Date toDate = formatter.parse(toDateStr);
                calendar.setTime(toDate);
                String toDateDD = String.valueOf(calendar.get(java.util.Calendar.DATE));
                String toDateMM = String.valueOf( (calendar.get(java.util.Calendar.MONTH)+1) );
                String toDateYY = String.valueOf(calendar.get(java.util.Calendar.YEAR));
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 98,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 103,64
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 103,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 103,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 103,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 235,52
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 235,55-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 235,61
                out.print(sortBy);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 235,63-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 236,56
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 236,59-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 236,67
                out.print(doc_type);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 236,69-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 245,46
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 245,49-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 245,72
                out.print(selected(doc_type, "1"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 245,74-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 246,46
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 246,49-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 246,72
                out.print(selected(doc_type, "7"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 246,74-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,46
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,49-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,72
                out.print(selected(doc_type, "8"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 247,74-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 248,46
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 248,49-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 248,72
                out.print(selected(doc_type, "9"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 248,74-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 249,46
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 249,49-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 249,72
                out.print(selected(doc_type,"10"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 249,74-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 256,75
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 256,78-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 256,89
                out.print(fromDateStr);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 256,91-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 257,117
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 257,120-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 257,130
                out.print(fromDateDD);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 257,132-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 258,117
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 258,120-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 258,130
                out.print(fromDateMM);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 258,132-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 259,117
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 259,120-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 259,130
                out.print(fromDateYY);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 259,132-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 260,75
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 260,78-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 260,87
                out.print(toDateStr);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 260,89-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 261,117
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 261,120-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 261,128
                out.print(toDateDD);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 261,130-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 262,117
                out.print(_jspx_html_data[20]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 262,120-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 262,128
                out.print(toDateMM);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 262,130-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 263,117
                out.print(_jspx_html_data[21]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 263,120-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 263,128
                out.print(toDateYY);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 263,130-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 266,42
                out.print(_jspx_html_data[22]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 266,45-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 266,52
                out.print(period1);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 266,54-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 267,42
                out.print(_jspx_html_data[23]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 267,45-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 267,52
                out.print(period2);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 267,54-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 268,42
                out.print(_jspx_html_data[24]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 268,45-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 268,52
                out.print(period3);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 268,54-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 269,42
                out.print(_jspx_html_data[25]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 269,45-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 269,52
                out.print(period4);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 269,54-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 275,128
                out.print(_jspx_html_data[26]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 275,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 275,152
                out.print(checked(statuses,"0"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 275,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 276,128
                out.print(_jspx_html_data[27]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 276,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 276,152
                out.print(checked(statuses,"1"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 276,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 277,128
                out.print(_jspx_html_data[28]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 277,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 277,152
                out.print(checked(statuses,"2"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 277,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 278,128
                out.print(_jspx_html_data[29]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 278,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 278,152
                out.print(checked(statuses,"3"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 278,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 279,128
                out.print(_jspx_html_data[30]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 279,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 279,152
                out.print(checked(statuses,"4"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 279,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 280,128
                out.print(_jspx_html_data[31]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 280,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 280,152
                out.print(checked(statuses,"5"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 280,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 281,128
                out.print(_jspx_html_data[32]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 281,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 281,152
                out.print(checked(statuses,"6"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 281,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 282,128
                out.print(_jspx_html_data[33]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 282,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 282,152
                out.print(checked(statuses,"7"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 282,154-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 291,138
                out.print(_jspx_html_data[34]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 291,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 291,167
                out.print(isUp(sortBy, "status_doc"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 291,169-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 292,138
                out.print(_jspx_html_data[35]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 292,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 292,166
                out.print(isUp(sortBy, "type_oper"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 292,168-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 293,138
                out.print(_jspx_html_data[36]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 293,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 293,165
                out.print(isUp(sortBy, "date_doc"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 293,167-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 294,138
                out.print(_jspx_html_data[37]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 294,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 294,164
                out.print(isUp(sortBy, "num_doc"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 294,166-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 295,138
                out.print(_jspx_html_data[38]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 295,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 295,166
                out.print(isUp(sortBy, "rcpt_name"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 295,168-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 296,138
                out.print(_jspx_html_data[39]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 296,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 296,163
                out.print(isUp(sortBy, "amount"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 296,165-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 299,21
                out.print(_jspx_html_data[40]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 299,23-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 300,116
                if(documents.size() > 0) {
                                        for (int i=0; i  <  documents.size(); i++){ curDocument = (Document)documents.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 300,118-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 303,84
                out.print(_jspx_html_data[41]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 303,87-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 303,126
                out.print(curDocument.getDoc_id().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 303,128-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 303,130
                out.print(_jspx_html_data[42]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 303,133-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 303,160
                out.print( curDocument.rtStatus_doc());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 303,162-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 304,80
                out.print(_jspx_html_data[43]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 304,83-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 304,122
                out.print(curDocument.getDoc_id().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 304,124-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 304,128
                out.print(_jspx_html_data[44]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 304,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 304,153
                out.print( curDocument.getType());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 304,155-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 305,38
                out.print(_jspx_html_data[45]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 305,41-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 305,67
                out.print( curDocument.rtDate_doc() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 305,69-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 306,109
                out.print(_jspx_html_data[46]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 306,112-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 306,151
                out.print(curDocument.getDoc_id().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 306,153-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 306,157
                out.print(_jspx_html_data[47]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 306,160-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 306,185
                out.print( curDocument.rtNum_doc() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 306,187-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 307,25
                out.print(_jspx_html_data[48]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 307,27-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 307,64
                if(curDocument instanceof Payment) { 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 307,66-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 308,31
                out.print(_jspx_html_data[49]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 308,34-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 308,81
                out.print( ((Payment)curDocument).rtRecipient().rtName() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 308,83-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 309,43
                out.print(_jspx_html_data[50]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 309,46-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 309,81
                out.print( ((Payment)curDocument).rtAmount() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 309,83-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 310,25
                out.print(_jspx_html_data[51]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 310,27-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 310,74
                } else if (curDocument instanceof Accreditive){
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 310,76-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 311,31
                out.print(_jspx_html_data[52]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 311,34-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 311,85
                out.print( ((Accreditive)curDocument).rtRecipient().rtName() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 311,87-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 312,43
                out.print(_jspx_html_data[53]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 312,46-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 312,85
                out.print( ((Accreditive)curDocument).rtAmount() );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 312,87-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 313,25
                out.print(_jspx_html_data[54]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 313,27-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 313,28
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 313,30-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 315,22
                out.print(_jspx_html_data[55]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 315,24-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 316,30
                }
                                     } else { 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 316,32-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 320,19
                out.print(_jspx_html_data[56]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 320,21-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 320,23
                } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 320,25-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 327,47
                out.print(_jspx_html_data[57]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 327,50-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 327,66
                out.print(documents.size());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 327,68-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS.jsp" 350,0
                out.print(_jspx_html_data[58]);
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
