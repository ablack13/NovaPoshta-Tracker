package ablack13.npsdk.request;

import ablack13.npsdk.common.Base_Request;

/**
 * Created by scijoker on 17.10.16.
 */

public class AddressGetWarehousesRequest extends Base_Request {
    public AddressGetWarehousesRequest(String cityRef) {
        super("Address", "getWarehouses", new MethodProperties(cityRef));
    }

    public static class MethodProperties extends Base_MethodProperties {
        String CityRef;

        public MethodProperties(String cityRef) {
            CityRef = cityRef;
        }
    }
}
