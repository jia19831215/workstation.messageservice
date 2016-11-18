package workstation.messageservice.core.objectpipeline;

import workstation.messageservice.core.objectpipeline.handles.Handle;

/**
 * Created by Administrator on 2016/11/18.
 */
public class HandleResult {

    private Handle handle;
    private Object result;

    public Handle getHandle() {
        return handle;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public static HandleResult success(Object result) {
        return new SuccessHandleResult((result));
    }

    public static HandleResult fail(Handle handle, String msg, Throwable ce) {
        return new FailHandleResult(handle, msg, ce);
    }
}
