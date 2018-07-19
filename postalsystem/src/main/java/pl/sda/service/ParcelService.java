package pl.sda.service;

import pl.sda.Model.ParcelInfo;
import pl.sda.Model.ParcelStatus;
import pl.sda.repository.ParcelRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public class ParcelService {


    private ParcelRepository repository;


    public ParcelService(ParcelRepository repository) {  //konstruktor do tej klasy
        this.repository = repository;

    }
    //tu metoda, która będzie zapisywała do repo naszą przesyłkę

    public int saveParcel(ParcelInfo parcel) {
        parcel.setStatus(ParcelStatus.NEW);
        parcel.setShippmentDate(LocalDateTime.now());

        return repository.saveParcelInfo(parcel);
    }

    public Optional <ParcelInfo> getParcelById (int id){
        return repository.getParcelById(id);
    }
}
