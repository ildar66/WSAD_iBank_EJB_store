// Tie class generated by rmic, do not edit.
// Contents subject to change without notice.

package itso.ejb35.session;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBMetaData;
import javax.ejb.Handle;
import javax.ejb.HomeHandle;
import javax.ejb.RemoveException;
import javax.rmi.CORBA.Util;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.UnknownException;

public class _EJSRemoteStatelessCustomerFinderHome_Tie extends org.omg.CORBA_2_3.portable.ObjectImpl implements javax.rmi.CORBA.Tie {
    
    private EJSRemoteStatelessCustomerFinderHome target = null;
    private org.omg.CORBA.ORB orb = null;
    
    private static final String[] _type_ids = {
        "RMI:itso.ejb35.session.CustomerFinderHome:0000000000000000", 
        "RMI:javax.ejb.EJBHome:0000000000000000", 
        "RMI:com.ibm.websphere.csi.CSIServant:0000000000000000", 
        "RMI:javax.ejb.EJBObject:0000000000000000", 
        "RMI:com.ibm.websphere.csi.TransactionalObject:0000000000000000"
    };
    
    public void setTarget(java.rmi.Remote target) {
        this.target = (EJSRemoteStatelessCustomerFinderHome) target;
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
                    if (method.equals("create")) {
                        CustomerFinder result;
                        try {
                            result = target.create();
                        } catch (CreateException ex) {
                            String id = "IDL:javax/ejb/CreateEx:1.0";
                            org.omg.CORBA_2_3.portable.OutputStream out = 
                                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
                            out.write_string(id);
                            out.write_value(ex,CreateException.class);
                            return out;
                        }
                        org.omg.CORBA.portable.OutputStream out = reply.createReply();
                        Util.writeRemoteObject(out,result);
                        return out;
                    }
                case 15: 
                    if (method.equals("_get_homeHandle")) {
                        HomeHandle result = target.getHomeHandle();
                        org.omg.CORBA.portable.OutputStream out = reply.createReply();
                        Util.writeAbstractObject(out,result);
                        return out;
                    }
                case 16: 
                    if (method.equals("_get_EJBMetaData")) {
                        EJBMetaData result = target.getEJBMetaData();
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
                        out.write_value((Serializable)result,EJBMetaData.class);
                        return out;
                    }
                case 24: 
                    if (method.equals("remove__java_lang_Object")) {
                        Object arg0 = Util.readAny(in);
                        try {
                            target.remove(arg0);
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
                    } else if (method.equals("remove__javax_ejb_Handle")) {
                        Handle arg0 = (Handle) in.read_abstract_interface(Handle.class);
                        try {
                            target.remove(arg0);
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
            }
            throw new BAD_OPERATION();
        } catch (SystemException ex) {
            throw ex;
        } catch (Throwable ex) {
            throw new UnknownException(ex);
        }
    }
}
