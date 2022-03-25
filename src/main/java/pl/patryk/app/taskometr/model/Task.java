package pl.patryk.app.taskometr.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.patryk.app.taskometr.enums.TaskStatus;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Setter @Getter
@MappedSuperclass
public abstract class Task {

    private LocalDateTime deadline;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;
    private String title;
    private TaskStatus status;
    private String note;
}
