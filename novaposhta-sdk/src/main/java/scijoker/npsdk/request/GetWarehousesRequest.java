package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;

/**
 * Created by scijoker on 17.10.16.
 */

public class GetWarehousesRequest extends Base_Request {
    public GetWarehousesRequest(String cityRef) {
        super("Address", "getWarehouses", new MethodProperties(cityRef));
    }

    public static class MethodProperties extends Base_MethodProperties {
        String CityRef;

        public MethodProperties(String cityRef) {
            CityRef = cityRef;
        }
    }
}
