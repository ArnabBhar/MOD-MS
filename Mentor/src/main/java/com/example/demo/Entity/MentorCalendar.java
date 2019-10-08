package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name="mentor_calendar")
public class MentorCalendar {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="calendar_id")
    private Integer calendarId;
    @Column(name="time_slot")
    private String timeSlot;

    @ManyToOne
    private MentorDetails md;

    public MentorCalendar() {
    }

    public Integer getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(Integer calendarId) {
        this.calendarId = calendarId;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public MentorDetails getMd() {
        return md;
    }

    public void setMd(MentorDetails md) {
        this.md = md;
    }

    public MentorCalendar(String timeSlot, MentorDetails md) {
        this.timeSlot = timeSlot;
        this.md = md;
    }
}
