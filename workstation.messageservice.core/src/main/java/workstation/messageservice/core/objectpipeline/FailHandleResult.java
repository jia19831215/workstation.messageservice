package workstation.messageservice.core.objectpipeline;

import workstation.messageservice.core.objectpipeline.handles.Handle;

/**
 * Created by Administrator on 2016/11/18.
 */
public class FailHandleResult extends HandleResult {

    private String msg;
    private Throwable ce;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Throwable getCe() {
        return ce;
    }

    public void setCe(Throwable ce) {
        this.ce = ce;
    }

    public FailHandleResult(Handle handle, String msg, Throwable ce){
        this.setHandle(handle);
        this.msg = msg;
        this.ce = ce;
    }
}
