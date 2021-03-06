package pe.edu.upc.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.model.Emergency;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmergencyRepository extends JpaRepository<Emergency, Integer> {
    Page<Emergency> findByPatientId(int patientId, Pageable pageable);
    Optional<Emergency> findByIdAndPatientId(int emergencyId, int patientId);

    @Query(value = "select e from Emergency as e where e.patient.dni like %:keyword% ")
    List<Emergency> findByKeyword(@Param("keyword") String keyword);
}
