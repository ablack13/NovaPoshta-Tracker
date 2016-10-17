package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;
import scijoker.npsdk.common.CalledMethod;
import scijoker.npsdk.common.ModelName;

/**
 * Created by scijoker on 17.10.16.
 */

public class GetWarehouseTypesRequest extends Base_Request {
    public GetWarehouseTypesRequest() {
        super(ModelName.GET_WAREHOUSES_TYPE, CalledMethod.GET_WAREHOUSES_TYPE);
    }
}
