package workstation.messageservice.core.objectpipeline;

import workstation.messageservice.core.objectpipeline.handles.Handle;

import java.util.List;

/**
 * Created by Administrator on 2016/11/18.
 */
public class ActionContext {
    private String routeKey;
    private boolean isContinue;
    private Object input;
    private List<String> handles;

    public String getRouteKey() {
        return routeKey;
    }

    public void setRouteKey(String routeKey) {
        this.routeKey = routeKey;
    }

    public List<String> getHandles() {
        return this.handles;
    }

    public void setHandles(List<String> handles) {
        this.handles = handles;
    }

    public boolean getIsContinue() {
        return isContinue;
    }

    public void setIsContinue(boolean isContinue) {
        isContinue = isContinue;
    }

    public Object getInput() {
        return input;
    }

    public void setInput(Object input) {
        this.input = input;
    }
}
