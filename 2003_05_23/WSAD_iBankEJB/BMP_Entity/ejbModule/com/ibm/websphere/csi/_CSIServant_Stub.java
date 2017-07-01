// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package com.ibm.websphere.csi;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.UnexpectedException;
import javax.rmi.CORBA.Stub;
import javax.rmi.CORBA.Util;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.RemarshalException;
import org.omg.CORBA.portable.ServantObject;

public class _CSIServant_Stub extends Stub implements CSIServant {
    
    private static final String[] _type_ids = {
        "RMI:com.ibm.websphere.csi.CSIServant:0000000000000000"
    };
    
    public String[] _ids() { 
        return _type_ids;
    }
    
    public boolean wlmable() throws RemoteException {
        if (!Util.isLocal(this)) {
            try {
                org.omg.CORBA.portable.InputStream in = null;
                try {
                    org.omg.CORBA.portable.OutputStream out = _request("wlmable", true);
                    in = _invoke(out);
                    return in.read_boolean();
                } catch (ApplicationException ex) {
                    in = ex.getInputStream();
                    String id = in.read_string();
                    throw new UnexpectedException(id);
                } catch (RemarshalException ex) {
                    return wlmable();
                } finally {
                    _releaseReply(in);
                }
            } catch (SystemException ex) {
                throw Util.mapSystemException(ex);
            }
        } else {
            ServantObject so = _servant_preinvoke("wlmable",CSIServant.class);
            if (so == null) {
                return wlmable();
            }
            try {
                return ((CSIServant)so.servant).wlmable();
            } catch (Throwable ex) {
                Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                throw Util.wrapException(exCopy);
            } finally {
                _servant_postinvoke(so);
            }
        }
    }
}
