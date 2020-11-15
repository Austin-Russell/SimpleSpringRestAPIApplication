package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    private String isbn;
    private String title;
    private String genre;
    private Integer publicationYear;

    private List<Author> authors;
    private Publisher publisher;

}
