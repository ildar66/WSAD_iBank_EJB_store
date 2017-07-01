// Tie class generated by rmic, do not edit.
// Contents subject to change without notice.

package itso.ejb35.session;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;
import javax.ejb.EJBHome;
import javax.ejb.EJBObject;
import javax.ejb.Handle;
import javax.ejb.RemoveException;
import javax.rmi.CORBA.Util;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.UnknownException;

public class _EJSRemoteStatelessCustomerFinder_Tie extends org.omg.CORBA_2_3.portable.ObjectImpl implements javax.rmi.CORBA.Tie {
    
    private EJSRemoteStatelessCustomerFinder target = null;
    private org.omg.CORBA.ORB orb = null;
    
    private static final String[] _type_ids = {
        "RMI:itso.ejb35.session.CustomerFinder:0000000000000000", 
        "RMI:javax.ejb.EJBObject:0000000000000000", 
        "RMI:com.ibm.websphere.csi.CSIServant:0000000000000000", 
        "RMI:com.ibm.websphere.csi.TransactionalObject:0000000000000000"
    };
    
    public void setTarget(java.rmi.Remote target) {
        this.target = (EJSRemoteStatelessCustomerFinder) target;
    }
    
    public java.rmi.Remote getTarget() {
        return target;
    }
    
    public org.omg.CORBA.Object thisObject() {
        return this;
    }
    
    public void deactivate() {
        if (orb != null) {
            orb.disconnect(this);
            _set_delegate(null);
        }
    }
    
    public org.omg.CORBA.ORB orb() {
        return _orb();
    }
    
    public void orb(org.omg.CORBA.ORB orb) {
        orb.connect(this);
    }
    
    public void _set_delegate(org.omg.CORBA.portable.Delegate del) {
        super._set_delegate(del);
        if (del != null)
            orb = _orb();
        else
            orb = null;
    }
    
    public String[] _ids() { 
        return _type_ids;
    }
    
    public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _in, org.omg.CORBA.portable.ResponseHandler reply) throws org.omg.CORBA.SystemException {
        try {
            org.omg.CORBA_2_3.portable.InputStream in = 
                (org.omg.CORBA_2_3.portable.InputStream) _in;
            switch (method.length()) {
                case 6: 
                    if (method.equals("remove")) {
                        try {
                            target.remove();
                        } catch (RemoveException ex) {
                            String id = "IDL:javax/ejb/RemoveEx:1.0";
                            org.omg.CORBA_2_3.portable.OutputStream out = 
                                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
                            out.write_string(id);
                            out.write_value(ex,RemoveException.class);
                            return out;
                        }
                        org.omg.CORBA.portable.OutputStream out = reply.createReply();
                        return out;
                    }
                case 7: 
                    if (method.equals("findDab")) {
                        String arg0 = (String) in.read_value(String.class);
                        Vector result = target.findDab(arg0);
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
                        out.write_value(result,Vector.class);
                        return out;
                    } else if (method.equals("findStp")) {
                        String arg0 = (String) in.read_value(String.class);
                        Vector result = target.findStp(arg0);
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
                        out.write_value(result,Vector.class);
                        return out;
                    }
                case 8: 
                    if (method.equals("findJdbc")) {
                        String arg0 = (String) in.read_value(String.class);
                        Vector result = target.findJdbc(arg0);
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
                        out.write_value(result,Vector.class);
                        return out;
                    } else if (method.equals("findStp2")) {
                        String arg0 = (String) in.read_value(String.class);
                        Vector result = target.findStp2(arg0);
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
                        out.write_value(result,Vector.class);
                        return out;
                    }
                case 11: 
                    if (method.equals("_get_handle")) {
                        Handle result = target.getHandle();
                        org.omg.CORBA.portable.OutputStream out = reply.createReply();
                        Util.writeAbstractObject(out,result);
                        return out;
                    } else if (method.equals("isIdentical")) {
                        EJBObject arg0 = (EJBObject) in.read_Object(EJBObject.class);
                        boolean result = target.isIdentical(arg0);
                        org.omg.CORBA.portable.OutputStream out = reply.createReply();
                        out.write_boolean(result);
                        return out;
                    }
                case 12: 
                    if (method.equals("_get_EJBHome")) {
                        EJBHome result = target.getEJBHome();
                        org.omg.CORBA.portable.OutputStream out = reply.createReply();
                        Util.writeRemoteObject(out,result);
                        return out;
                    }
                case 15: 
                    if (method.equals("_get_primaryKey")) {
                        Object result = target.getPrimaryKey();
                        org.omg.CORBA.portable.OutputStream out = reply.createReply();
                        Util.writeAny(out,result);
                        return out;
                    }
            }
            throw new BAD_OPERATION();
        } catch (SystemException ex) {
            throw ex;
        } catch (Throwable ex) {
            throw new UnknownException(ex);
        }
    }
}
