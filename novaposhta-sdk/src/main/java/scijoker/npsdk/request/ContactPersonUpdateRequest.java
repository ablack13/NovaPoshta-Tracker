package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;

/**
 * Created by scijoker on 20.11.16.
 */

public class ContactPersonUpdateRequest extends Base_Request {
    public ContactPersonUpdateRequest(String counterpartyRef, String ref, String firstName, String lastName, String middleName, String phone) {
        super("ContactPerson", "update", new MethodProperties(counterpartyRef, ref, firstName, lastName, middleName, phone));
    }

    private static class MethodProperties extends Base_MethodProperties {
        private String CounterpartyRef;
        private String Ref;
        private String FirstName;
        private String LastName;
        private String MiddleName;
        private String Phone;

        public MethodProperties(String counterpartyRef, String ref, String firstName, String lastName, String middleName, String phone) {
            CounterpartyRef = counterpartyRef;
            Ref = ref;
            FirstName = firstName;
            LastName = lastName;
            MiddleName = middleName;
            Phone = phone;
        }
    }
}