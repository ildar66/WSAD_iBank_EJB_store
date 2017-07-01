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
import java.util.*;


public class _DOCUMENTS_0005fCHOOSEN_jsp_27 extends HttpJspBase {

    static char[][] _jspx_html_data = null;
    // end

    static {
    }
    public _DOCUMENTS_0005fCHOOSEN_jsp_27( ) {
    }

    private static boolean _jspx_inited = false;

    private static boolean checkedAttributeIgnoreException = false;
    private static boolean throwException = true;
    
    public final void _jspx_init() throws JasperException {
        ObjectInputStream oin = null;
        int numStrings = 0;
        try {
            InputStream fin = this.getClass().getClassLoader().getResourceAsStream("ibankjsp/_DOCUMENTS_0005fCHOOSEN_jsp_27.dat");
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

            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 1,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 6,0
                out.print(_jspx_html_data[0]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 6,56-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 24,0
                out.print(_jspx_html_data[1]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 24,53-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 25,0
                out.print(_jspx_html_data[2]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 25,32-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 26,0
                out.print(_jspx_html_data[3]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 26,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 26,134
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
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 26,0-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 26,134
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 26,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 28,0
                out.print(_jspx_html_data[4]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 28,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 99,0
                
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
                  payer_inn = curDocument.rtPayer_inn();
                  payer_name = curDocument.rtPayer_name();
                  payer_account = curDocument.rtPayer_account();
                  amount = curDocument.rtAmount();
                  payer_bank_name = curDocument.rtPayer_bank_name();
                  payer_bank_bic = curDocument.rtPayer_bank_bic();
                  payer_bank_acc = curDocument.rtPayer_bank_acc();
                  rcpt_bank_name = curDocument.rtRcpt_bank_name();
                  rcpt_bank_bic = curDocument.rtRcpt_bank_bic();
                  rcpt_bank_acc = curDocument.rtRcpt_bank_acc();
                  rcpt_inn = curDocument.rtRcpt_inn();
                  rcpt_name = curDocument.rtRcpt_name();
                  rcpt_account = curDocument.rtRcpt_account();
                  queue = curDocument.rtQueue();
                  java.sql.Date term = curDocument.rtTerm();
                  calendar.setTime(term);
                  termDD = String.valueOf(calendar.get(java.util.Calendar.DATE));
                  termMM = String.valueOf(calendar.get(java.util.Calendar.MONTH)+1);
                  termYY = String.valueOf(calendar.get(java.util.Calendar.YEAR));
                  termStr = termYY +"-"+ termMM +"-"+ termDD ;
                  payment_details = curDocument.rtPayment_details();
                  status_doc = Document.getStatus_docFull(curDocument);
                }  
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 99,2-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 105,64
                out.print(_jspx_html_data[5]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 105,67-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 105,109
                out.print(userIBank.getCurrentIClient().rtName_cln());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 105,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 134,51
                out.print(_jspx_html_data[6]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 134,54-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 134,63
                out.print(operation);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 134,65-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 144,38
                out.print(_jspx_html_data[7]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 144,41-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 144,101
                out.print(userIBank.getCurrentIClient().getClient_id().getIdAsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 144,103-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 158,143
                out.print(_jspx_html_data[8]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 158,146-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 158,156
                out.print(num_docStr);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 158,158-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,103
                out.print(_jspx_html_data[9]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,106-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,117
                out.print(date_docStr);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,119-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,211
                out.print(_jspx_html_data[10]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,214-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,224
                out.print(date_docDD);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,226-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,334
                out.print(_jspx_html_data[11]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,337-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,347
                out.print(date_docMM);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,349-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,443
                out.print(_jspx_html_data[12]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,446-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,456
                out.print(date_docYY);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 159,458-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 161,60
                out.print(_jspx_html_data[13]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 161,62-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 161,92
                if(payment_type.equals(" ")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 161,94-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 161,102
                out.print(_jspx_html_data[14]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 161,104-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 161,105
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 161,107-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 162,60
                out.print(_jspx_html_data[15]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 162,62-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 162,101
                if(payment_type.equals("Электронно")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 162,103-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 162,111
                out.print(_jspx_html_data[16]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 162,113-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 162,114
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 162,116-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 163,60
                out.print(_jspx_html_data[17]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 163,62-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 163,101
                if(payment_type.equals("Телеграфом")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 163,103-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 163,111
                out.print(_jspx_html_data[18]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 163,113-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 163,114
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 163,116-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 164,60
                out.print(_jspx_html_data[19]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 164,62-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 164,97
                if(payment_type.equals("Почтой")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 164,99-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 164,107
                out.print(_jspx_html_data[20]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 164,109-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 164,110
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 164,112-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 176,142
                out.print(_jspx_html_data[21]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 176,145-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 176,154
                out.print(payer_inn);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 176,156-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 177,329
                out.print(_jspx_html_data[22]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 177,332-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 177,342
                out.print(payer_name);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 177,344-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 180,97
                out.print(_jspx_html_data[23]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 180,100-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 180,106
                out.print(amount);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 180,108-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 185,38
                out.print(_jspx_html_data[24]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 185,40-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 185,145
                 for (int i=0; i  <  bankAccounts.size(); i++){ curBankAccount = (BankAccount)bankAccounts.elementAt(i); 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 185,147-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 186,48
                out.print(_jspx_html_data[25]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 186,50-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 186,117
                if(payer_account.equals(curBankAccount.getId().getId2AsString())) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 186,119-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 186,127
                out.print(_jspx_html_data[26]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 186,129-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 186,130
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 186,132-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 186,133
                out.print(_jspx_html_data[27]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 186,136-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 186,175
                out.print(curBankAccount.getId().getId2AsString());
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 186,177-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 187,38
                out.print(_jspx_html_data[28]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 187,40-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 187,43
                 } 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 187,45-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 191,153
                out.print(_jspx_html_data[29]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 191,156-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 191,172
                out.print(payer_bank_name );
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 191,174-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 194,138
                out.print(_jspx_html_data[30]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 194,141-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 194,155
                out.print(payer_bank_bic);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 194,157-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 198,143
                out.print(_jspx_html_data[31]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 198,146-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 198,160
                out.print(payer_bank_acc);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 198,162-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 201,155
                out.print(_jspx_html_data[32]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 201,158-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 201,172
                out.print(rcpt_bank_name);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 201,174-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 204,113
                out.print(_jspx_html_data[33]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 204,116-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 204,129
                out.print(rcpt_bank_bic);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 204,131-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 208,142
                out.print(_jspx_html_data[34]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 208,145-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 208,158
                out.print(rcpt_bank_acc);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 208,160-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 211,131
                out.print(_jspx_html_data[35]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 211,134-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 211,142
                out.print(rcpt_inn);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 211,144-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 212,329
                out.print(_jspx_html_data[36]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 212,332-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 212,341
                out.print(rcpt_name);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 212,343-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 215,109
                out.print(_jspx_html_data[37]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 215,112-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 215,124
                out.print(rcpt_account);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 215,126-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,99
                out.print(_jspx_html_data[38]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,102-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,109
                out.print(termStr);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,111-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,251
                out.print(_jspx_html_data[39]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,254-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,260
                out.print(termDD);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,262-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,403
                out.print(_jspx_html_data[40]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,406-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,412
                out.print(termMM);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,414-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,553
                out.print(_jspx_html_data[41]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,556-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,562
                out.print(termYY);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 221,564-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 228,48
                out.print(_jspx_html_data[42]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 228,50-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 228,74
                if(queue.equals("01")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 228,76-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 228,84
                out.print(_jspx_html_data[43]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 228,86-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 228,87
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 228,89-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 229,48
                out.print(_jspx_html_data[44]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 229,50-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 229,74
                if(queue.equals("02")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 229,76-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 229,84
                out.print(_jspx_html_data[45]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 229,86-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 229,87
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 229,89-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 230,48
                out.print(_jspx_html_data[46]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 230,50-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 230,74
                if(queue.equals("03")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 230,76-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 230,84
                out.print(_jspx_html_data[47]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 230,86-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 230,87
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 230,89-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 231,48
                out.print(_jspx_html_data[48]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 231,50-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 231,74
                if(queue.equals("04")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 231,76-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 231,84
                out.print(_jspx_html_data[49]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 231,86-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 231,87
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 231,89-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 232,48
                out.print(_jspx_html_data[50]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 232,50-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 232,74
                if(queue.equals("05")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 232,76-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 232,84
                out.print(_jspx_html_data[51]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 232,86-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 232,87
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 232,89-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 233,48
                out.print(_jspx_html_data[52]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 233,50-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 233,74
                if(queue.equals("06")) {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 233,76-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 233,84
                out.print(_jspx_html_data[53]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 233,86-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 233,87
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 233,89-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 267,328
                out.print(_jspx_html_data[54]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 267,331-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 267,346
                out.print(payment_details);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 267,348-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 278,61
                out.print(_jspx_html_data[55]);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 278,64-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 278,74
                out.print(status_doc);
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 278,76-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 283,12
                out.print(_jspx_html_data[56]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 283,14-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 283,27
                if(!isNew) { 
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 283,29-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 286,12
                out.print(_jspx_html_data[57]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 286,14-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 286,22
                } else {
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 286,24-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 288,12
                out.print(_jspx_html_data[58]);
            // end
            // ##DEBUG## ##SCRIPTLET## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 288,14-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 288,15
                }
            // end
            // ##DEBUG## "C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 288,17-"C:\\WSAD_iBank\\iBankWeb\\webApplication\\ibankjsp\\DOCUMENTS_CHOOSEN.jsp" 519,0
                out.print(_jspx_html_data[59]);
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
