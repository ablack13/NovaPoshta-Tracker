package scijoker.nptracker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import rx.functions.Action1;
import scijoker.npsdk.NovaPoshtaSDK;
import scijoker.npsdk.request.AddressGetCitiesRequest;
import scijoker.npsdk.request.CounterpartyGetCounterpartiesRequest;
import scijoker.npsdk.request.CounterpartyGetCounterpartyAddressesRequest;
import scijoker.npsdk.request.TrackingDocumentGetStatusDocumentsRequest;
import scijoker.npsdk.request.AddressGetStreetRequest;
import scijoker.npsdk.request.AddressGetWarehouseTypesRequest;
import scijoker.npsdk.request.AddressGetWarehousesRequest;
import scijoker.npsdk.response.AddressGetCitiesResponse;
import scijoker.npsdk.response.CounterpartyGetCounterpartiesResponse;
import scijoker.npsdk.response.CounterpartyGetCounterpartyAddressesResponse;
import scijoker.npsdk.response.TrackingDocumentGetStatusDocumentsResponse;
import scijoker.npsdk.response.AddressGetStreetResponse;
import scijoker.npsdk.response.AddressGetWarehouseTypesResponse;
import scijoker.npsdk.response.AddressGetWarehousesResponse;
import scijoker.nptracker.net.ApiConstants;

/**
 * Created by scijoker on 15.10.16.
 */

public class DictionariesApiRequestTest {
    private String phone = "123456789"; //format 38xxxxxxxxxx
    private String ttn = "20450017510673";
    private String cityNamePrefix = "Івано-";
    private String cityRef = "db5c8904-391c-11dd-90d9-001a92567626";//Ivano-Frankivsk,UA
    private String conterpartyRef = "3a62aafd-92a3-11e6-a54a-005056801333";
    private String streetNamePrefix = "Заліз";
    private String descriptionNamePrefix = "Прив";

    @Before
    public void setUp() throws Exception {
        NovaPoshtaSDK.setup(ApiConstants.API_KEY, true);
    }

    @Test
    public void testGetDocumentStatusesRequest() {
        NovaPoshtaSDK.getDictionariesApi()
                .getTrackingDocumentStatuses(new TrackingDocumentGetStatusDocumentsRequest(phone, ttn))
                .subscribe(new Action1<TrackingDocumentGetStatusDocumentsResponse>() {
                    @Override
                    public void call(TrackingDocumentGetStatusDocumentsResponse response) {
                        Assert.assertNotNull(response);
                        Assert.assertNotNull(response.data);
                        for (TrackingDocumentGetStatusDocumentsResponse.Data data : response.data) {
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
                .getCities(new AddressGetCitiesRequest())
                .subscribe(new Action1<AddressGetCitiesResponse>() {
                    @Override
                    public void call(AddressGetCitiesResponse response) {
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
                .getCities(new AddressGetCitiesRequest(cityNamePrefix))
                .subscribe(new Action1<AddressGetCitiesResponse>() {
                    @Override
                    public void call(AddressGetCitiesResponse response) {
                        Assert.assertNotNull(response);
                        Assert.assertNotNull(response.data);
                        for (AddressGetCitiesResponse.Data data : response.data) {
                            System.out.println("city by name::" + data.Description + "(" + data.DescriptionRu + ")");
                        }
                    }
                });
    }

    @Test
    public void testGetStreetRequest() {
        NovaPoshtaSDK.getDictionariesApi()
                .getStreet(new AddressGetStreetRequest(cityRef, 1))
                .subscribe(new Action1<AddressGetStreetResponse>() {
                    @Override
                    public void call(AddressGetStreetResponse response) {
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
                .getStreet(new AddressGetStreetRequest(cityRef, streetNamePrefix))
                .subscribe(new Action1<AddressGetStreetResponse>() {
                    @Override
                    public void call(AddressGetStreetResponse response) {
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
                .getWarehouses(new AddressGetWarehousesRequest(cityRef))
                .subscribe(new Action1<AddressGetWarehousesResponse>() {
                    @Override
                    public void call(AddressGetWarehousesResponse response) {
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
                .getWarehouseTypes(new AddressGetWarehouseTypesRequest())
                .subscribe(new Action1<AddressGetWarehouseTypesResponse>() {
                    @Override
                    public void call(AddressGetWarehouseTypesResponse response) {
                        Assert.assertNotNull(response);
//                            Assert.assertNotNull(response.data);
//                            if (response.data.length > 0) {
//                                System.out.println("getWarehouse::" + response.data[0].Description);
//                            }
                    }
                });
    }

    @Test
    public void testGetCounterpartiesRequest() {
        NovaPoshtaSDK.getDictionariesApi()
                .getCounterparties(new CounterpartyGetCounterpartiesRequest(false, 1))
                .subscribe(new Action1<CounterpartyGetCounterpartiesResponse>() {
                    @Override
                    public void call(CounterpartyGetCounterpartiesResponse response) {
                        Assert.assertNotNull(response);
                        Assert.assertNotNull(response.data);
                        if (response.data.length > 0) {
                            System.out.println("getCounterparties::" + response.data[0].Description);
                        }
                    }
                });
    }

    @Test
    public void testGetCounterpartiesWithDescriptionNamePrefixRequest() {
        NovaPoshtaSDK.getDictionariesApi()
                .getCounterparties(new CounterpartyGetCounterpartiesRequest(false, descriptionNamePrefix))
                .subscribe(new Action1<CounterpartyGetCounterpartiesResponse>() {
                    @Override
                    public void call(CounterpartyGetCounterpartiesResponse response) {
                        Assert.assertNotNull(response);
                        Assert.assertNotNull(response.data);
                        if (response.data.length > 0) {
                            System.out.println("getCounterparties::" + response.data[0].Description);
                        }
                    }
                });
    }

    @Test
    public void testGetCounterpartyAddressesRequest() {
        NovaPoshtaSDK.getDictionariesApi()
                .getCounterpartyAddresses(new CounterpartyGetCounterpartyAddressesRequest(false, conterpartyRef))
                .subscribe(new Action1<CounterpartyGetCounterpartyAddressesResponse>() {
                    @Override
                    public void call(CounterpartyGetCounterpartyAddressesResponse response) {
                        Assert.assertNotNull(response);
                        Assert.assertNotNull(response.data);
                        if (response.data.length > 0) {
                            System.out.println("testGetCounterpartyAddressesRequest::" + response.data[0].Description);
                        }
                    }
                });
    }
}