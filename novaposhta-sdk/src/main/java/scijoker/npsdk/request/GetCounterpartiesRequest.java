package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;

/**
 * Created by scijoker on 20.10.16.
 */

public class GetCounterpartiesRequest extends Base_Request {
    public GetCounterpartiesRequest(boolean isSender, int page) {
        super("Counterparty", "getCounterparties", new WithPageMethodProperties(isSender, page));
    }

    public GetCounterpartiesRequest(boolean isSender, String descriptionNamePrefix) {
        super("Counterparty", "getCounterparties",new WithDescriptionNamePrefixMethodProperties(isSender,descriptionNamePrefix));
    }

    private static class WithPageMethodProperties extends Base_MethodProperties {
        String CounterpartyProperty;
        int Page;

        public WithPageMethodProperties(boolean isSender, int page) {
            this.CounterpartyProperty = isSender ? "Sender" : "Recipient";
            this.Page = page;
        }
    }

    private static class WithDescriptionNamePrefixMethodProperties extends Base_MethodProperties {
        String CounterpartyProperty;
        String findByString;

        public WithDescriptionNamePrefixMethodProperties(boolean isSender, String descriptionNamePrefix) {
            this.CounterpartyProperty = isSender ? "Sender" : "Recipient";
            this.findByString = descriptionNamePrefix;
        }
    }
}