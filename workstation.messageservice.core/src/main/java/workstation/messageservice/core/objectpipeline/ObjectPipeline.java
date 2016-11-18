package workstation.messageservice.core.objectpipeline;

import workstation.messageservice.core.objectpipeline.handles.Handle;

import java.util.List;

/**
 * Created by Administrator on 2016/11/18.
 */
public class ObjectPipeline implements Pipeline {

    private List<Handle> handles;

    @Override
    public List<Handle> getHandles() {
        return this.handles;
    }

    @Override
    public void setHandles(List<Handle> handles) {
        this.handles = handles;
    }

    @Override
    public List<HandleResult> publish(ActionContext context) {
        return null;
    }
}
