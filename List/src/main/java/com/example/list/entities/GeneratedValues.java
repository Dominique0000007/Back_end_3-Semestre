package com.example.list.entities;

import jakarta.persistence.GenerationType;

public @interface GeneratedValues {

	GenerationType strategy();

}
