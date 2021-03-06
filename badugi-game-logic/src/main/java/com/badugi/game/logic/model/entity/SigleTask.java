package com.badugi.game.logic.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SigleTask entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sigle_task")
public class SigleTask extends BaseEntity implements java.io.Serializable {

	// Fields

	private Integer id;
	private String taskName;
	private Integer requireNum1;
	private Integer requireNum2;
	private String reward;

	// Constructors

	/** default constructor */
	public SigleTask() {
	}

	/** minimal constructor */
	public SigleTask(String taskName) {
		this.taskName = taskName;
	}

	/** full constructor */
	public SigleTask(Integer id, String taskName, Integer requireNum1,
			Integer requireNum2, String reward) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.requireNum1 = requireNum1;
		this.requireNum2 = requireNum2;
		this.reward = reward;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "TaskName", nullable = false)
	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	@Column(name = "RequireNum1", nullable = false)
	public Integer getRequireNum1() {
		return requireNum1;
	}
	
	public void setRequireNum1(Integer requireNum1) {
		this.requireNum1 = requireNum1;
	}
	
	@Column(name = "RequireNum2", nullable = false)
	public Integer getRequireNum2() {
		return requireNum2;
	}
	
	public void setRequireNum2(Integer requireNum2) {
		this.requireNum2 = requireNum2;
	}

	@Column(name = "Reward")
	public String getReward() {
		return this.reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

}