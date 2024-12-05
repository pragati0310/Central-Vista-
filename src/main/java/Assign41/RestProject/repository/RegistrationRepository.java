package Assign41.RestProject.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Assign41.RestProject.model.Registration;




@Repository
@Qualifier("regRepo")
public interface RegistrationRepository extends JpaRepository<Registration , Integer> {

}
