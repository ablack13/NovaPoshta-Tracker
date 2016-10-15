package scijoker.npsdk.request;

import scijoker.npsdk.common.CalledMethod;
import scijoker.npsdk.common.ModelName;
import scijoker.npsdk.request.bean.MethodProperties;

/**
 * Created by scijoker on 15.10.16.
 */

public class TrackingDocumentRequestObj extends Base_RequestObj {
    public TrackingDocumentRequestObj(String... documents) {
        super(ModelName.TRACKING_DOCUMENT, CalledMethod.TRACKING_DOCUMENT, new TrackingDocumentMethodProperties(documents));
    }

    private static class TrackingDocumentMethodProperties extends MethodProperties {
        public String[] Documents;

        public TrackingDocumentMethodProperties(String... documents) {
            this.Documents = documents;
        }
    }
}
