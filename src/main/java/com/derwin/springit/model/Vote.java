package com.derwin.springit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Vote extends Auditable {

	@Id
	@GeneratedValue
	private Long id;
	private int vote;

}
