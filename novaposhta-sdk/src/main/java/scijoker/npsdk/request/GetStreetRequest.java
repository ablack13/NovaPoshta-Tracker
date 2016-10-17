package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;
import scijoker.npsdk.common.CalledMethod;
import scijoker.npsdk.common.ModelName;

/**
 * Created by scijoker on 17.10.16.
 */

public class GetStreetRequest extends Base_Request {
    public GetStreetRequest(String cityRef, int page) {
        super(ModelName.GET_STREET, CalledMethod.GET_STREET, new MethodWithPageProperties(cityRef, page));
    }

    public GetStreetRequest(String cityRef, String streetNamePrefix) {
        super(ModelName.GET_STREET, CalledMethod.GET_STREET, new MethodWithStreetNamePrefixProperties(cityRef, streetNamePrefix));
    }

    public static class MethodWithPageProperties extends Base_MethodProperties {
        String CityRef;
        int Page;

        public MethodWithPageProperties(String cityRef, int page) {
            CityRef = cityRef;
            Page = page;
        }
    }

    public static class MethodWithStreetNamePrefixProperties extends Base_MethodProperties {
        String CityRef;
        String FindByString;

        public MethodWithStreetNamePrefixProperties(String cityRef, String streetNamePrefix) {
            CityRef = cityRef;
            FindByString = streetNamePrefix;
        }
    }
}
