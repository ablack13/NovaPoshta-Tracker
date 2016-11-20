package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;

/**
 * Created by scijoker on 20.11.16.
 */

public class ContactPersonDeleteRequest extends Base_Request {
    public ContactPersonDeleteRequest(String ref) {
        super("ContactPerson", "delete", new MethodProperties(ref));
    }

    private static class MethodProperties extends Base_MethodProperties {
        private String Ref;

        public MethodProperties(String ref) {
            Ref = ref;
        }
    }
}
