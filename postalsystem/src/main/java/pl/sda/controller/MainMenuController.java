package pl.sda.controller;

import pl.sda.Model.Address;
import pl.sda.Model.ParcelInfo;
import pl.sda.service.ParcelService;
import pl.sda.view.MainMenuView;

import java.util.Optional;

public class MainMenuController {

  private MainMenuView menuView;
  private ParcelService service;

  public MainMenuController(MainMenuView mainMenuView, ParcelService service) {
    this.menuView = mainMenuView;
    this.service = service;
  }

  //TODO: Zaimplementuj poniższe metody.
  public int sendParcel(ParcelInfo parcel) {
    int storeId = service.saveParcel(parcel);
    return storeId;

    //TODO: Utwórz klasę ParcelService która będzie wykorzystywała ParcelRepository do przechowywania informacji na temat przesyłek.
    //TODO: Póki co może to być dowolna kolekcja. Po zajęciach z bazami danych wrócimy do aplikacji aby dodać tu także zapis do bazy danych.


  }

  public void releaseParcel(String parcelId) {

  }

  public void changeParcelLocation(String parcelId, Address newLocation) {

  }

  public Optional <ParcelInfo> checkParcelStatus(int parcelId) {

    return service.getParcelById(parcelId);
  }
}
