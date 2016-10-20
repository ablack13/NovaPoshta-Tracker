package scijoker.npsdk.request;

import scijoker.npsdk.common.Base_Request;

/**
 * Created by scijoker on 17.10.16.
 */

public class GetCitiesRequest extends Base_Request {
    public GetCitiesRequest() {
        this(null);
    }

    public GetCitiesRequest(String cityNamePrefix) {
        super("Address", "getCities", new GetCitiesMethodProperties(cityNamePrefix));
    }

    private static class GetCitiesMethodProperties extends Base_MethodProperties {
        String FindByString;

        public GetCitiesMethodProperties(String FindCityByPrefix) {
            this.FindByString = FindCityByPrefix;
        }

    }
}
