package RESTful.Hospitalapi.DTOs.ClientsData;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressClientDTO(
        @NotBlank
        String nameStreet,
        @NotBlank
            @Pattern(regexp = "^[0-9]+$")
        String number,
        String complement,
        @NotBlank
        String district,
        @NotBlank
        String city,
        @NotBlank
            @Pattern(regexp = "^.{2}$")
        String uf,
        @NotBlank
            @Pattern(regexp = "\\d{8}")
        String cep) { }
