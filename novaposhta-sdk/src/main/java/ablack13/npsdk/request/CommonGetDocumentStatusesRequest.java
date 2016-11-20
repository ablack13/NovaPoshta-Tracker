package ablack13.npsdk.request;

import ablack13.npsdk.common.Base_Request;

/**
 * Created by scijoker on 19.11.16.
 */

public class CommonGetDocumentStatusesRequest extends Base_Request {
    private CommonGetDocumentStatusesRequest() {
        super("Common", "getDocumentStatuses", new MethodProperties());
    }

    public static class Builder {
        private CommonGetDocumentStatusesRequest request;

        public Builder() {
            request = new CommonGetDocumentStatusesRequest();
        }

        public Builder setGroupId(int groupId) {
            ((MethodProperties) request.methodProperties).setGroupId(groupId);
            return this;
        }

        public Builder setStateId(int stateId) {
            ((MethodProperties) request.methodProperties).setStateId(stateId);
            return this;
        }

        public Builder setStateName(String stateName) {
            ((MethodProperties) request.methodProperties).setStateName(stateName);
            return this;
        }

        public CommonGetDocumentStatusesRequest get() {
            return request;
        }
    }


    public static class MethodProperties extends Base_MethodProperties {
        private int GroupId;
        private int StateId;
        private String StateName;

        public MethodProperties() {
        }

        public void setGroupId(int groupId) {
            GroupId = groupId;
        }

        public void setStateId(int stateId) {
            StateId = stateId;
        }

        public void setStateName(String stateName) {
            StateName = stateName;
        }
    }
}
