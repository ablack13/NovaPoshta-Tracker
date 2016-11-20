package scijoker.npsdk.response;

import scijoker.npsdk.common.Base_Response;

/**
 * Created by scijoker on 19.11.16.
 */

public class CommonGetTimeIntervalsResponse extends Base_Response {
    public Data[] data;

    public static class Data {
        public String Number;
        public String Start;
        public String End;
    }
}
