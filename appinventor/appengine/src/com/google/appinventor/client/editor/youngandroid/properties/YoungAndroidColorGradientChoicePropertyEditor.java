package com.google.appinventor.client.editor.youngandroid.properties;

import static com.google.appinventor.client.editor.youngandroid.properties.gradient.color.utils.YoungAndroidColorGradientColorProvider.DEFAULT_GRADIENT;

import com.google.appinventor.client.editor.youngandroid.YaFormEditor;
import com.google.appinventor.client.editor.youngandroid.properties.gradient.color.utils.PrimaryColorChoiceChangeEvent;
import com.google.appinventor.client.editor.youngandroid.properties.gradient.color.utils.YoungAndroidColorGradientChoicePropertyEditorHelper;
import com.google.appinventor.client.output.OdeLog;
import com.google.appinventor.client.widgets.properties.ColorChoicePropertyEditor;
import com.google.appinventor.client.widgets.properties.EditableProperties;
import com.google.appinventor.client.widgets.properties.EditableProperty;

public final class YoungAndroidColorGradientChoicePropertyEditor extends ColorChoicePropertyEditor {

	private static final String DEFAULT_VALUE = "&H00000000";

	public YoungAndroidColorGradientChoicePropertyEditorHelper helper = new YoungAndroidColorGradientChoicePropertyEditorHelper();

	private EditableProperties properties;

	private YaFormEditor form;

	public YoungAndroidColorGradientChoicePropertyEditor(Color[] colors, String hexPrefix) {
		super(colors, hexPrefix);
	}

	/**
	 * Creates a new property editor for color RGB values.
	 */
	public YoungAndroidColorGradientChoicePropertyEditor(YaFormEditor formEditor) {
		this(DEFAULT_GRADIENT);
		form = formEditor;
	}

	/**
	 * Creates a new property editor for a specific array of color RGB values.
	 */
	public YoungAndroidColorGradientChoicePropertyEditor(Color[] colors) {
		super(colors, "&H");
	}

	public YoungAndroidColorGradientChoicePropertyEditor(Color[] colors, YaFormEditor form) {
		super(colors, "&H");
		this.form = form;
	}

	/**
	 * Listener that handles changes on the color selected on the
	 * ColorChoicePropertyEditor. When a primary color changes, we need to
	 * refresh the provider of this editor, to match with the gradients of the
	 * specific primary color.
	 */
	public void onPrimaryColorChange(PrimaryColorChoiceChangeEvent event, EditableProperties properties) {
		this.properties = properties;
		Color[] newColorProvider = helper.colorsOptions.get(event.getPrimaryColor());

		if (newColorProvider == null) {
			newColorProvider = DEFAULT_GRADIENT;
		}

		YoungAndroidColorGradientChoicePropertyEditor newEditor = new YoungAndroidColorGradientChoicePropertyEditor(
				newColorProvider, form);

		String propertyFiredEvent = event.getPropertyNameFiredEvent();

		if (existGradientProperty(propertyFiredEvent)) {
			removePropertyGradient(propertyFiredEvent);
		}

		addGradientProperty(propertyFiredEvent, newEditor);

		if (form.isLoadComplete()) {
			OdeLog.log("Realizando refresh");
			form.reloadDesigner();
		}
	}

	private void removePropertyGradient(String propertyName) {
		properties.removeProperty(propertyName);
	}

	private void addGradientProperty(String propertyName,
			YoungAndroidColorGradientChoicePropertyEditor newEditor) {
		properties.addProperty(propertyName, DEFAULT_VALUE, propertyName, newEditor, EditableProperty.TYPE_NORMAL);
	}

	private boolean existGradientProperty(String propertyName) {
		 return properties.hasProperty(propertyName);
	}

}