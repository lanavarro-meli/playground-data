package dh.meli.springii.springdataii.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    @OneToOne(mappedBy = "author",cascade = CascadeType.ALL) //author = nome do campo na tabela Address que é usada como referencia
    @JsonIgnoreProperties("author") // ao preencher os dados do address nao traga os dados so author
    private Address address;
    @ManyToMany
    @JoinTable(name = "book_author", // nome da tabela de ligacao
            joinColumns = @JoinColumn(name = "author_id", // atributo do author na tabela de ligacao
                    referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id")) // atributo do book na tabela de ligacao
    @JsonIgnoreProperties("authors")
    private List<Book> books;



}
