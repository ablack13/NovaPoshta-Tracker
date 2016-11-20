package scijoker.npsdk.response;

import scijoker.npsdk.common.Base_Response;

/**
 * Created by scijoker on 20.11.16.
 */

public class ContactPersonDeleteResponse extends Base_Response {
    public Data[] data;

    public static class Data extends Base_Data {
        public String Ref;
    }
}
