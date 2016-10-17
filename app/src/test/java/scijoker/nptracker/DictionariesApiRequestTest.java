package scijoker.nptracker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import rx.functions.Action1;
import scijoker.npsdk.NovaPoshtaSDK;
import scijoker.npsdk.request.GetCitiesRequest;
import scijoker.npsdk.request.GetStatusDocumentsRequest;
import scijoker.npsdk.request.GetStreetRequest;
import scijoker.npsdk.request.GetWarehouseTypesRequest;
import scijoker.npsdk.request.GetWarehousesRequest;
import scijoker.npsdk.response.GetCitiesResponse;
import scijoker.npsdk.response.GetStatusDocumentsResponse;
import scijoker.npsdk.response.GetStreetResponse;
import scijoker.npsdk.response.GetWarehouseTypesResponse;
import scijoker.npsdk.response.GetWarehousesResponse;
import scijoker.nptracker.net.ApiConstants;

/**
 * Created by scijoker on 15.10.16.
 */

public class DictionariesApiRequestTest {
    private String phone = "123456789"; //format 38xxxxxxxxxx
    private String ttn = "20450017510673";
    private String cityNamePrefix = "Івано-";
    private String cityRef = "db5c8904-391c-11dd-90d9-001a92567626";//Ivano-Frankivsk,UA
    private String streetNamePrefix = "Заліз";

    @Before
    public void setUp() throws Exception {
        NovaPoshtaSDK.setup(ApiConstants.API_KEY, true);
    }

    @Test
    public void testGetDocumentStatusesRequest() {
        NovaPoshtaSDK.getDictionariesApi()
                .getDocumentStatuses(new GetStatusDocumentsRequest(phone, ttn))
                .subscribe(new Action1<GetStatusDocumentsResponse>() {
                    @Override
                    public void call(GetStatusDocumentsResponse response) {
                        Assert.assertNotNull(response);
                        Assert.assertNotNull(response.data);
                        for (GetStatusDocumentsResponse.Data data : response.data) {
                            Assert.assertNotNull(data);
                            Assert.assertNotNull(data.Number);
                            System.out.println("TTN Number::" + data.Number);
                        }
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable e) {
                        e.printStackTrace();
                    }
                });
    }

    @Test
    public void testGetCitiesRequest() {
        NovaPoshtaSDK.getDictionariesApi()
                .getCities(new GetCitiesRequest())
                .subscribe(new Action1<GetCitiesResponse>() {
                    @Override
                    public void call(GetCitiesResponse response) {
                        Assert.assertNotNull(response);
                        Assert.assertNotNull(response.data);
                        Assert.assertNotNull(response.info.totalCount);
                        System.out.println("get cities::" + response.info.totalCount);
                    }
                });
    }

    @Test
    public void testGetCitiesByNamePrefixRequest() {
        NovaPoshtaSDK.getDictionariesApi()
                .getCities(new GetCitiesRequest(cityNamePrefix))
                .subscribe(new Action1<GetCitiesResponse>() {
                    @Override
                    public void call(GetCitiesResponse response) {
                        Assert.assertNotNull(response);
                        Assert.assertNotNull(response.data);
                        for (GetCitiesResponse.Data data : response.data) {
                            System.out.println("city by name::" + data.Description + "(" + data.DescriptionRu + ")");
                        }
                    }
                });
    }

    @Test
    public void testGetStreetRequest() {
        NovaPoshtaSDK.getDictionariesApi()
                .getStreet(new GetStreetRequest(cityRef, 1))
                .subscribe(new Action1<GetStreetResponse>() {
                    @Override
                    public void call(GetStreetResponse response) {
                        Assert.assertNotNull(response);
                        Assert.assertNotNull(response.data);
                        if (response.data.length > 0) {
                            System.out.println("getStreet with page::" + response.data[0].Description);
                        }
                    }
                });
    }

    @Test
    public void testGetStreetByNamePrefixRequest() {
        NovaPoshtaSDK.getDictionariesApi()
                .getStreet(new GetStreetRequest(cityRef, streetNamePrefix))
                .subscribe(new Action1<GetStreetResponse>() {
                    @Override
                    public void call(GetStreetResponse response) {
                        Assert.assertNotNull(response);
                        Assert.assertNotNull(response.data);
                        if (response.data.length > 0) {
                            System.out.println("getStreet by name prefix::" + response.data[0].Description);
                        }
                    }
                });
    }

    @Test
    public void testGetWarehousesRequest() {
        NovaPoshtaSDK.getDictionariesApi()
                .getWarehouses(new GetWarehousesRequest(cityRef))
                .subscribe(new Action1<GetWarehousesResponse>() {
                    @Override
                    public void call(GetWarehousesResponse response) {
                        Assert.assertNotNull(response);
                        Assert.assertNotNull(response.data);
                        if (response.data.length > 0) {
                            System.out.println("getWarehouse::" + response.data[0].Description);
                        }
                    }
                });
    }

    @Test
    public void testGetWarehouseTypesRequest() {
        NovaPoshtaSDK.getDictionariesApi()
                .getWarehouseTypes(new GetWarehouseTypesRequest())
                .subscribe(new Action1<GetWarehouseTypesResponse>() {
                    @Override
                    public void call(GetWarehouseTypesResponse response) {
                        Assert.assertNotNull(response);
//                            Assert.assertNotNull(response.data);
//                            if (response.data.length > 0) {
//                                System.out.println("getWarehouse::" + response.data[0].Description);
//                            }
                    }
                });
    }
}
