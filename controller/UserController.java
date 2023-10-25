package com.projectems.controller; //(for user-related operations like login and access control)


import org.springframework.beans.factory.annotation.Autowired;
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

import com.projectems.dto.UserDTO;
import com.projectems.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}") //mapping HTTP GET requests onto specific handler methods.
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
    	 //method for retrieve details
        UserDTO userDTO = userService.getUserById(id);
        return ResponseEntity.ok(userDTO);
    }

    @PostMapping("/createUser")
    //method for insert details
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
    	  //ResponseEntity is used to manipulate the HTTP Response

        UserDTO createdUser = userService.createUser(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @PutMapping("/{id}")  // updating the user details
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        userDTO.setId(id);
      //method for updating the details
        UserDTO updatedUser = userService.updateUser(userDTO);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}") //mapping HTTP DELETE requests onto specific handler methods.
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
    	//method for deleting the details
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
