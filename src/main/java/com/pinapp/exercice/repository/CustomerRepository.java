package com.pinapp.exercice.repository;

import com.pinapp.exercice.entity.Config;
import com.pinapp.exercice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(value = "SELECT STDDEV(age) FROM customer", nativeQuery = true)
    Double getAgeStandardDeviation();

    @Query(value = "SELECT AVG(age) FROM customer", nativeQuery = true)
    Double getAgeAverage();

}
