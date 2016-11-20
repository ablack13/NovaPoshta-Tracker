package ablack13.npsdk.request;

import ablack13.npsdk.common.Base_Request;

/**
 * Created by scijoker on 19.11.16.
 */

public class CommonGetTimeIntervalsRequest extends Base_Request {
    public CommonGetTimeIntervalsRequest(String recipientCityRef, String dateTime) {
        super("Common", "getTimeIntervals", new MethodProperties(recipientCityRef, dateTime));
    }

    private static class MethodProperties extends Base_MethodProperties {
        private String RecipientCityRef;
        private String DateTime;

        public MethodProperties(String recipientCityRef, String dateTime) {
            RecipientCityRef = recipientCityRef;
            DateTime = dateTime;
        }
    }
}
