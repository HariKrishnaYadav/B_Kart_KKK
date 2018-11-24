package com.bkart.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Customer implements Serializable {
	private static final long serialVersionUID = -1836726872479056197L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;

	@NotEmpty(message = "Email can not be blank")
	private String email;

	@NotEmpty(message = "Password can not be blank")
	private String password;

	@NotEmpty(message = "Name can not be blank")
	private String customerName;

	@Column(columnDefinition = "DATETIME")
	private Date registerDate;

	private boolean enabled;
}
