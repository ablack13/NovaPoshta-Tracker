package scijoker.npsdk.request;

import scijoker.npsdk.common.ApiConst;
import scijoker.npsdk.request.bean.MethodProperties;

/**
 * Created by scijoker on 15.10.16.
 */

public class Base_RequestObj {
    public String apiKey;
    public String modelName;
    public String calledMethod;
    public MethodProperties methodProperties;

    public Base_RequestObj(String modelName, String calledMethod, MethodProperties methodProperties) {
        this.apiKey = ApiConst.API_KEY;
        this.modelName = modelName;
        this.calledMethod = calledMethod;
        this.methodProperties = methodProperties;
    }
}
