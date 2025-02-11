package com.spring.user.domain;

import com.spring.common.domain.TimeBaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity(name = "UserEntity")
@Getter
public class User extends TimeBaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;

	private String password;

	private String name;

	private Role role;

	public User(String name) {
		this.name = name;
	}
}
