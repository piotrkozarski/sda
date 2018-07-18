package pl.sda.controller;

import pl.sda.Model.Address;
import pl.sda.Model.ParcelInfo;
import pl.sda.view.MainMenuView;

public class MainMenuController {

  private MainMenuView menuView;

  public MainMenuController(MainMenuView mainMenuView) {
    this.menuView = mainMenuView;
  }

  //TODO: Zaimplementuj poniższe metody.
  public String sendParcel(ParcelInfo parcel) {
    //TODO: Utwórz klasę ParcelService która będzie wykorzystywała ParcelRepository do przechowywania informacji na temat przesyłek.
    //TODO: Póki co może to być dowolna kolekcja. Po zajęciach z bazami danych wrócimy do aplikacji aby dodać tu także zapis do bazy danych.

    return "return random unique ID";
  }

  public void releaseParcel(String parcelId) {

  }

  public void changeParcelLocation(String parcelId, Address newLocation) {

  }

  public ParcelInfo checkParcelStatus(String parcelId) {

    return null;
  }
}
