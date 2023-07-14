package com.example.demo.Repository;

import com.example.demo.Models.Voluntario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VoluntarioRepository extends MongoRepository<Voluntario, String> {
}
