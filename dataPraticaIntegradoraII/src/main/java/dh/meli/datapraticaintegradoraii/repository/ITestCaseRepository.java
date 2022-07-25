package dh.meli.datapraticaintegradoraii.repository;

import dh.meli.datapraticaintegradoraii.model.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface ITestCaseRepository extends CrudRepository<TestCase,Long> {
    TestCase findByTested(Boolean parameter);
}
