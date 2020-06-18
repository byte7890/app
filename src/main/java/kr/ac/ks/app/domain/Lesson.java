package kr.ac.ks.app.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Lesson {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int quota;
    private int x =0;

    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
        this.course.getLessons().add(this);
    }
    public int addx()
    {
        x=x+1;
        return quota;
    }
}
