package pl.patryk.app.taskometr.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @Setter @Getter
public class Owner {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    

}
