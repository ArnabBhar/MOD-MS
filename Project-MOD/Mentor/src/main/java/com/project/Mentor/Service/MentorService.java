package com.project.Mentor.Service;

import java.util.List;

import com.project.Mentor.Model.MentorDetail;

public interface MentorService {

    void create(MentorDetail mentor);
    
    void update(MentorDetail mentor);
    
    void delete(long id);
    
    List<MentorDetail> getAll();


}
