package scijoker.npsdk.response;

import scijoker.npsdk.common.Base_Response;

/**
 * Created by scijoker on 19.11.16.
 */

public class CommonGetDocumentStatusesResponse extends Base_Response {
    public Data[] data;

    public static class Data extends Base_Data {
        public int StateId;
        public String StateName;
        public int GroupId;
    }
}
