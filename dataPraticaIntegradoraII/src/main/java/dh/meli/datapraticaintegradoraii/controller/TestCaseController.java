package dh.meli.datapraticaintegradoraii.controller;

import dh.meli.datapraticaintegradoraii.model.TestCase;
import dh.meli.datapraticaintegradoraii.service.ITestCaseService;
import dh.meli.datapraticaintegradoraii.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/teste")
public class TestCaseController {
    @Autowired
    private TestCaseService service;

    @GetMapping
    public ResponseEntity<List<TestCase>> getAllTestCase(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestCase> getById(@PathVariable long  id){
        return ResponseEntity.ok(service.getById(id));
    }
    @PostMapping
    public ResponseEntity<TestCase> saveTestCase(@RequestBody TestCase testCase){
        return ResponseEntity.ok(service.createTestCase(testCase));
    }
    @PutMapping
    public ResponseEntity<TestCase> updateTestCase(@RequestBody TestCase testCase ){
        return ResponseEntity.ok(service.updateTestCase(testCase));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTestCase(@PathVariable long id){
        service.deleteTestCase(id);
        return ResponseEntity.noContent().build();
    }


}
