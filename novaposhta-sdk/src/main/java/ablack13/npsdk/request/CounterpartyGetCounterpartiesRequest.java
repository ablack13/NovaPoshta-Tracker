package ablack13.npsdk.request;

import ablack13.npsdk.common.Base_Request;

/**
 * Created by scijoker on 20.10.16.
 */

public class CounterpartyGetCounterpartiesRequest extends Base_Request {
    public CounterpartyGetCounterpartiesRequest(boolean isSender, int page) {
        super("Counterparty", "getCounterparties", new WithPageMethodProperties(isSender, page));
    }

    public CounterpartyGetCounterpartiesRequest(boolean isSender, String descriptionNamePrefix) {
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