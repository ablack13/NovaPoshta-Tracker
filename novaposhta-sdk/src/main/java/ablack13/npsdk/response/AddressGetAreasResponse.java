package ablack13.npsdk.response;

import ablack13.npsdk.common.Base_Response;

/**
 * Created by scijoker on 19.11.16.
 */

public class AddressGetAreasResponse extends Base_Response {
    public Data[] data;

    public static class Data {
        public String Description;
        public String Ref;
        public String AreasCenter;
    }
}
