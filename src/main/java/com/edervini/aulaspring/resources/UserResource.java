package com.edervini.aulaspring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edervini.aulaspring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

		@GetMapping
		public ResponseEntity<User> fingAll() {
			User u = new User(1l, "Maria", "maria@gmail.com", "9999999", "12345");
			return ResponseEntity.ok().body(u);
		}
}
