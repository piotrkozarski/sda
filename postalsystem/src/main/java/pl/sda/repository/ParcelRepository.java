package pl.sda.repository;

import pl.sda.Model.ParcelInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

//TODO: zamienić na bazę danych
public class ParcelRepository {
    private List<ParcelInfo> parcels = new ArrayList<>();  //lista do zapisu przesyłek, lista zamiast db póki co

    public void saveParcelInfo(ParcelInfo parcelInfo) {
        parcels.add(parcelInfo);


    }

    public Optional<ParcelInfo> getParcelById(int id) {
        return parcels.stream()
                .filter(parcel -> parcel.getId() == id)
                .findFirst();


    }

}
