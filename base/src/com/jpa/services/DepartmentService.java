package com.jpa.services;

import javax.persistence.EntityManager;

import com.jpa.entities.Departments;

public class DepartmentService {

	public static Departments encontrarDepartment(EntityManager em, Long id) {
		return em.find(Departments.class, id);
		}
}
