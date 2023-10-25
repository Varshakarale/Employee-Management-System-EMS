package com.projectems.controller; //(for leave-related operations)

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectems.dto.LeaveDTO;
import com.projectems.service.LeaveService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/leaves")
@AllArgsConstructor
public class LeaveController {

    private final LeaveService leaveService;

    @GetMapping("/{id}")
    public ResponseEntity<LeaveDTO> getLeaveById(@PathVariable Long id) {
        LeaveDTO leaveDTO = leaveService.getLeaveById(id);
        return ResponseEntity.ok(leaveDTO);
    }

    @PostMapping("/createLeaves")
    public ResponseEntity<LeaveDTO> createLeave(@RequestBody LeaveDTO leaveDTO) {
        LeaveDTO createdLeave = leaveService.createLeave(leaveDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdLeave);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LeaveDTO> updateLeave(@PathVariable Long id, @RequestBody LeaveDTO leaveDTO) {
        leaveDTO.setId(id);
        LeaveDTO updatedLeave = leaveService.updateLeave(leaveDTO);
        return ResponseEntity.ok(updatedLeave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLeave(@PathVariable Long id) {
        leaveService.deleteLeave(id);
        return ResponseEntity.noContent().build();
    }
}
