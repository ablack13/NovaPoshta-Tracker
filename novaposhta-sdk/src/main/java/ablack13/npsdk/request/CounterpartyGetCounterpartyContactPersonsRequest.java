package ablack13.npsdk.request;

import ablack13.npsdk.common.Base_Request;

/**
 * Created by scijoker on 19.11.16.
 */

public class CounterpartyGetCounterpartyContactPersonsRequest extends Base_Request {
    public CounterpartyGetCounterpartyContactPersonsRequest(String ref) {
        super("Counterparty", "getCounterpartyContactPersons",new MethodProperties(ref));
    }

    private static class MethodProperties extends Base_MethodProperties {
        private String Ref;

        public MethodProperties(String ref) {
            Ref = ref;
        }
    }
}
