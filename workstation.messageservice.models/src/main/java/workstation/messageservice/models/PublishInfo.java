package workstation.messageservice.models;

/**
 * Created by Administrator on 2016/11/24.
 */
public class PublishInfo {
    private String routeKey;
    private String applicationName;
    private boolean enabled;

    public String getRouteKey() {
        return routeKey;
    }

    public void setRouteKey(String routeKey) {
        this.routeKey = routeKey;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
