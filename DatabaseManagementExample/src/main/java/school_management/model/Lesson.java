package school_management.model;

import com.school.management.enums.LessonEnum;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="lesson")
public class Lesson {
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name="lesson_name")
    private LessonEnum lessonName;

@Column(name="passed_note")
    private double passedNote;


}
