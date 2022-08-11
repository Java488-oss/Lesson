package my.lesson;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@Getter
@Setter
public class PersonEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String family;



}
