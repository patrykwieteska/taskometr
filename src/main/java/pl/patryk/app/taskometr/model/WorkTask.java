package pl.patryk.app.taskometr.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity @Setter @Getter
public class WorkTask extends Task {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany
    @JoinColumn(name="taskId")
    private List<Step> steps;


}
