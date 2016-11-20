package ablack13.npsdk;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;
import ablack13.npsdk.request.AddressDeleteRequest;
import ablack13.npsdk.request.AddressGetAreasRequest;
import ablack13.npsdk.request.AddressGetCitiesRequest;
import ablack13.npsdk.request.AddressGetStreetRequest;
import ablack13.npsdk.request.AddressGetWarehouseTypesRequest;
import ablack13.npsdk.request.AddressGetWarehousesRequest;
import ablack13.npsdk.request.AddressSaveRequest;
import ablack13.npsdk.request.AddressUpdateRequest;
import ablack13.npsdk.request.CommonGetBackwardDeliveryCargoTypesRequest;
import ablack13.npsdk.request.CommonGetCargoDescriptionListRequest;
import ablack13.npsdk.request.CommonGetCargoTypesRequest;
import ablack13.npsdk.request.CommonGetDocumentStatusesRequest;
import ablack13.npsdk.request.CommonGetOwnershipFormsListRequest;
import ablack13.npsdk.request.CommonGetPalletsListRequest;
import ablack13.npsdk.request.CommonGetPaymentFormsRequest;
import ablack13.npsdk.request.CommonGetServiceTypesRequest;
import ablack13.npsdk.request.CommonGetTimeIntervalsRequest;
import ablack13.npsdk.request.CommonGetTiresWheelsListRequest;
import ablack13.npsdk.request.CommonGetTraysListRequest;
import ablack13.npsdk.request.CommonGetTypesOfCounterpartiesRequest;
import ablack13.npsdk.request.CommonGetTypesOfPayersForRedeliveryRequest;
import ablack13.npsdk.request.CommonGetTypesOfPayersRequest;
import ablack13.npsdk.request.ContactPersonDeleteRequest;
import ablack13.npsdk.request.ContactPersonSaveRequest;
import ablack13.npsdk.request.ContactPersonUpdateRequest;
import ablack13.npsdk.request.CounterpartyDeleteRequest;
import ablack13.npsdk.request.CounterpartyGetCounterpartiesRequest;
import ablack13.npsdk.request.CounterpartyGetCounterpartyAddressesRequest;
import ablack13.npsdk.request.CounterpartyGetCounterpartyContactPersonsRequest;
import ablack13.npsdk.request.CounterpartyGetCounterpartyOptionsRequest;
import ablack13.npsdk.request.CounterpartySaveRequest;
import ablack13.npsdk.request.CounterpartyUpdateRequest;
import ablack13.npsdk.request.InternetDocumentSaveRequest;
import ablack13.npsdk.request.TrackingDocumentGetStatusDocumentsRequest;
import ablack13.npsdk.response.AddressDeleteResponse;
import ablack13.npsdk.response.AddressGetAreasResponse;
import ablack13.npsdk.response.AddressGetCitiesResponse;
import ablack13.npsdk.response.AddressGetStreetResponse;
import ablack13.npsdk.response.AddressGetWarehouseTypesResponse;
import ablack13.npsdk.response.AddressGetWarehousesResponse;
import ablack13.npsdk.response.AddressSaveResponse;
import ablack13.npsdk.response.AddressUpdateResponse;
import ablack13.npsdk.response.CommonGetBackwardDeliveryCargoTypesResponse;
import ablack13.npsdk.response.CommonGetCargoDescriptionListResponse;
import ablack13.npsdk.response.CommonGetCargoTypesResponse;
import ablack13.npsdk.response.CommonGetDocumentStatusesResponse;
import ablack13.npsdk.response.CommonGetOwnershipFormsListResponse;
import ablack13.npsdk.response.CommonGetPalletsListResponse;
import ablack13.npsdk.response.CommonGetPaymentFormsResponse;
import ablack13.npsdk.response.CommonGetServiceTypesResponse;
import ablack13.npsdk.response.CommonGetTimeIntervalsResponse;
import ablack13.npsdk.response.CommonGetTiresWheelsListResponse;
import ablack13.npsdk.response.CommonGetTraysListResponse;
import ablack13.npsdk.response.CommonGetTypesOfCounterpartiesResponse;
import ablack13.npsdk.response.CommonGetTypesOfPayersForRedeliveryResponse;
import ablack13.npsdk.response.CommonGetTypesOfPayersResponse;
import ablack13.npsdk.response.ContactPersonDeleteResponse;
import ablack13.npsdk.response.ContactPersonSaveResponse;
import ablack13.npsdk.response.ContactPersonUpdateResponse;
import ablack13.npsdk.response.CounterpartyDeleteResponse;
import ablack13.npsdk.response.CounterpartyGetCounterpartiesResponse;
import ablack13.npsdk.response.CounterpartyGetCounterpartyAddressesResponse;
import ablack13.npsdk.response.CounterpartyGetCounterpartyContactPersonsResponse;
import ablack13.npsdk.response.CounterpartyGetCounterpartyOptionsResponse;
import ablack13.npsdk.response.CounterpartySaveResponse;
import ablack13.npsdk.response.CounterpartyUpdateResponse;
import ablack13.npsdk.response.InternetDocumentSaveResponse;
import ablack13.npsdk.response.TrackingDocumentGetStatusDocumentsResponse;

/**
 * Created by scijoker on 20.11.16.
 */

public interface Api {
    @POST("/v2.0/json/")
    Observable<CommonGetTypesOfPayersResponse> getCommonTypesOfPayers(@Body CommonGetTypesOfPayersRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetPaymentFormsResponse> getCommonPaymentForms(@Body CommonGetPaymentFormsRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetCargoTypesResponse> getCommonCargoTypes(@Body CommonGetCargoTypesRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetServiceTypesResponse> getCommonServiceTypes(@Body CommonGetServiceTypesRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetCargoDescriptionListResponse> getCommonCargoDescriptionList(@Body CommonGetCargoDescriptionListRequest obj);

    @POST("/v2.0/json/")
    Observable<TrackingDocumentGetStatusDocumentsResponse> getTrackingDocumentStatuses(@Body TrackingDocumentGetStatusDocumentsRequest obj);

    @POST("/v2.0/json/")
    Observable<AddressGetCitiesResponse> getAddressCities(@Body AddressGetCitiesRequest obj);

    @POST("/v2.0/json/")
    Observable<AddressGetStreetResponse> getAddressStreet(@Body AddressGetStreetRequest obj);

    @POST("/v2.0/json/")
    Observable<AddressGetWarehousesResponse> getAddressWarehouses(@Body AddressGetWarehousesRequest obj);

    @POST("/v2.0/json/")
    Observable<AddressGetWarehouseTypesResponse> getAddressWarehouseTypes(@Body AddressGetWarehouseTypesRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartyGetCounterpartiesResponse> getCounterpartyCounterparties(@Body CounterpartyGetCounterpartiesRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartyGetCounterpartyAddressesResponse> getCounterpartyAddressesForCounterparty(@Body CounterpartyGetCounterpartyAddressesRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartyGetCounterpartyContactPersonsResponse> getCounterpartyContactPersonsForCounterparty(@Body CounterpartyGetCounterpartyContactPersonsRequest obj);

    @POST("/v2.0/json/")
    Observable<AddressGetAreasResponse> getAddressAreas(@Body AddressGetAreasRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetOwnershipFormsListResponse> getCommonOwnershipFormsList(@Body CommonGetOwnershipFormsListRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetBackwardDeliveryCargoTypesResponse> getCommonBackwardDeliveryCargoTypes(@Body CommonGetBackwardDeliveryCargoTypesRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetPalletsListResponse> getCommonPalletsList(@Body CommonGetPalletsListRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetTypesOfPayersForRedeliveryResponse> getCommonTypesOfPayersForRedelivery(@Body CommonGetTypesOfPayersForRedeliveryRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetTimeIntervalsResponse> getCommonTimeIntervals(@Body CommonGetTimeIntervalsRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetTiresWheelsListResponse> getCommonTiresWheelsList(@Body CommonGetTiresWheelsListRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetTraysListResponse> getCommonTraysList(@Body CommonGetTraysListRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetTypesOfCounterpartiesResponse> getCommonTypesOfCounterparties(@Body CommonGetTypesOfCounterpartiesRequest obj);

    @POST("/v2.0/json/")
    Observable<CommonGetDocumentStatusesResponse> getCommonDocumentStatuses(@Body CommonGetDocumentStatusesRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartySaveResponse> saveCounterparty(@Body CounterpartySaveRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartyUpdateResponse> updateCounterparty(@Body CounterpartyUpdateRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartyDeleteResponse> deleteCounterparty(@Body CounterpartyDeleteRequest obj);

    @POST("/v2.0/json/")
    Observable<CounterpartyGetCounterpartyOptionsResponse> getCounterpartyOptionsForCounterparty(@Body CounterpartyGetCounterpartyOptionsRequest obj);

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
