package pl.patryk.app.taskometr.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity @Getter @Setter @NoArgsConstructor
@AllArgsConstructor
public class HomeTask extends Task{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private boolean isReminder;
    private LocalDateTime reminderTime;
}
