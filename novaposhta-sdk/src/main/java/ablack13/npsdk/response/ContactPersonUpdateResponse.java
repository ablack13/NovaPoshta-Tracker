package ablack13.npsdk.response;

import ablack13.npsdk.common.Base_Response;

/**
 * Created by scijoker on 20.11.16.
 */

public class ContactPersonUpdateResponse extends Base_Response {
    public Data[] data;

    public static class Data extends Base_Data {
        public String Ref;
        public String Description;
        public String LastName;
        public String FirstName;
        public String MiddleName;
        public String Phones;
        public String Email;
    }
}
