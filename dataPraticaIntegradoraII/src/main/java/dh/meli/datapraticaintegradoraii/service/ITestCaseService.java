package dh.meli.datapraticaintegradoraii.service;

import dh.meli.datapraticaintegradoraii.model.TestCase;

import java.time.LocalDate;
import java.util.List;

public interface ITestCaseService {
    public List<TestCase> getAll();
    public TestCase getById(long id);
    public TestCase createTestCase(TestCase testeCase);
    public TestCase updateTestCase(TestCase testeCase);
    public void deleteTestCase(long id);
}
