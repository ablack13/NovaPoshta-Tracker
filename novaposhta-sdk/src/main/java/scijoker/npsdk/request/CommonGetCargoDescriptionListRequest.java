package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;

/**
 * Created by scijoker on 19.11.16.
 */

public class CommonGetCargoDescriptionListRequest extends Base_Request {
    public CommonGetCargoDescriptionListRequest() {
        super("Common", "getCargoDescriptionList");
    }

    public CommonGetCargoDescriptionListRequest(String findByString) {
        super("Common", "getCargoDescriptionList", new MethodProperties(findByString));
    }

    private static class MethodProperties extends Base_MethodProperties {
        private String FindByString;

        public MethodProperties(String findByString) {
            this.FindByString = findByString;
        }
    }
}
