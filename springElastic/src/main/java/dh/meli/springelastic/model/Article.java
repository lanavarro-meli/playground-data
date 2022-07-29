package dh.meli.springelastic.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;
@Data
@Document(indexName = "meli_doc")
public class Article {
    @Id
    private int id;
    @Field(name = "title", type = FieldType.Text)
    private String title;
    @Field(type = FieldType.Nested, includeInParent = true)
    private List<Author> authors;
}
