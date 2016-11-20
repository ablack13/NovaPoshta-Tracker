package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;

/**
 * Created by scijoker on 20.11.16.
 */

public class CounterpartyDeleteRequest extends Base_Request {
    public CounterpartyDeleteRequest(String ref) {
        super("Counterparty", "delete", new MethodProperties(ref));
    }

    public static class MethodProperties extends Base_MethodProperties {
        private String Ref;

        public MethodProperties(String ref) {
            Ref = ref;
        }
    }
}
