package pl.patryk.app.taskometr.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.patryk.app.taskometr.enums.TaskStatus;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Setter @Getter
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public abstract class Task {

    public Task(String title, Owner owner) {
        this.setCreationDate(LocalDateTime.now());
        this.setModificationDate( LocalDateTime.now() );
        this.setTitle( title );
        this.setOwner( owner );
        this.setStatus( TaskStatus.TODO );
    }

    private LocalDateTime deadline;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;
    private String title;
    private TaskStatus status;
    private String note;


    public void setTitle(String title) {

        if(title != null && !getTitle().equals( title )) {
            setModificationDate(LocalDateTime.now());
            this.title = title;
        }
    }

    public void setStatus(TaskStatus status) {
        setModificationDate( LocalDateTime.now() );
        this.status=status;
    }


    public void setNote(String note) {
        if(!(note.length() >500)) {
            setModificationDate( LocalDateTime.now() );
            this.note=note;
        }
    }

    @OneToOne
    private Owner owner;

    @Override
    public boolean equals(Object object) {

        if(object == this)
            return true;

        if(object==null)
            return false;

        if(!(object instanceof Task t))
            return false;

        return this.title.equals( t.title ) &&
                this.creationDate.equals( t.creationDate ) &&
                this.deadline.equals( t.deadline ) &&
                this.note.equals( t.note );

    }
}
