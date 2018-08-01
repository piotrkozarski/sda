package pl.sda.service;

import com.opencsv.CSVReader;
import pl.sda.model.Addresses;
import pl.sda.model.User;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static List<User> getUsers(String fileName) {
        List<User> users = new ArrayList<>();

        try {
            CSVReader reader = new CSVReader(new FileReader(fileName));
            String record[] = null;
            while ((record = reader.readNext()) != null) {
                User user = new User();
                user.setFirstName(record[0]);
                user.setLastName(record[1]);
                user.setCompany(record[2]);

                Addresses address = new Addresses();

                address.setAddress(record[3]);
                address.setCity(record[4]);
                address.setCounty(record[5]);
                address.setState(record[6]);
                address.setZip(record[7]);
                user.setPhone(record[8]);
                user.setFax(record[9]);
                user.setEmail(record[10]);
                user.setWeb(record[11]);

                users.add(user);
            }
        } catch (Exception ex) {
            System.out.println("nothing found ");
        }
        return users;
    }
}
