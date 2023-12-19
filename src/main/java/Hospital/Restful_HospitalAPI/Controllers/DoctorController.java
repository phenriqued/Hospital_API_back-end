package Hospital.Restful_HospitalAPI.Controllers;


import Hospital.Restful_HospitalAPI.Services.DoctorService.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @GetMapping
    public ResponseEntity getAllDoctors(@PageableDefault(size = 5, sort = {"name"}) Pageable pageable){
        return ResponseEntity.ok().body(service.listAllDoctors(pageable));
    }

}
