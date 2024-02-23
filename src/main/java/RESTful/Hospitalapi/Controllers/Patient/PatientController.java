package RESTful.Hospitalapi.Controllers.Patient;


import RESTful.Hospitalapi.DTOs.Patients.RegisterPatientDTO;
import RESTful.Hospitalapi.Services.Patient.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/Patient")
public class PatientController {

    @Autowired
    private PatientService service;


    @PostMapping
    public ResponseEntity registerPatient(@RequestBody @Valid RegisterPatientDTO dto, UriComponentsBuilder uriBuilder){
        var patientCreated = service.createPatient(dto);

        URI uri = uriBuilder.path("/Patient/{id}").buildAndExpand(patientCreated.getId()).toUri();
        return ResponseEntity.created(uri).body(patientCreated);
    }


}