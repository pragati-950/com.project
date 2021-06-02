package com.example.demo.beans;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customer")
public class Customer {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="cus_id", nullable=false)
private int id;
@Column(name="cus_firstname")
private String firstName;
@Column(name="cus_lastname")
private String lastName;
@Column(name="cus_email")
private String email;
}
