package com.huttger.joshua.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository<Plant, PlantId> {
  Optional<Plant> findById(PlantId id);
  Iterable<Plant> findByLastUpdatedLessThan(long l);
}
