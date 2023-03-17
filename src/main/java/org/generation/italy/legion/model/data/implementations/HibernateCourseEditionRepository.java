package org.generation.italy.legion.model.data.implementations;

import org.generation.italy.legion.model.entities.CourseEdition;
import org.hibernate.Session;

public class HibernateCourseEditionRepository extends GenericCrudRepository<CourseEdition> {
    public HibernateCourseEditionRepository(Session s){
        super(s, CourseEdition.class);
    }

}
