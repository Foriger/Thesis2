package com.pentech.sample;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Event implements Serializable {
	

	private static final long serialVersionUID = 1L;
	private EventType type;
	private String text;
	private Date date;
	private String notes;
	
	public Event(EventType type, String text, Date date, String notes) {
		this.type = type;
		this.text = text;
		this.date = date;
		this.notes = notes;
	}
	
	public String eventFormattedDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String formattedDate = sdf.format(this.date);
		return formattedDate;
	}
	
	public String eventReadableType(){
		String readableEventText ="";
		switch (this.type) {
		case MEDICINE:
			readableEventText = "Изписано лекарство:";
			break;
		case MANIPULATION:
			readableEventText = "Манипулация:";
			break;
		case RESEARCH:
			readableEventText = "Проведени изследвания:";
			break;
		case TRANSFER:
			readableEventText = "Преместване:";
			break;
		case DIAGNOSE_CHANGE:
			readableEventText = "Промяна на диагнозата:";
			break;
		case VISITING_ROUND:
			readableEventText = "Визитация";
			break;
		default:
			readableEventText = "Грешка";
			break;
		}
		
		return readableEventText;
	}
	
	public EventType getType() {
		return type;
	}
	public void setType(EventType type) {
		this.type = type;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}
