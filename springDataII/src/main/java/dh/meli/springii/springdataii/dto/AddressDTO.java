package dh.meli.springii.springdataii.dto;

import dh.meli.springii.springdataii.model.Address;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDTO {
    private String location;
    public AddressDTO(Address address) {
        this.location = address.getLocation(); ;
    }


}
