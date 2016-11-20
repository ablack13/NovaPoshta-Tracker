package ablack13.npsdk.response;

import ablack13.npsdk.common.Base_Response;

/**
 * Created by scijoker on 20.10.16.
 */

public class CounterpartyGetCounterpartiesResponse extends Base_Response {
    public Data[] data;

    public static class Data extends Base_Data {
        public String Description;
        public String Ref;
        public String City;
        public String Counterparty;
        public String FirstName;
        public String LastName;
        public String MiddleName;
        public String OwnershipFormRef;
        public String OwnershipFormDescription;
        public String EDRPOU;
        public String CounterpartyType;
        public String CityDescription;
    }
}
