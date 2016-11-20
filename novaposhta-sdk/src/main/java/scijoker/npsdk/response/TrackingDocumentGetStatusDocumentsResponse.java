package scijoker.npsdk.response;

import scijoker.npsdk.common.Base_Response;

/**
 * Created by scijoker on 15.10.16.
 */

public class TrackingDocumentGetStatusDocumentsResponse extends Base_Response {
    public Data[] data;

    public static class Data extends Base_Data {
        public long Number;
        public String DateCreated;
        public double DocumentWeight;
        public double CheckWeight;
        public double DocumentCost;
        public double SumBeforeCheckWeight;
        public String PayerType;
        public String RecipientFullName;
        public String RecipientDateTime;
        public String OwnerDocumentType;
        public String ScheduledDeliveryDate;
        public String PaymentMethod;
        public String CargoDescriptionString;
        public String CargoType;
        public String CitySender;
        public String CityRecipient;
        public String WarehouseRecipient;
        public String CounterpartyType;
        public int Redelivery;
        public String RedeliverySum;
        public String AfterpaymentOnGoodsCost;
        public String ServiceType;
        public String WarehouseRecipientInternetAddressRef;
        public String UndeliveryReasonsSubtypeDescription;
        public int WarehouseRecipientNumber;
        public String LastCreatedOnTheBasisNumber;
        public String LastCreatedOnTheBasisDocumentType;
        public String LastCreatedOnTheBasisPayerType;
        public String LastCreatedOnTheBasisDateTime;
        public String LastTransactionStatusGM;
        public String MarketplacePartnerToken;
        public String ClientBarcode;
        public String SenderAddress;
        public String RecipientAddress;
        public String CounterpartySenderDescription;
        public String CounterpartyRecipientDescription;
        public String CounterpartySenderType;
        public String DateScan;
        public String Status;
        public int StatusCode;
        public BackwardDeliverySubTypesService[] BackwardDeliverySubTypesServices;
        public BackwardDeliverySubTypesAction[] BackwardDeliverySubTypesActions;
        public String UndeliveryReasons;

        static class BackwardDeliverySubTypesService {
        }

        static class BackwardDeliverySubTypesAction {
        }
    }
}