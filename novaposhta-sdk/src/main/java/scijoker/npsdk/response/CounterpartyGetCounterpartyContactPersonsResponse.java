package scijoker.npsdk.response;

import scijoker.npsdk.common.Base_Response;

/**
 * Created by scijoker on 19.11.16.
 */

public class CounterpartyGetCounterpartyContactPersonsResponse extends Base_Response {
    public Data[] data;

    public static class Data extends Base_Data {
        public String Description;
        public String Ref;
        public String Phones;
        public String Email;
        public String LastName;
        public String FirstName;
        public String MiddleName;
    }
}
