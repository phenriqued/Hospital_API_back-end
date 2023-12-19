package Hospital.Restful_HospitalAPI.Repositories.DoctorRepository;

import Hospital.Restful_HospitalAPI.Entities.Doctor.DoctorEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {

    Page<DoctorEntity> findAllByActiveTrue(Pageable pageable);

}
