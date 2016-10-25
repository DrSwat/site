package com.drswat.site.site.repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.drswat.site.site.model.Meeting;
import com.drswat.site.site.model.Property;

public interface MeetingRepository extends CrudRepository<Meeting, Long> {
	public Meeting findOneByTimeAndProperty(Date time, Property property);
}
