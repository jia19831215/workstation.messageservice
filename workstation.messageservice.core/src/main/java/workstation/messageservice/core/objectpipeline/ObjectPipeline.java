package workstation.messageservice.core.objectpipeline;

import workstation.messageservice.core.objectpipeline.handles.Handle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2016/11/18.
 */
public class ObjectPipeline implements Pipeline {

    private List<Handle> handles;

    @Override
    public List<Handle> getHandles() {
        return this.handles;
    }

    public ObjectPipeline() {
        this.handles = new ArrayList<Handle>();
    }

    @Override
    public List<HandleResult> publish(ActionContext context) {

        List<HandleResult> resulut = this.handles.stream()
                .sorted(Comparator.comparing(Handle::getOrder))
                .map(v -> v.execute(context))
                .collect(Collectors.toList());

        // TODO：回调

        return resulut;
    }
}
