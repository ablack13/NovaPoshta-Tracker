package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;

/**
 * Created by scijoker on 20.11.16.
 */

public class ContactPersonSaveRequest extends Base_Request {
    public ContactPersonSaveRequest(String counterpartyRef, String firstName, String lastName, String middleName, String phone) {
        super("ContactPerson", "save", new MethodProperties(counterpartyRef, firstName, lastName, middleName, phone));
    }

    public static class MethodProperties extends Base_MethodProperties {
        private String CounterpartyRef;
        private String FirstName;
        private String LastName;
        private String MiddleName;
        private String Phone;

        public MethodProperties(String counterpartyRef, String firstName, String lastName, String middleName, String phone) {
            CounterpartyRef = counterpartyRef;
            FirstName = firstName;
            LastName = lastName;
            MiddleName = middleName;
            Phone = phone;
        }
    }
}
