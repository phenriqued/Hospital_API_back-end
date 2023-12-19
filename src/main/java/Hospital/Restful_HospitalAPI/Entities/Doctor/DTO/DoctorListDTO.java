package Hospital.Restful_HospitalAPI.Entities.Doctor.DTO;

import Hospital.Restful_HospitalAPI.Entities.Doctor.DoctorEntity;
import Hospital.Restful_HospitalAPI.Entities.Doctor.Enum.Speciality;
import Hospital.Restful_HospitalAPI.Entities.UsersData.UserInformation.UserInformation;

public record DoctorListDTO(String name, String phone, String email, String crm, Speciality speciality) {

    public DoctorListDTO(DoctorEntity entity){
        this(entity.getUserInformation().getName(), entity.getUserInformation().getPhone(),
                entity.getUserInformation().getEmail(), entity.getCrm(), entity.getSpeciality());
    }

}
