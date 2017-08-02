package com.google.appinventor.client.editor.youngandroid.properties.gradient.color.utils;

import com.google.appinventor.client.output.OdeLog;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

public class PrimaryColorChecker implements HasHandlers {

	private HandlerManager handlerManager;

	public PrimaryColorChecker() {
		handlerManager = new HandlerManager(this);
	}

	@Override
	public void fireEvent(GwtEvent<?> event) {
		handlerManager.fireEvent(event);
	}

	public HandlerRegistration addMessageReceivedEventHandler(PrimaryColorChoiceChangeHandler handler) {
		OdeLog.log("Adicionando handler");
		return handlerManager.addHandler(PrimaryColorChoiceChangeEvent.TYPE, handler);
	}

}
