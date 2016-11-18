package workstation.messageservice.core.objectpipeline;

import workstation.messageservice.core.objectpipeline.handles.Handle;

import java.util.List;

/**
 * Created by Administrator on 2016/11/18.
 */
public interface Pipeline {

    List<Handle> getHandles();

    void setHandles(List<Handle> handles);

    List<HandleResult> publish(ActionContext context);
}
