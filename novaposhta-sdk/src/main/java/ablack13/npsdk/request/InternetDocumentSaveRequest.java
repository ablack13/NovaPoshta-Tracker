package ablack13.npsdk.request;

import ablack13.npsdk.common.Base_Request;

/**
 * Created by scijoker on 20.11.16.
 */

public class InternetDocumentSaveRequest extends Base_Request {
    public InternetDocumentSaveRequest(String payerType, String paymentMethod, String dateTime, String cargoType, double volumeGeneral, double weight, String serviceType, int seatsAmount, String description, double cost, String citySender, String sender, String senderAddress, String contactSender, String sendersPhone, String cityRecipient, String recipient, String recipientAddress, String contactRecipient, String recipientsPhone) {
        super("InternetDocument", "save", new MethodProperties(payerType, paymentMethod, dateTime, cargoType, volumeGeneral, weight, serviceType, seatsAmount, description, cost, citySender, sender, senderAddress, contactSender, sendersPhone, cityRecipient, recipient, recipientAddress, contactRecipient, recipientsPhone));
    }

    private static class MethodProperties extends Base_MethodProperties {
        private String PayerType;
        private String PaymentMethod;
        private String DateTime;
        private String CargoType;
        private double VolumeGeneral;
        private double Weight;
        private String ServiceType;
        private int SeatsAmount;
        private String Description;
        private double Cost;
        private String CitySender;
        private String Sender;
        private String SenderAddress;
        private String ContactSender;
        private String SendersPhone;
        private String CityRecipient;
        private String Recipient;
        private String RecipientAddress;
        private String ContactRecipient;
        private String RecipientsPhone;
        private OptionSeat[] OptionSeats;

        public MethodProperties(String payerType, String paymentMethod, String dateTime, String cargoType, double volumeGeneral, double weight, String serviceType, int seatsAmount, String description, double cost, String citySender, String sender, String senderAddress, String contactSender, String sendersPhone, String cityRecipient, String recipient, String recipientAddress, String contactRecipient, String recipientsPhone) {
            this(payerType, paymentMethod, dateTime, cargoType, volumeGeneral, weight, serviceType, seatsAmount, description, cost, citySender, sender, senderAddress, contactSender, sendersPhone, cityRecipient, recipient, recipientAddress, contactRecipient, recipientsPhone, -1, -1, -1, -1, -1);
        }

        public MethodProperties(String payerType, String paymentMethod, String dateTime, String cargoType, double volumeGeneral, double weight, String serviceType, int seatsAmount, String description, double cost, String citySender, String sender, String senderAddress, String contactSender, String sendersPhone, String cityRecipient, String recipient, String recipientAddress, String contactRecipient, String recipientsPhone, double optionSeatVolumetricVolume, double optionSeatVolumetricWidth, double optionSeatVolumetricLength, double optionSeatVolumetricHeight, double optionSeatWeight) {
            PayerType = payerType;
            PaymentMethod = paymentMethod;
            DateTime = dateTime;
            CargoType = cargoType;
            VolumeGeneral = volumeGeneral;
            Weight = weight;
            ServiceType = serviceType;
            SeatsAmount = seatsAmount;
            Description = description;
            Cost = cost;
            CitySender = citySender;
            Sender = sender;
            SenderAddress = senderAddress;
            ContactSender = contactSender;
            SendersPhone = sendersPhone;
            CityRecipient = cityRecipient;
            Recipient = recipient;
            RecipientAddress = recipientAddress;
            ContactRecipient = contactRecipient;
            RecipientsPhone = recipientsPhone;
            if (optionSeatVolumetricVolume != -1
                    && optionSeatVolumetricWidth != -1
                    && optionSeatVolumetricLength != -1
                    && optionSeatVolumetricHeight != -1
                    && optionSeatWeight != -1) {
                OptionSeats = new OptionSeat[]{new OptionSeat(optionSeatVolumetricVolume, optionSeatVolumetricWidth, optionSeatVolumetricLength, optionSeatVolumetricHeight, optionSeatWeight)};
            }
        }

        private static class OptionSeat {
            private double volumetricVolume;
            private double volumetricWidth;
            private double volumetricLength;
            private double volumetricHeight;
            private double weight;

            public OptionSeat(double optionSeatVolumetricVolume, double optionSeatVolumetricWidth, double optionSeatVolumetricLength, double optionSeatVolumetricHeight, double optionSeatWeight) {
                this.volumetricVolume = optionSeatVolumetricVolume;
                this.volumetricWidth = optionSeatVolumetricWidth;
                this.volumetricLength = optionSeatVolumetricLength;
                this.volumetricHeight = optionSeatVolumetricHeight;
                this.weight = optionSeatWeight;
            }
        }
    }
}
