package ablack13.npsdk.response;

import ablack13.npsdk.common.Base_Response;

/**
 * Created by scijoker on 20.11.16.
 */

public class AddressUpdateResponse extends Base_Response {
    public Data[] data;

    public static class Data {
        public String Ref;
        public String Description;
    }
}
