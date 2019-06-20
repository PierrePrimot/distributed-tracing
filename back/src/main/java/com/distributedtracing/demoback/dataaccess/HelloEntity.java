package com.distributedtracing.demoback.dataaccess;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name = "HELLO")
public class HelloEntity {

	@Id
	@Pattern(regexp = "[0-9]{3}")
	@Column(name = "ID")
	private String id;

	@NotNull
	@Size(min = 10, max = 20)
	@Column(name = "HELLO")
	private String hello;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

}
