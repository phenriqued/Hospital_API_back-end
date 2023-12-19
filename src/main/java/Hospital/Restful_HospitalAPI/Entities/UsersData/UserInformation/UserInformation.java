package Hospital.Restful_HospitalAPI.Entities.UsersData.UserInformation;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable

@AllArgsConstructor @NoArgsConstructor
@Getter
public class UserInformation {

    private String name;
    private String email;
    private String phone;


}
