package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;

/**
 * Created by scijoker on 20.11.16.
 */

public class CounterpartyGetCounterpartyOptionsRequest extends Base_Request {
    public CounterpartyGetCounterpartyOptionsRequest(String ref) {
        super("Counterparty", "getCounterpartyOptions",new MethodProperties(ref));
    }

    public static class MethodProperties extends Base_MethodProperties {
        private String Ref;

        public MethodProperties(String ref) {
            Ref = ref;
        }
    }
}
