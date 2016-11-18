package workstation.messageservice.core.objectpipeline.handles;

import workstation.core.delegates.Func_2;
import workstation.messageservice.core.objectpipeline.ActionContext;
import workstation.messageservice.core.objectpipeline.HandleResult;

import java.util.function.Function;

/**
 * Created by Administrator on 2016/11/18.
 */
public interface Handle {
    int getOrder();
    void setOrder(int order);

    String getName();
    void setName(String name);

    Function<ActionContext, Boolean> getFilter();
    void setFilter(Function<ActionContext, Boolean> filter);

    HandleResult execute(ActionContext context);

    Handle registerProcess(Func_2<HandleResult, Handle, ActionContext> process);
}
