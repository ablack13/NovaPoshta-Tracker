package ablack13.npsdk.response;

import ablack13.npsdk.common.Base_Response;

/**
 * Created by scijoker on 20.11.16.
 */

public class CounterpartyGetCounterpartyOptionsResponse extends Base_Response {
    public Data[] data;

    public static class Data extends Base_Data {
        public boolean CanPayTheThirdPerson;
        public boolean CanAfterpaymentOnGoodsCost;
        public boolean CanNonCashPayment;
        public boolean CanCreditDocuments;
        public boolean HideDeliveryCost;
        public boolean CanSameDayDelivery;
        public boolean CanForwardingService;
        public boolean DeliveryByHand;
        public boolean DescentFromFloor;
        public boolean BackDeliveryValuablePapers;
        public boolean BackwardDeliverySubtypesDocuments;
        public String AfterpaymentType;
        public boolean HaveMoneyWallets;
    }
}
