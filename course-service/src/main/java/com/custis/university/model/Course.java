package com.custis.university.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.Set;

@Table("course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private int id;
    @Column(name = "course_name")
    @NotEmpty(message = "Course name cannot be empty")
    private String name;
    @Column(name = "total_seats")
    @Positive(message = "Total seats must be positive")
    private int totalSeats;
    @Column(name = "occupied_seats")
    @Positive(message = "Occupied seats must be positive")
    private int occupiedSeats;
    @Column(name = "enrollment_start")
    private ZonedDateTime enrollmentStart;
    @Column(name = "enrollment_end")
    private ZonedDateTime enrollmentEnd;
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Enrollment> enrollments;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getOccupiedSeats() {
        return occupiedSeats;
    }

    public ZonedDateTime getEnrollmentStart() {
        return enrollmentStart;
    }

    public ZonedDateTime getEnrollmentEnd() {
        return enrollmentEnd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public void setOccupiedSeats(int occupiedSeats) {
        this.occupiedSeats = occupiedSeats;
    }

    public void setEnrollmentStart(ZonedDateTime enrollmentStart) {
        this.enrollmentStart = enrollmentStart;
    }

    public void setEnrollmentEnd(ZonedDateTime enrollmentEnd) {
        this.enrollmentEnd = enrollmentEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
