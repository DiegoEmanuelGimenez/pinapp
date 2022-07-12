package com.pinapp.exercice.repository;

import com.pinapp.exercice.entity.Config;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigRepository extends JpaRepository<Config, String> {

    @Query("SELECT c FROM Config c where c.code = :code")
    Config findByCode(@Param("code") String code);

}
