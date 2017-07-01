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
import com.overstar.ildar.ibank.model.accounts.*;
import java.util.*;


public class _PAYMENT_0005fCHOOSEN_jsp_3 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end
        
        private String selected(String name1, String name2) {
        if(name1.equals(name2))
          return (" SELECTED ");
        else
          return ("");  
        }
    // end

    static {
    }
    public _PAYMENT_0005fCHOOSEN_jsp_3( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_PAYMENT_0005fCHOOSEN_jsp_3.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 6,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 6,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 24,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 24,53-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 25,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 25,63-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 26,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 26,62-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 27,0
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 27,32-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 28,0
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 28,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 28,134
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 28,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 28,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 28,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 29,0
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 36,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 37,0
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 37,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 108,0
                
                //Execute Bean Methods 
                String operation = "Добавление"; 
                boolean isNew = true;
                String num_docStr = "";
                GregorianCalendar calendar = new GregorianCalendar();
                String date_docDD = String.valueOf(calendar.get(java.util.Calendar.DATE));
                String date_docMM = String.valueOf(calendar.get(java.util.Calendar.MONTH)+1);
                String date_docYY = String.valueOf(calendar.get(java.util.Calendar.YEAR));
                String date_docStr = date_docYY +"-"+ date_docMM +"-"+ date_docDD ;
                String payment_type = " ";
                String payer_inn = userIBank.getCurrentIClient().rtInn_cln();
                String payer_name = userIBank.getCurrentIClient().rtName_cln();
                String payer_account = "Тут должен быть счет";
                Money amount = new Money("0.00");
                String payer_bank_name = "IBank";
                String payer_bank_bic = "bic IBank";
                String payer_bank_acc = "счет IBank";
                String rcpt_bank_name = "";
                String rcpt_bank_bic = "";
                String rcpt_bank_acc = "";
                String rcpt_inn = "";
                String rcpt_name = "";
                String rcpt_account = "";
                String queue = "06";
                String termDD = date_docDD;//TEMP
                String termMM = date_docMM;//TEMP
                String termYY = date_docYY;//TEMP
                String termStr = termYY +"-"+ termMM +"-"+ termDD ;
                String payment_details = "";
                String status_doc = "новый";
                
                Vector bankAccounts = userIBank.getCurrentIClient().getBankAccountsAll();
                BankAccount curBankAccount = null;
                
                Payment curDocument = (Payment)userIBank.getCurrentDocument();
                if(curDocument != null) {
                  isNew = false;
                  operation = "Редактирование";
                  //BankBean = Bank.findWithBankPK(curRecipient.rtBic());
                  num_docStr = curDocument.rtNum_doc();
                  java.sql.Date date_doc = curDocument.rtDate_doc();
                  calendar.setTime(date_doc);
                  date_docDD = String.valueOf(calendar.get(java.util.Calendar.DATE));
                  date_docMM = String.valueOf(calendar.get(java.util.Calendar.MONTH)+1);
                  date_docYY = String.valueOf(calendar.get(java.util.Calendar.YEAR));
                  date_docStr = date_docYY +"-"+ date_docMM +"-"+ date_docDD ;
                  payment_type = curDocument.rtPayment_type();
                  payer_inn = curDocument.rtPayer().rtInn();
                  payer_name = curDocument.rtPayer().rtName();
                  payer_account = curDocument.rtPayer().rtBill();
                  amount = curDocument.rtAmount();
                  payer_bank_name = curDocument.rtPayer().rtBank_name();
                  payer_bank_bic = curDocument.rtPayer().rtBank_Bic();
                  payer_bank_acc = curDocument.rtPayer().rtBank_acc();
                  rcpt_bank_name = curDocument.rtRecipient().rtBank_name();
                  rcpt_bank_bic = curDocument.rtRecipient().rtBank_Bic();
                  rcpt_bank_acc = curDocument.rtRecipient().rtBank_acc();
                  rcpt_inn = curDocument.rtRecipient().rtInn();
                  rcpt_name = curDocument.rtRecipient().rtName();
                  rcpt_account = curDocument.rtRecipient().rtBill();
                  queue = curDocument.rtQueue();
                  java.sql.Date term = curDocument.rtTerm();
                  calendar.setTime(term);
                  termDD = String.valueOf(calendar.get(java.util.Calendar.DATE));
                  termMM = String.valueOf(calendar.get(java.util.Calendar.MONTH)+1);
                  termYY = String.valueOf(calendar.get(java.util.Calendar.YEAR));
                  termStr = termYY +"-"+ termMM +"-"+ termDD ;
                  payment_details = curDocument.rtPayment_details();
                  status_doc = curDocument.getType();
                }  
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 108,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 114,64
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 114,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 114,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 114,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 143,51
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 143,54-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 143,63
                out.print(operation);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 143,65-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 152,38
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 152,41-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 152,101
                out.print(userIBank.getCurrentIClient().getClient_id().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 152,103-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 154,37
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 154,40-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 154,52
                out.print(payment_type);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 154,54-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 167,143
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 167,146-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 167,156
                out.print(num_docStr);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 167,158-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,103
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,106-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,117
                out.print(date_docStr);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,119-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,211
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,214-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,224
                out.print(date_docDD);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,226-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,334
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,337-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,347
                out.print(date_docMM);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,349-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,443
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,446-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,456
                out.print(date_docYY);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 168,458-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 170,60
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 170,63-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 170,89
                out.print(selected(payment_type," "));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 170,91-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 171,60
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 171,63-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 171,98
                out.print(selected(payment_type,"электронно"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 171,100-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 172,60
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 172,63-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 172,98
                out.print(selected(payment_type,"телеграфом"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 172,100-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 173,60
                out.print(_jspx_html_data[20]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 173,63-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 173,94
                out.print(selected(payment_type,"почтой"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 173,96-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 185,133
                out.print(_jspx_html_data[21]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 185,136-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 185,145
                out.print(payer_inn);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 185,147-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 186,329
                out.print(_jspx_html_data[22]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 186,332-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 186,342
                out.print(payer_name);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 186,344-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 189,97
                out.print(_jspx_html_data[23]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 189,100-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 189,106
                out.print(amount);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 189,108-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 194,38
                out.print(_jspx_html_data[24]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 194,40-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 194,145
                 for (int i=0; i  <  bankAccounts.size(); i++){ curBankAccount = (BankAccount)bankAccounts.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 194,147-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 195,48
                out.print(_jspx_html_data[25]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 195,50-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 195,117
                if(payer_account.equals(curBankAccount.getId().getId2AsString())) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 195,119-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 195,127
                out.print(_jspx_html_data[26]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 195,129-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 195,130
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 195,132-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 195,133
                out.print(_jspx_html_data[27]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 195,136-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 195,175
                out.print(curBankAccount.getId().getId2AsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 195,177-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 196,38
                out.print(_jspx_html_data[28]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 196,40-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 196,43
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 196,45-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 210,155
                out.print(_jspx_html_data[29]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 210,158-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 210,172
                out.print(rcpt_bank_name);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 210,174-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 213,113
                out.print(_jspx_html_data[30]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 213,116-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 213,129
                out.print(rcpt_bank_bic);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 213,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 217,142
                out.print(_jspx_html_data[31]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 217,145-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 217,158
                out.print(rcpt_bank_acc);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 217,160-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 220,131
                out.print(_jspx_html_data[32]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 220,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 220,142
                out.print(rcpt_inn);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 220,144-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 221,329
                out.print(_jspx_html_data[33]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 221,332-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 221,341
                out.print(rcpt_name);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 221,343-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 224,109
                out.print(_jspx_html_data[34]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 224,112-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 224,124
                out.print(rcpt_account);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 224,126-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,99
                out.print(_jspx_html_data[35]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,102-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,109
                out.print(termStr);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,251
                out.print(_jspx_html_data[36]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,254-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,260
                out.print(termDD);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,262-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,403
                out.print(_jspx_html_data[37]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,406-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,412
                out.print(termMM);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,414-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,553
                out.print(_jspx_html_data[38]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,556-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,562
                out.print(termYY);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 230,564-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 237,48
                out.print(_jspx_html_data[39]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 237,51-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 237,71
                out.print(selected(queue,"01"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 237,73-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 238,48
                out.print(_jspx_html_data[40]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 238,51-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 238,71
                out.print(selected(queue,"02"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 238,73-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 239,48
                out.print(_jspx_html_data[41]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 239,51-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 239,71
                out.print(selected(queue,"03"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 239,73-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 240,48
                out.print(_jspx_html_data[42]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 240,51-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 240,71
                out.print(selected(queue,"04"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 240,73-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 241,48
                out.print(_jspx_html_data[43]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 241,51-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 241,71
                out.print(selected(queue,"05"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 241,73-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 242,48
                out.print(_jspx_html_data[44]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 242,51-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 242,71
                out.print(selected(queue,"06"));
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 242,73-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 276,328
                out.print(_jspx_html_data[45]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 276,331-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 276,346
                out.print(payment_details);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 276,348-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 287,61
                out.print(_jspx_html_data[46]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 287,64-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 287,74
                out.print(status_doc);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 287,76-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 292,12
                out.print(_jspx_html_data[47]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 292,14-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 292,27
                if(!isNew) { 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 292,29-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 295,12
                out.print(_jspx_html_data[48]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 295,14-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 295,22
                } else {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 295,24-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 297,12
                out.print(_jspx_html_data[49]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 297,14-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 297,15
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 297,17-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\PAYMENT_CHOOSEN.jsp" 527,0
                out.print(_jspx_html_data[50]);
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
