package scijoker.npsdk.api;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;
import scijoker.npsdk.request.AddressDeleteRequest;
import scijoker.npsdk.request.AddressGetAreasRequest;
import scijoker.npsdk.request.AddressGetCitiesRequest;
import scijoker.npsdk.request.AddressGetStreetRequest;
import scijoker.npsdk.request.AddressGetWarehouseTypesRequest;
import scijoker.npsdk.request.AddressGetWarehousesRequest;
import scijoker.npsdk.request.AddressSaveRequest;
import scijoker.npsdk.request.AddressUpdateRequest;
import scijoker.npsdk.request.CommonGetBackwardDeliveryCargoTypesRequest;
import scijoker.npsdk.request.CommonGetCargoDescriptionListRequest;
import scijoker.npsdk.request.CommonGetCargoTypesRequest;
import scijoker.npsdk.request.CommonGetDocumentStatusesRequest;
import scijoker.npsdk.request.CommonGetOwnershipFormsListRequest;
import scijoker.npsdk.request.CommonGetPalletsListRequest;
import scijoker.npsdk.request.CommonGetPaymentFormsRequest;
import scijoker.npsdk.request.CommonGetServiceTypesRequest;
import scijoker.npsdk.request.CommonGetTimeIntervalsRequest;
import scijoker.npsdk.request.CommonGetTiresWheelsListRequest;
import scijoker.npsdk.request.CommonGetTraysListRequest;
import scijoker.npsdk.request.CommonGetTypesOfCounterpartiesRequest;
import scijoker.npsdk.request.CommonGetTypesOfPayersForRedeliveryRequest;
import scijoker.npsdk.request.CommonGetTypesOfPayersRequest;
import scijoker.npsdk.request.ContactPersonDeleteRequest;
import scijoker.npsdk.request.ContactPersonSaveRequest;
import scijoker.npsdk.request.ContactPersonUpdateRequest;
import scijoker.npsdk.request.CounterpartyDeleteRequest;
import scijoker.npsdk.request.CounterpartyGetCounterpartiesRequest;
import scijoker.npsdk.request.CounterpartyGetCounterpartyAddressesRequest;
import scijoker.npsdk.request.CounterpartyGetCounterpartyContactPersonsRequest;
import scijoker.npsdk.request.CounterpartyGetCounterpartyOptionsRequest;
import scijoker.npsdk.request.CounterpartySaveRequest;
import scijoker.npsdk.request.CounterpartyUpdateRequest;
import scijoker.npsdk.request.InternetDocumentSaveRequest;
import scijoker.npsdk.request.TrackingDocumentGetStatusDocumentsRequest;
import scijoker.npsdk.response.AddressDeleteResponse;
import scijoker.npsdk.response.AddressGetAreasResponse;
import scijoker.npsdk.response.AddressGetCitiesResponse;
import scijoker.npsdk.response.AddressGetStreetResponse;
import scijoker.npsdk.response.AddressGetWarehouseTypesResponse;
import scijoker.npsdk.response.AddressGetWarehousesResponse;
import scijoker.npsdk.response.AddressSaveResponse;
import scijoker.npsdk.response.AddressUpdateResponse;
import scijoker.npsdk.response.CommonGetBackwardDeliveryCargoTypesResponse;
import scijoker.npsdk.response.CommonGetCargoDescriptionListResponse;
import scijoker.npsdk.response.CommonGetCargoTypesResponse;
import scijoker.npsdk.response.CommonGetDocumentStatusesResponse;
import scijoker.npsdk.response.CommonGetOwnershipFormsListResponse;
import scijoker.npsdk.response.CommonGetPalletsListResponse;
import scijoker.npsdk.response.CommonGetPaymentFormsResponse;
import scijoker.npsdk.response.CommonGetServiceTypesResponse;
import scijoker.npsdk.response.CommonGetTimeIntervalsResponse;
import scijoker.npsdk.response.CommonGetTiresWheelsListResponse;
import scijoker.npsdk.response.CommonGetTraysListResponse;
import scijoker.npsdk.response.CommonGetTypesOfCounterpartiesResponse;
import scijoker.npsdk.response.CommonGetTypesOfPayersForRedeliveryResponse;
import scijoker.npsdk.response.CommonGetTypesOfPayersResponse;
import scijoker.npsdk.response.ContactPersonDeleteResponse;
import scijoker.npsdk.response.ContactPersonSaveResponse;
import scijoker.npsdk.response.ContactPersonUpdateResponse;
import scijoker.npsdk.response.CounterpartyDeleteResponse;
import scijoker.npsdk.response.CounterpartyGetCounterpartiesResponse;
import scijoker.npsdk.response.CounterpartyGetCounterpartyAddressesResponse;
import scijoker.npsdk.response.CounterpartyGetCounterpartyContactPersonsResponse;
import scijoker.npsdk.response.CounterpartyGetCounterpartyOptionsResponse;
import scijoker.npsdk.response.CounterpartySaveResponse;
import scijoker.npsdk.response.CounterpartyUpdateResponse;
import scijoker.npsdk.response.InternetDocumentSaveResponse;
import scijoker.npsdk.response.TrackingDocumentGetStatusDocumentsResponse;

/**
 * Created by scijoker on 15.10.16.
 */

public interface DictionariesApi {
    @POST("/v2.0/json/")
    Observable<TrackingDocumentGetStatusDocumentsResponse> getTrackingDocumentStatuses(@Body TrackingDocumentGetStatusDocumentsRequest obj);

    @POST("/v2.0/json/")
    Observable<AddressGetCitiesResponse> getCities(@Body AddressGetCitiesRequest obj);

    @POST("/v2.0/json/")
    Observable<AddressGetStreetResponse> getStreet(@Body AddressGetStreetRequest obj);

    @POST("/v2.0/json/")
    Observable<AddressGetWarehousesResponse> getWarehouses(@Body AddressGetWarehousesRequest obj);

    @POST("/v2.0/json/")
    Observable<AddressGetWarehouseTypesResponse> getWarehouseTypes(@Body AddressGetWarehouseTypesRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartyGetCounterpartiesResponse> getCounterparties(@Body CounterpartyGetCounterpartiesRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartyGetCounterpartyAddressesResponse> getCounterpartyAddresses(@Body CounterpartyGetCounterpartyAddressesRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartyGetCounterpartyContactPersonsResponse> getCounterpartyContactPersons(@Body CounterpartyGetCounterpartyContactPersonsRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetTypesOfPayersResponse> getTypesOfPayers(@Body CommonGetTypesOfPayersRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetPaymentFormsResponse> getPaymentForms(@Body CommonGetPaymentFormsRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetCargoTypesResponse> getCargoTypes(@Body CommonGetCargoTypesRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetServiceTypesResponse> getServiceTypes(@Body CommonGetServiceTypesRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetCargoDescriptionListResponse> getCargoDescriptionList(@Body CommonGetCargoDescriptionListRequest obj);

    @POST("/v2.0/json/")
    Observable<AddressGetAreasResponse> getAreas(@Body AddressGetAreasRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetOwnershipFormsListResponse> getOwnershipFormsList(@Body CommonGetOwnershipFormsListRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetBackwardDeliveryCargoTypesResponse> getBackwardDeliveryCargoTypes(@Body CommonGetBackwardDeliveryCargoTypesRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetPalletsListResponse> getPalletsList(@Body CommonGetPalletsListRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetTypesOfPayersForRedeliveryResponse> getTypesOfPayersForRedelivery(@Body CommonGetTypesOfPayersForRedeliveryRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetTimeIntervalsResponse> getTimeIntervals(@Body CommonGetTimeIntervalsRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetTiresWheelsListResponse> getTiresWheelsList(@Body CommonGetTiresWheelsListRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetTraysListResponse> getTraysList(@Body CommonGetTraysListRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetTypesOfCounterpartiesResponse> getTypesOfCounterparties(@Body CommonGetTypesOfCounterpartiesRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetDocumentStatusesResponse> getDocumentStatuses(@Body CommonGetDocumentStatusesRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartySaveResponse> saveCounterparty(@Body CounterpartySaveRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartyUpdateResponse> updateCounterparty(@Body CounterpartyUpdateRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartyDeleteResponse> deleteCounterparty(@Body CounterpartyDeleteRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartyGetCounterpartyOptionsResponse> getCounterpartyOptions(@Body CounterpartyGetCounterpartyOptionsRequest obj);

    @POST("/v2.0/json/")
    Observable<AddressSaveResponse> saveAddress(@Body AddressSaveRequest obj);

    @POST("/v2.0/json/")
    Observable<AddressUpdateResponse> updateAddress(@Body AddressUpdateRequest obj);

    @POST("/v2.0/json/")
    Observable<AddressDeleteResponse> deleteAddress(@Body AddressDeleteRequest obj);

    @POST("/v2.0/json/")
    Observable<ContactPersonSaveResponse> saveContactPerson(@Body ContactPersonSaveRequest obj);

    @POST("/v2.0/json/")
    Observable<ContactPersonUpdateResponse> updateContactPerson(@Body ContactPersonUpdateRequest obj);

    @POST("/v2.0/json/")
    Observable<ContactPersonDeleteResponse> deleteContactPerson(@Body ContactPersonDeleteRequest obj);

    @POST("/v2.0/json/")
    Observable<InternetDocumentSaveResponse> saveInternetDocument(@Body InternetDocumentSaveRequest obj);
}