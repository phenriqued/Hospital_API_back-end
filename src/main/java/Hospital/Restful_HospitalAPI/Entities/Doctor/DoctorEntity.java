package Hospital.Restful_HospitalAPI.Entities.Doctor;


import Hospital.Restful_HospitalAPI.Entities.Doctor.Enum.Speciality;
import Hospital.Restful_HospitalAPI.Entities.UsersData.Address.AddressEntity;
import Hospital.Restful_HospitalAPI.Entities.UsersData.UserInformation.UserInformation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_doctor")

@AllArgsConstructor @NoArgsConstructor
@Getter
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private UserInformation userInformation;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Speciality speciality;
    @Embedded
    private AddressEntity address;
    private Boolean active;



    public void disableDoctor(){
        this.active = false;
    }

}
