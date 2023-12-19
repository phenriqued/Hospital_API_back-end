package Hospital.Restful_HospitalAPI.Services.DoctorService;


import Hospital.Restful_HospitalAPI.Entities.Doctor.DTO.DoctorListDTO;
import Hospital.Restful_HospitalAPI.Repositories.DoctorRepository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;


    public Page<DoctorListDTO> listAllDoctors(Pageable pageable){
        return repository.findAllByActiveTrue(pageable).map(DoctorListDTO::new);
    }



}
