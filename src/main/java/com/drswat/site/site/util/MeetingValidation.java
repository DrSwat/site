package com.drswat.site.site.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.drswat.site.site.model.Meeting;
import com.drswat.site.site.repository.MeetingRepository;

@Component
public class MeetingValidation implements Validator {

    @Autowired
    private MeetingRepository repository;

    public boolean supports(Class<?> class1) {
        return Meeting.class.equals(class1);
    }

    public void validate(Object object, Errors errors) {
        Meeting meeting = (Meeting) object;
        if (repository.findOneByTimeAndProperty(meeting.getTime(), meeting.getProperty()) != null)
            errors.rejectValue("time", "reserved", "Already reserved");
    }

}
