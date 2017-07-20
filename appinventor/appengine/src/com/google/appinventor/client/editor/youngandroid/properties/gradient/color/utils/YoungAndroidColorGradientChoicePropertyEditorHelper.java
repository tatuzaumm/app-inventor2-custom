package com.google.appinventor.client.editor.youngandroid.properties.gradient.color.utils;

import java.util.HashMap;
import java.util.Map;

import com.google.appinventor.client.widgets.properties.ColorChoicePropertyEditor.Color;

/**
 * class to help build the right colors for the
 * YoungAndroidColorGradientChoicePropertyEditor, based on the primary color
 * selected on YoungAndroidColorChoicePropertyEditor
 *
 */
public class YoungAndroidColorGradientChoicePropertyEditorHelper extends YoungAndroidColorGradientColorProvider {

	public Map<String, Color[]> colorsOptions = new HashMap<String,Color[]>();

	public YoungAndroidColorGradientChoicePropertyEditorHelper() {
		super();
		colorsOptions.put(HEX_DEFAULT, DEFAULT_GRADIENT);
		colorsOptions.put(HEX_INDIGO, INDIGO_GRADIENT);
		colorsOptions.put(HEX_MD_BLUE, BLUE_GRADIENT);
		colorsOptions.put(HEX_MD_LIGHT_BLUE, LIGHT_BLUE_GRADIENT);
		colorsOptions.put(HEX_MD_CYAN, CYAN_GRADIENT);
		colorsOptions.put(HEX_MD_TEAL, TEAL_GRADIENT);
		colorsOptions.put(HEX_MD_GREEN, GREEN_GRADIENT);
		colorsOptions.put(HEX_MD_LIGHT_GREEN, LIGHT_GREEN_GRADIENT);
		colorsOptions.put(HEX_MD_LIME, LIME_GRADIENT);
		colorsOptions.put(HEX_MD_YELLOW, YELLOW_GRADIENT);
		colorsOptions.put(HEX_MD_AMBER, AMBER_GRADIENT);
		colorsOptions.put(HEX_MD_ORANGE, ORANGE_GRADIENT);
		colorsOptions.put(HEX_MD_DEEP_ORANGE, DEEP_ORANGE_GRADIENT);
		colorsOptions.put(HEX_MD_RED, RED_GRADIENT);
		colorsOptions.put(HEX_MD_PINK, PINK_GRADIENT);
		colorsOptions.put(HEX_MD_PURPLE, PURPLE_GRADIENT);
		colorsOptions.put(HEX_MD_DEEP_PURPLE, DEEP_PURPLE_GRADIENT);
		colorsOptions.put(HEX_MD_BLUE_GREY, BLUE_GREY_GRADIENT);
		colorsOptions.put(HEX_MD_BROWN, BROWN_GRADIENT);
		colorsOptions.put(HEX_MD_GREY, GREY_GRADIENT);
		colorsOptions.put(HEX_MD_BLACK, DEFAULT_GRADIENT);
		colorsOptions.put(HEX_WHITE, DEFAULT_GRADIENT);
		
	}

	public Map<String, Color[]> getHashColorsOptions() {
		return colorsOptions;
	}

	public void setHashColorsOptions(Map<String, Color[]> hashColorsOptions) {
		this.colorsOptions = hashColorsOptions;
	}

}
