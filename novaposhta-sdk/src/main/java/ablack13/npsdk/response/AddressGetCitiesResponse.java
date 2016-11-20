package ablack13.npsdk.response;

import ablack13.npsdk.common.Base_Response;

/**
 * Created by scijoker on 17.10.16.
 */

public class AddressGetCitiesResponse extends Base_Response {
    public Data[] data;
    public Info info;

    public static class Data extends Base_Data {
        public String Description;
        public String DescriptionRu;
        public String Ref;
        public int Delivery1; // first day monday
        public int Delivery2;
        public int Delivery3;
        public int Delivery4;
        public int Delivery5;
        public int Delivery6;
        public int Delivery7;
        public String Area;
        public String[] Conglomerates;
        public int CityID;

    }

    public static class Info extends Base_Info {
        public int totalCount;
    }
}
