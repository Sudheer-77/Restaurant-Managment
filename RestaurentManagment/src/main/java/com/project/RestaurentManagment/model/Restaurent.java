package com.project.RestaurentManagment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = " restaurent")
@Setter
@Getter
public class Restaurent {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
Integer id ;
	String name;
}
