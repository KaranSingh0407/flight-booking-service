package com.cg.fms.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Schedule
{
//Defining book id as primary key
	@Id
	@Column(name = "schedule_id")
	private int scheduleId;
	
	@OneToOne
	private Airport sourceAirport;
	
	@OneToOne
	private Airport destinationAirport;
	
	@Column(name = "departure_date_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm", iso = ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime departureDateTime;
	
	@Column(name =  "arrival_date_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm", iso = ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime arrivalDateTime;
	
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getScheduleId() {
		return scheduleId;
	}
	
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	
	public Airport getSourceAirport() {
		return sourceAirport;
	}
	
	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	
	public Airport getDestinationAirport() {
		return destinationAirport;
	}
	
	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	
	public LocalDateTime getDepartureDateTime() {
		return departureDateTime;
	}
	
	public void setDepartureDateTime(LocalDateTime departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	
	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}
	
	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

}