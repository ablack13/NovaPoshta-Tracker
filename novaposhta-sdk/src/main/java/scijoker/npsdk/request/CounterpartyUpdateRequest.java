package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;

/**
 * Created by scijoker on 20.11.16.
 */

public class CounterpartyUpdateRequest extends Base_Request {
    public CounterpartyUpdateRequest(String ref, String cityRef, String firstName, String middleName, String lastName, long phone, String email, String counterpartyType, String counterpartyProperty) {
        super("Counterparty", "update", new MethodProperties(ref, cityRef, firstName, middleName, lastName, phone, email, counterpartyType, counterpartyProperty));
    }

    private static class MethodProperties extends Base_MethodProperties {
        public String Ref;
        public String CityRef;
        public String FirstName;
        public String MiddleName;
        public String LastName;
        public long Phone;
        public String Email;
        public String CounterpartyType;
        public String CounterpartyProperty;

        public MethodProperties(String ref, String cityRef, String firstName, String middleName, String lastName, long phone, String email, String counterpartyType, String counterpartyProperty) {
            Ref = ref;
            CityRef = cityRef;
            FirstName = firstName;
            MiddleName = middleName;
            LastName = lastName;
            Phone = phone;
            Email = email;
            CounterpartyType = counterpartyType;
            CounterpartyProperty = counterpartyProperty;
        }
    }
}
