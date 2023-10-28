package com.projectems.controller; // (for employee-specific operations)


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projectems.dto.EmployeeDTO;
import com.projectems.service.EmployeeService;


@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(@Qualifier("employeeServiceImpl") EmployeeService employeeService)
    //@Autowired annotation along with @Qualifier("employeeServiceImpl") to explicitly specify that we 
    //want to inject the EmployeeServiceImpl bean into the EmployeeController
    {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id) {
        EmployeeDTO employeeDTO = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employeeDTO);
    }

    @PostMapping("/createEmployee")
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeDTO createdEmployee = employeeService.createEmployee(employeeDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO) {
        employeeDTO.setId(id);
        EmployeeDTO updatedEmployee = employeeService.updateEmployee(employeeDTO);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
