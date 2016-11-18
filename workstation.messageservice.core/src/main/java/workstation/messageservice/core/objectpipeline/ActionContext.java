package workstation.messageservice.core.objectpipeline;

/**
 * Created by Administrator on 2016/11/18.
 */
public class ActionContext {
    private String routeKey;
    private boolean isContinue;
    private Object input;

    public String getRouteKey() {
        return routeKey;
    }

    public void setRouteKey(String routeKey) {
        this.routeKey = routeKey;
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
