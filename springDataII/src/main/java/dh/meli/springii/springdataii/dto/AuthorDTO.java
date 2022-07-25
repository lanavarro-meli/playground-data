package dh.meli.springii.springdataii.dto;

import dh.meli.springii.springdataii.model.Author;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorDTO {
    private String name;
    private AddressDTO location;

    public AuthorDTO(Author author){
        this.name = author.getName();
        this.location = new AddressDTO(author.getAddress());
    }

}
