package scijoker.npsdk.response;

import scijoker.npsdk.common.Base_Response;

/**
 * Created by scijoker on 20.10.16.
 */

public class CounterpartyGetCounterpartyAddressesResponse extends Base_Response {
    public Data[] data;

    public static class Data extends Base_Data {
        public String Ref;
        public String Description;
    }
}
