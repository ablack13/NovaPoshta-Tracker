package scijoker.npsdk.response;

import scijoker.npsdk.common.Base_Response;

/**
 * Created by scijoker on 17.10.16.
 */

public class GetWarehousesResponse extends Base_Response {
    public Data[] data;

    public static class Data extends Base_Data {
        public int SiteKey;
        public String Description;
        public String DescriptionRu;
        public String Phone;
        public String TypeOfWarehouse;
        public String Ref;
        public int Number;
        public String CityRef;
        public String CityDescription;
        public String CityDescriptionRu;
        public double Longitude;
        public double Latitude;
        public int PostFinance;
        public int BicycleParking;
        public int POSTerminal;
        public int TotalMaxWeightAllowed;
        public int PlaceMaxWeightAllowed;
        public Reception Reception;
        public Delivery Delivery;
        public Schedule Schedule;

        public static class Reception {
            public String Monday;
            public String Tuesday;
            public String Wednesday;
            public String Thursday;
            public String Friday;
            public String Saturday;
            public String Sunday;
        }

        public static class Delivery {
            public String Monday;
            public String Tuesday;
            public String Wednesday;
            public String Thursday;
            public String Friday;
            public String Saturday;
            public String Sunday;
        }

        public static class Schedule {
            public String Monday;
            public String Tuesday;
            public String Wednesday;
            public String Thursday;
            public String Friday;
            public String Saturday;
            public String Sunday;
        }
    }
}
