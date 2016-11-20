package ablack13.npsdk.response;

import ablack13.npsdk.common.Base_Response;

/**
 * Created by scijoker on 20.11.16.
 */

public class InternetDocumentSaveResponse extends Base_Response {
    public Data[] data;
    public String[] warnings;

    public static class Data extends Base_Data {
        public String Ref;
        public double CostOnSite;
        public String EstimatedDeliveryDate;
        public long IntDocNumber;
        public String TypeDocument;
        public String RegionCode;
        public String RegionCity;
    }
}
