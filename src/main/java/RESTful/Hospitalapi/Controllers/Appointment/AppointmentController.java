package RESTful.Hospitalapi.Controllers.Appointment;


import RESTful.Hospitalapi.DTOs.MedicalAppointment.AppointmentDTO;
import RESTful.Hospitalapi.Services.Appointment.AppointmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ScheduleAppointment")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PostMapping
    public ResponseEntity AppointmentScheduling(@RequestBody @Valid AppointmentDTO appointment){
        return ResponseEntity.ok().body(service.scheduleAppointment(appointment));
    }


}