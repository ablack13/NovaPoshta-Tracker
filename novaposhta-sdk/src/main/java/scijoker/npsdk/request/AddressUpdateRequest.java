package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;

/**
 * Created by scijoker on 20.11.16.
 */

public class AddressUpdateRequest extends Base_Request {
    public AddressUpdateRequest(String counterpartyRef, String ref, String streetRef, int buildingNumber, int flat, String note) {
        super("Address", "update", new MethodProperties(counterpartyRef, ref, streetRef, buildingNumber, flat, note));
    }

    public static class MethodProperties extends Base_MethodProperties {
        private String CounterpartyRef;
        private String Ref;
        private String StreetRef;
        private int BuildingNumber;
        private int Flat;
        private String Note;

        public MethodProperties(String counterpartyRef, String ref, String streetRef, int buildingNumber, int flat, String note) {
            CounterpartyRef = counterpartyRef;
            Ref = ref;
            StreetRef = streetRef;
            BuildingNumber = buildingNumber;
            Flat = flat;
            Note = note;
        }
    }
}