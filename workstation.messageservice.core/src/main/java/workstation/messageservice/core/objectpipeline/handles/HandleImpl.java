package workstation.messageservice.core.objectpipeline.handles;

import workstation.core.delegates.Func_2;
import workstation.core.exceptions.SystemException;
import workstation.messageservice.core.objectpipeline.ActionContext;
import workstation.messageservice.core.objectpipeline.HandleResult;

import java.util.function.Function;

/**
 * Created by Administrator on 2016/11/18.
 */
public class HandleImpl implements Handle {

    private int order;
    private String name;
    private Func_2<HandleResult, Handle, ActionContext> process;
    private Function<ActionContext, Boolean> filter;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getOrder() {
        return this.order;
    }

    @Override
    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public Function<ActionContext, Boolean> getFilter() {
        return this.filter;
    }

    @Override
    public void setFilter(Function<ActionContext, Boolean> filter) {
        this.filter = filter;
    }

    @Override
    public HandleResult execute(ActionContext context) {

        if (this.canProcess(context)) {

            try {
                if (this.process != null) {
                    return this.process.execute(this, context);
                } else {
                    return this.executeCore(context);
                }
            } catch (Exception ce) {
                return HandleResult.fail(this, ce.getMessage(), ce);
            }
        }

        return null;
    }

    @Override
    public Handle registerProcess(Func_2<HandleResult, Handle, ActionContext> process) {
        this.process = process;
        return this;
    }

    protected HandleResult executeCore(ActionContext actionContext) {
        throw new SystemException("NotImplementedException");
    }

    protected boolean canProcess(ActionContext context) {
        if (this.getFilter() == null) {
            return true;
        } else {
            return this.getFilter().apply(context) && context.getHandles().contains(this.getName());
        }
    }
}
