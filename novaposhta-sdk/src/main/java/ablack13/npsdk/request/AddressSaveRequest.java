package ablack13.npsdk.request;

import ablack13.npsdk.common.Base_Request;

/**
 * Created by scijoker on 20.11.16.
 */

public class AddressSaveRequest extends Base_Request {
    public AddressSaveRequest(String counterpartyRef, String streetRef, int buildingNumber, int flat, String note) {
        super("Address", "save", new MethodProperties(counterpartyRef, streetRef, buildingNumber, flat, note));
    }

    public static class MethodProperties extends Base_MethodProperties {
        public String CounterpartyRef;
        public String StreetRef;
        public int BuildingNumber;
        public int Flat;
        public String Note;

        public MethodProperties(String counterpartyRef, String streetRef, int buildingNumber, int flat, String note) {
            CounterpartyRef = counterpartyRef;
            StreetRef = streetRef;
            BuildingNumber = buildingNumber;
            Flat = flat;
            Note = note;
        }
    }
}
