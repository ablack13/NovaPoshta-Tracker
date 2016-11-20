package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;

/**
 * Created by scijoker on 20.11.16.
 */

public class CounterpartySaveRequest extends Base_Request {
    public CounterpartySaveRequest(String cityRef,
                                   String firstName,
                                   String middleName,
                                   String lastName,
                                   long phone,
                                   String email,
                                   String counterpartyType,
                                   String counterpartyProperty) {
        super("Counterparty", "save",
                new MethodProperties(cityRef,
                        firstName,
                        middleName,
                        lastName,
                        phone,
                        email,
                        counterpartyType,
                        counterpartyProperty,
                        null,
                        null));
    }

    public CounterpartySaveRequest(String cityRef,
                                   String firstName,
                                   String middleName,
                                   String lastName,
                                   long phone,
                                   String email,
                                   String counterpartyType,
                                   String counterpartyProperty,
                                   String ownershipForm) {
        super("Counterparty", "save",
                new MethodProperties(cityRef,
                        firstName,
                        middleName,
                        lastName,
                        phone,
                        email,
                        counterpartyType,
                        counterpartyProperty,
                        ownershipForm,
                        null));
    }

    private static class MethodProperties extends Base_MethodProperties {
        private String CityRef;
        private String FirstName;
        private String MiddleName;
        private String LastName;
        private long Phone;
        private String Email;
        private String CounterpartyType;
        private String CounterpartyProperty;
        private String OwnershipForm;
        private String EDRPOU;

        private MethodProperties(String cityRef,
                                 String firstName,
                                 String middleName,
                                 String lastName,
                                 long phone,
                                 String email,
                                 String counterpartyType,
                                 String counterpartyProperty,
                                 String ownershipForm,
                                 String edrpou) {
            CityRef = cityRef;
            FirstName = firstName;
            MiddleName = middleName;
            LastName = lastName;
            Phone = phone;
            Email = email;
            CounterpartyType = counterpartyType;
            CounterpartyProperty = counterpartyProperty;
            OwnershipForm = ownershipForm;
            EDRPOU = edrpou;
        }
    }
}
