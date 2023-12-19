package Hospital.Restful_HospitalAPI.Entities.UsersData.Address;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable

@AllArgsConstructor @NoArgsConstructor
@Getter
public class AddressEntity {

    private String nameStreet;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String uf;
    private String cep;

}
