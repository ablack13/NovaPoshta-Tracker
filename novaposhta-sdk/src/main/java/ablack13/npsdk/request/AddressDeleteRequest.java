package ablack13.npsdk.request;

import ablack13.npsdk.common.Base_Request;

/**
 * Created by scijoker on 20.11.16.
 */

public class AddressDeleteRequest extends Base_Request {
    public AddressDeleteRequest(String ref) {
        super("Address", "delete", new MethodProperties(ref));
    }

    private static class MethodProperties extends Base_MethodProperties {
        private String Ref;

        public MethodProperties(String ref) {
            Ref = ref;
        }
    }
}
