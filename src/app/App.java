package app;

import com.ups.wsdl.xoltws.ship.v1.ShipPortType;
import com.ups.wsdl.xoltws.ship.v1.ShipService;
import com.ups.xmlschema.xoltws.common.v1.RequestType;
import com.ups.xmlschema.xoltws.common.v1.TransactionReferenceType;
import com.ups.xmlschema.xoltws.ship.v1.BillShipperType;
import com.ups.xmlschema.xoltws.ship.v1.DimensionsType;
import com.ups.xmlschema.xoltws.ship.v1.LabelImageFormatType;
import com.ups.xmlschema.xoltws.ship.v1.LabelSpecificationType;
import com.ups.xmlschema.xoltws.ship.v1.PackageType;
import com.ups.xmlschema.xoltws.ship.v1.PackageWeightType;
import com.ups.xmlschema.xoltws.ship.v1.PackagingType;
import com.ups.xmlschema.xoltws.ship.v1.PaymentInfoType;
import com.ups.xmlschema.xoltws.ship.v1.ServiceType;
import com.ups.xmlschema.xoltws.ship.v1.ShipAddressType;
import com.ups.xmlschema.xoltws.ship.v1.ShipFromType;
import com.ups.xmlschema.xoltws.ship.v1.ShipPhoneType;
import com.ups.xmlschema.xoltws.ship.v1.ShipToAddressType;
import com.ups.xmlschema.xoltws.ship.v1.ShipToType;
import com.ups.xmlschema.xoltws.ship.v1.ShipUnitOfMeasurementType;
import com.ups.xmlschema.xoltws.ship.v1.ShipmentChargeType;
import com.ups.xmlschema.xoltws.ship.v1.ShipmentRequest;
import com.ups.xmlschema.xoltws.ship.v1.ShipmentResponse;
import com.ups.xmlschema.xoltws.ship.v1.ShipmentType;
import com.ups.xmlschema.xoltws.ship.v1.ShipperType;
import com.ups.xmlschema.xoltws.upss.v1.UPSSecurity;
import com.ups.xmlschema.xoltws.upss.v1.UPSSecurity.ServiceAccessToken;
import com.ups.xmlschema.xoltws.upss.v1.UPSSecurity.UsernameToken;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello Java");
    ShipService shipService = new ShipService();
    ShipPortType shipPortType = shipService.getShipPort();
    ShipmentRequest shipmentRequest = createShipmentRequest();
    UPSSecurity upsSecurity = createUpsSecurity();
    ShipmentResponse shipmentResponse = shipPortType.processShipment(shipmentRequest, upsSecurity);
    System.out.println(shipmentResponse);
  }

  private static UPSSecurity createUpsSecurity() {
    UPSSecurity upsSecurity = new UPSSecurity();
    UsernameToken usernameToken = new UsernameToken();
    usernameToken.setUsername("csctwx");
    usernameToken.setPassword("Earth2016!");
    upsSecurity.setUsernameToken(usernameToken);
    ServiceAccessToken serviceAccessToken = new ServiceAccessToken();
    serviceAccessToken.setAccessLicenseNumber("6D0F80AD39180658");
    upsSecurity.setServiceAccessToken(serviceAccessToken);
    
    return upsSecurity;
  }

  private static ShipmentRequest createShipmentRequest() {
    ShipmentRequest shipmentRequest = new ShipmentRequest();

    LabelSpecificationType labelSpecification = new LabelSpecificationType();
    LabelImageFormatType labelImageFormat = new LabelImageFormatType();
    labelImageFormat.setCode("GIF");
    labelImageFormat.setDescription("GIF");
    labelSpecification.setLabelImageFormat(labelImageFormat);
    shipmentRequest.setLabelSpecification(labelSpecification);

    RequestType request = new RequestType();
    TransactionReferenceType transactionReference = new TransactionReferenceType();
    transactionReference.setCustomerContext("Customer Context");
    request.setTransactionReference(transactionReference);
    shipmentRequest.setRequest(request);

    ShipmentType shipment = createShipment();
    shipmentRequest.setShipment(shipment);
    return shipmentRequest;
  }

  private static ShipmentType createShipment() {
    ShipmentType shipment = new ShipmentType();

    shipment.setDescription("Shipment Description");

    ShipperType shipper = new ShipperType();
    shipper.setName("Mr. UPS");
    shipper.setAttentionName("Shipper Attn Name");
    shipper.setTaxIdentificationNumber("123456");
    ShipPhoneType phone = new ShipPhoneType();
    phone.setNumber("1234567890");
    phone.setExtension("1");
    shipper.setPhone(phone);
    shipper.setShipperNumber("Your Shipper Number");
    shipper.setFaxNumber("1234567890");
    // Set Address
    ShipAddressType shipAddress = new ShipAddressType();
    shipAddress.getAddressLine().add("2920 Zoo Drive");
    shipAddress.setCity("San Diego");
    shipAddress.setStateProvinceCode("CA");
    shipAddress.setCity("92101");
    shipAddress.setPostalCode("US");
    shipper.setAddress(shipAddress);
    shipment.setShipper(shipper);

    ShipToType shipTo = new ShipToType();
    shipTo.setName("SIMON WANG");
    shipTo.setAttentionName("ShipTo Attn Name");
    ShipToAddressType shipToAddress = new ShipToAddressType();
    shipToAddress.getAddressLine().add("3267 Boulevard des Laurentides");
    shipToAddress.setCity("Montreal");
    shipToAddress.setStateProvinceCode("QC");
    shipToAddress.setCity("H7G2T7");
    shipToAddress.setPostalCode("CA");
    shipTo.setAddress(shipToAddress);
    ShipPhoneType toPhone = new ShipPhoneType();
    toPhone.setNumber("1234567890");
    shipTo.setPhone(toPhone);
    shipment.setShipTo(shipTo);

    ShipFromType shipFrom = new ShipFromType();
    shipFrom.setName("Mr. UPS");
    shipFrom.setAttentionName("ShipFrom Attn Name");
    ShipAddressType shipFromAddress = new ShipAddressType();
    shipFromAddress.getAddressLine().add("2920 Zoo Drive");
    shipFromAddress.setCity("San Diego");
    shipFromAddress.setStateProvinceCode("CA");
    shipFromAddress.setCity("92101");
    shipFromAddress.setPostalCode("US");
    shipFrom.setAddress(shipFromAddress);
    shipFrom.setFaxNumber("1234567890");
    shipment.setShipFrom(shipFrom);

    PaymentInfoType paymentInfo = new PaymentInfoType();
    ShipmentChargeType shipmentCharge = new ShipmentChargeType();
    shipmentCharge.setType("01");
    BillShipperType billShipper = new BillShipperType();
    billShipper.setAccountNumber("123456");
    shipmentCharge.setBillShipper(billShipper);
    paymentInfo.getShipmentCharge().add(shipmentCharge);
    shipment.setPaymentInformation(paymentInfo);

    ServiceType service = new ServiceType();
    service.setCode("02");
    service.setDescription("service 02");
    shipment.setService(service);
    PackageType mypackage = createPackage();
    shipment.getPackage().add(mypackage);

    return shipment;
  }

  private static PackageType createPackage() {
    PackageType mypackage = new PackageType();
    mypackage.setDescription("Package Desc");
    PackagingType packaging = new PackagingType();
    packaging.setCode("02");
    packaging.setDescription("Packaging Desc");
    mypackage.setPackaging(packaging);
    DimensionsType dimensions = new DimensionsType();
    ShipUnitOfMeasurementType shipUnitOfMeasurement = new ShipUnitOfMeasurementType();
    shipUnitOfMeasurement.setCode("IN");
    shipUnitOfMeasurement.setDescription("Inches");
    dimensions.setUnitOfMeasurement(shipUnitOfMeasurement);
    dimensions.setLength("7");
    dimensions.setWidth("5");
    dimensions.setHeight("2");
    mypackage.setDimensions(dimensions);
    PackageWeightType packageWeight = new PackageWeightType();
    ShipUnitOfMeasurementType weightUnitOfMeasurement = new ShipUnitOfMeasurementType();
    weightUnitOfMeasurement.setCode("LBS");
    weightUnitOfMeasurement.setDescription("Pounds");
    packageWeight.setUnitOfMeasurement(weightUnitOfMeasurement);
    packageWeight.setWeight("10");
    mypackage.setPackageWeight(packageWeight);
    return mypackage;
  }
}
