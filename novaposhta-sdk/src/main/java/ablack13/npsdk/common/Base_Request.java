package ablack13.npsdk.common;

/**
 * Created by scijoker on 15.10.16.
 */

public class Base_Request {
    public String apiKey;
    public String modelName;
    public String calledMethod;
    public Base_MethodProperties methodProperties;

    public Base_Request(String modelName, String calledMethod) {
        this(modelName, calledMethod, new Base_MethodProperties());
    }

    public Base_Request(String modelName, String calledMethod, Base_MethodProperties methodProperties) {
        this.apiKey = ApiConst.API_KEY;
        this.modelName = modelName;
        this.calledMethod = calledMethod;
        this.methodProperties = methodProperties;
    }

    public static class Base_MethodProperties {
    }
}
