package com.google.appinventor.client.editor.youngandroid.properties.gradient.color.utils;

import com.google.appinventor.client.output.OdeLog;
import com.google.gwt.event.shared.GwtEvent;

public class PrimaryColorChoiceChangeEvent extends GwtEvent<PrimaryColorChoiceChangeHandler> {
	
	private final String primaryColor;

	private String propertyNameFiredEvent;
	
	public static final Type<PrimaryColorChoiceChangeHandler> TYPE = new Type<PrimaryColorChoiceChangeHandler>();

	public PrimaryColorChoiceChangeEvent(String newValue, String type) {
		this.primaryColor = newValue;
		this.propertyNameFiredEvent = type;
	}

	@Override
	public Type<PrimaryColorChoiceChangeHandler> getAssociatedType() {
		return TYPE;
	}
	
	@Override
    protected void dispatch(PrimaryColorChoiceChangeHandler handler) {
		OdeLog.log("PrimaryColorChangeEvent: dispatch");
        handler.onPrimaryColorChange(this);
    }
	
	public String getPrimaryColor() {
		OdeLog.log("PrimaryColorChangeEvent: getPrimaryColor");
		return primaryColor;
	}

	public String getPropertyNameFiredEvent() {
		return propertyNameFiredEvent;
	}

	public void setPropertyNameFiredEvent(String propertyNameFiredEvent) {
		this.propertyNameFiredEvent = propertyNameFiredEvent;
	}
	
}
