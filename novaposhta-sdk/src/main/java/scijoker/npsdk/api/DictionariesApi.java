package scijoker.npsdk.api;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;
import scijoker.npsdk.request.GetCitiesRequest;
import scijoker.npsdk.request.GetCounterpartiesRequest;
import scijoker.npsdk.request.GetCounterpartyAddressesRequest;
import scijoker.npsdk.request.GetStatusDocumentsRequest;
import scijoker.npsdk.request.GetStreetRequest;
import scijoker.npsdk.request.GetWarehouseTypesRequest;
import scijoker.npsdk.request.GetWarehousesRequest;
import scijoker.npsdk.response.GetCitiesResponse;
import scijoker.npsdk.response.GetCounterpartyAddressesResponse;
import scijoker.npsdk.response.GetCounterpartiesResponse;
import scijoker.npsdk.response.GetStatusDocumentsResponse;
import scijoker.npsdk.response.GetStreetResponse;
import scijoker.npsdk.response.GetWarehouseTypesResponse;
import scijoker.npsdk.response.GetWarehousesResponse;

/**
 * Created by scijoker on 15.10.16.
 */

public interface DictionariesApi {
    @POST("/v2.0/json/")
    Observable<GetStatusDocumentsResponse> getDocumentStatuses(@Body GetStatusDocumentsRequest obj);

    @POST("/v2.0/json/")
    Observable<GetCitiesResponse> getCities(@Body GetCitiesRequest obj);

    @POST("/v2.0/json/")
    Observable<GetStreetResponse> getStreet(@Body GetStreetRequest obj);

    @POST("/v2.0/json/")
    Observable<GetWarehousesResponse> getWarehouses(@Body GetWarehousesRequest obj);

    @POST("/v2.0/json/")
    Observable<GetWarehouseTypesResponse> getWarehouseTypes(@Body GetWarehouseTypesRequest obj);

    @POST("/v2.0/json/")
    Observable<GetCounterpartiesResponse> getCounterparties(@Body GetCounterpartiesRequest obj);

    @POST("/v2.0/json/")
    Observable<GetCounterpartyAddressesResponse> getCounterpartyAddresses(@Body GetCounterpartyAddressesRequest obj);
}
