package pl.sda.view;

import pl.sda.Model.Address;
import pl.sda.Model.Customer;
import pl.sda.Model.ParcelInfo;
import pl.sda.controller.MainMenuController;
import pl.sda.repository.ParcelRepository;
import pl.sda.service.ParcelService;
import pl.sda.utils.ScannerOperationValidator;

import java.util.Scanner;

public class MainMenuView {

  private MainMenuController controller;

  public MainMenuView(){
    controller = new MainMenuController(this, new ParcelService(new ParcelRepository()));
    init();
  }

  public void init(){
    System.out.println("-----------------------------------");
    System.out.println("|                                 |");
    System.out.println("|        Postal System            |");
    System.out.println("|                                 |");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.println("Witaj, wybierz jedną z opcji.");
    System.out.println();

    Scanner keyboard = new Scanner(System.in);

    while(true){
      System.out.println();
      System.out.println();
      System.out.println("1. Nadaj przesyłkę od klienta.");
      System.out.println("2. Wydaj przesyłkę klientowi.");
      System.out.println("3. Przekaż przesyłkę do następnej lokalizacji.");
      System.out.println("4. Sprawdź status przesyłki.");
      String inputValue = keyboard.next();
      if (ScannerOperationValidator.validValue(inputValue)) {
        executeOperation(Integer.valueOf(inputValue));
      } else {
        System.out.println("Niepoprawna operacja, wybierz ponownie:");
      }
    }
  }

  private void executeOperation(Integer operationValue) {
    switch (operationValue) {
      case 1: {
        sendParcel();
        break;
      }
      case 2: {
        releaseParcel();
        break;
      }
      case 3: {
        changeParcelLocation();
        break;
      }
      case 4: {
        checkParcelStatus();
        break;
      }
    }
  }

  private void sendParcel() {
    ParcelInfo parcelInfo = new ParcelInfo();
    //TODO: Pobierz od użytkownika informacje o przesyłce.
    Customer shipper = new Customer();
    shipper.setName("jan");
    shipper.setLastName("kowalski");

    Address shipmentAddress = new Address();
    shipmentAddress.setCity("Szczecin");
    shipmentAddress.setStreet("zbożowa");
    shipmentAddress.setZipCode("71-123");

    shipper.setAddress(shipmentAddress);

    Customer receiver = new Customer();
    receiver.setName("adam");
    receiver.setLastName("nowak");

    Address receiverAddres = new Address();
    receiverAddres.setCity("warszawa");
    receiverAddres.setStreet("Jagiellońska");
    receiverAddres.setZipCode("00-950");

    receiver.setAddress(receiverAddres);


    parcelInfo.setShipper(shipper);
    parcelInfo.setReceiver(receiver);
    parcelInfo.setContent("paczka jakaś");

    int  parcelId = controller.sendParcel(parcelInfo);

    System.out.println("Paczka o identyfikatorze: " + parcelId + " została nadana poprawnie.");
  }

  //TODO: Zaimplementuj poniższe metody.
  private void releaseParcel() {
  }

  private void changeParcelLocation() {
  }

  private void checkParcelStatus() {
  }

}
