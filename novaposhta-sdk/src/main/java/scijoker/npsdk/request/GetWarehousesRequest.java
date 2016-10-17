package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;
import scijoker.npsdk.common.CalledMethod;
import scijoker.npsdk.common.ModelName;

/**
 * Created by scijoker on 17.10.16.
 */

public class GetWarehousesRequest extends Base_Request {
    public GetWarehousesRequest(String cityRef) {
        super(ModelName.GET_WAREHOUSES, CalledMethod.GET_WAREHOUSES, new MethodProperties(cityRef));
    }

    public static class MethodProperties extends Base_MethodProperties {
        String CityRef;

        public MethodProperties(String cityRef) {
            CityRef = cityRef;
        }
    }
}
