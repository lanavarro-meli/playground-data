package dh.meli.datapraticaintegradoraii.service;

import dh.meli.datapraticaintegradoraii.model.TestCase;
import dh.meli.datapraticaintegradoraii.repository.ITestCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TestCaseService implements ITestCaseService {

    @Autowired
    private ITestCaseRepository repo;

    @Override
    public List<TestCase> getAll() {
        return (List<TestCase>) repo.findAll();
    }

    @Override
    public TestCase getById(long id) {
        return repo.findById(id).get();
    }


    @Override
    public TestCase createTestCase(TestCase testeCase) {
       return repo.save(testeCase);
    }

    @Override
    public TestCase updateTestCase(TestCase testeCase) {
       TestCase testeFound = getById(testeCase.getId_case());

       return repo.save(testeCase);
    }

    @Override
    public void deleteTestCase(long id) {
        repo.deleteById(id);
    }
}
