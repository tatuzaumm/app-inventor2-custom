package com.google.appinventor.client.editor.youngandroid.properties.gradient.color.utils;

import com.google.appinventor.client.editor.youngandroid.properties.YoungAndroidColorGradientChoicePropertyEditor;
import com.google.appinventor.client.output.OdeLog;
import com.google.appinventor.client.widgets.properties.EditableProperties;

public class EventDealer implements PrimaryColorChoiceChangeHandler{
	
	YoungAndroidColorGradientChoicePropertyEditor editor;
	
	EditableProperties properties;

	public EventDealer(YoungAndroidColorGradientChoicePropertyEditor editor, EditableProperties properties){
		OdeLog.log("construtor com editor");
		this.editor = editor;
		this.properties = properties;
	}

	public void onPrimaryColorChange(PrimaryColorChoiceChangeEvent event) {
		OdeLog.log("BATEU NO DEALER " + event.getPrimaryColor());
		editor.onPrimaryColorChange(event, properties);
	}

}
