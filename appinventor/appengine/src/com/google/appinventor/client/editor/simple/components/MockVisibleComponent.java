// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.client.editor.simple.components;

import static com.google.appinventor.client.Ode.MESSAGES;
import com.google.appinventor.client.editor.simple.SimpleEditor;
import com.google.appinventor.client.editor.youngandroid.properties.YoungAndroidColorGradientChoicePropertyEditor;
import com.google.appinventor.client.editor.youngandroid.properties.YoungAndroidLengthPropertyEditor;
import com.google.appinventor.client.editor.youngandroid.properties.gradient.color.utils.EventDealer;
import com.google.appinventor.client.editor.youngandroid.properties.gradient.color.utils.PrimaryColorChecker;
import com.google.appinventor.client.editor.youngandroid.properties.gradient.color.utils.PrimaryColorChoiceChangeEvent;
import com.google.appinventor.client.widgets.properties.EditableProperty;
import com.google.appinventor.client.widgets.properties.TextPropertyEditor;
import com.google.appinventor.components.common.ComponentConstants;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

/**
 * Abstract superclass for components with a visual representation.
 *
 */
public abstract class MockVisibleComponent extends MockComponent {

	// Common property names (not all components support all properties).
	protected static final String PROPERTY_NAME_TEXTALIGNMENT = "TextAlignment";
	protected static final String PROPERTY_NAME_BUTTONSHAPE = "Shape";
	protected static final String PROPERTY_NAME_BACKGROUNDCOLOR = "BackgroundColor";
	protected static final String PROPERTY_NAME_BACKGROUNDIMAGE = "BackgroundImage";
	protected static final String PROPERTY_NAME_ENABLED = "Enabled";
	protected static final String PROPERTY_NAME_FONTBOLD = "FontBold";
	protected static final String PROPERTY_NAME_FONTITALIC = "FontItalic";
	protected static final String PROPERTY_NAME_FONTSIZE = "FontSize";
	protected static final String PROPERTY_NAME_FONTTYPEFACE = "FontTypeface";
	protected static final String PROPERTY_NAME_TEXT = "Text";
	protected static final String PROPERTY_NAME_LISTVIEW = "ElementsFromString";
	protected static final String PROPERTY_NAME_SHOW_FILTER_BAR = "ShowFilterBar";
	protected static final String PROPERTY_NAME_TEXTCOLOR = "TextColor";
	protected static final String PROPERTY_NAME_CHECKED = "Checked"; // checkbox
																		// and
																		// radio
																		// button
	protected static final String PROPERTY_NAME_HINT = "Hint";
	protected static final String PROPERTY_NAME_HTMLFORMAT = "HTMLFormat";
	protected static final String PROPERTY_NAME_VISIBLE = "Visible";
	protected static final String PROPERTY_NAME_WIDTH = "Width";
	protected static final String PROPERTY_NAME_HEIGHT = "Height";
	protected static final String PROPERTY_NAME_COLUMN = "Column";
	protected static final String PROPERTY_NAME_ROW = "Row";

	// Note: the values below are duplicated in Component.java
	// If you change them here, change them there!

	// Length values for width and height
	// A value >= 0 specifies an explicit size.
	public static final int LENGTH_PREFERRED = -1;
	public static final int LENGTH_FILL_PARENT = -2;
	// If the length is <= -1000 then add 1000 and change the sign to
	// get the length is percent of Screen1
	public static final int LENGTH_PERCENT_TAG = -1000;

	// Useful colors
	protected static final String COLOR_NONE = "00FFFFFF";
	protected static final String COLOR_DEFAULT = "00000000";

	// Material Design Colors properties
		protected static final String PROPERTY_NAME_ITEM_BACKGROUNDCOLOR = "ItemBackgroundColor";
		protected static final String PROPERTY_NAME_BACKGROUNDCOLOR_GRADIENT = "BackgroundColorGradient";
		protected static final String PROPERTY_NAME_TEXTCOLOR_GRADIENT = "TextColorGradient";
		protected static final String PROPERTY_NAME_ITEM_BACKGROUNDCOLOR_GRADIENT = "ItemBackgroundColorGradient";
		protected static final String PROPERTY_NAME_ITEM_TEXT_COLOR = "ItemTextColor";
		protected static final String PROPERTY_NAME_ITEM_TEXT_COLOR_GRADIENT = "ItemTextColorGradient";
		protected static final String PROPERTY_NAME_ITEM_SELECTION_COLOR = "SelectionColor";
		protected static final String PROPERTY_NAME_ITEM_SELECTION_COLOR_GRADIENT = "SelectionColorGradient";
		protected static final String PROPERTY_NAME_COLOR_LEFT = "ColorLeft";
		protected static final String PROPERTY_NAME_COLOR_LEFT_GRADIENT = "ColorLeftGradient";
		protected static final String PROPERTY_NAME_COLOR_RIGHT = "ColorRight";
		protected static final String PROPERTY_NAME_COLOR_RIGHT_GRADIENT = "ColorRightGradient";
		public static final String PROPERTY_PAINT_COLOR_GRADIENT = "PaintColorGradient";

		private PrimaryColorChecker checker = new PrimaryColorChecker();

	
	
	
	/**
	 * Creates a new instance of a visible component.
	 *
	 * @param editor
	 *            editor of source file the component belongs to
	 */
	MockVisibleComponent(SimpleEditor editor, String type, ImageResource icon) {
		super(editor, type, new Image(icon));
	}

	@Override
	public final void initComponent(Widget widget) {
		super.initComponent(widget);

		// Add standard per-child layout properties
		// NOTE: Not all layouts use these properties
		addProperty(PROPERTY_NAME_COLUMN, "" + ComponentConstants.DEFAULT_ROW_COLUMN, null, new TextPropertyEditor());
		addProperty(PROPERTY_NAME_ROW, "" + ComponentConstants.DEFAULT_ROW_COLUMN, null, new TextPropertyEditor());
		addWidthHeightProperties();
	}

	protected void addWidthHeightProperties() {
		addProperty(PROPERTY_NAME_WIDTH, "" + LENGTH_PREFERRED, MESSAGES.widthPropertyCaption(),
				new YoungAndroidLengthPropertyEditor());
		addProperty(PROPERTY_NAME_HEIGHT, "" + LENGTH_PREFERRED, MESSAGES.heightPropertyCaption(),
				new YoungAndroidLengthPropertyEditor());
	}

	@Override
	protected boolean isPropertyVisible(String propertyName) {
		if (propertyName.equals(PROPERTY_NAME_COLUMN) || propertyName.equals(PROPERTY_NAME_ROW)) {
			return false;
		}
		return super.isPropertyVisible(propertyName);
	}

	/**
	 * {@inheritDoc}
	 *
	 * This is always {@code true} for subclasses of this class.
	 */
	@Override
	public final boolean isVisibleComponent() {
		return true;
	}

	private void setVisibleProperty(String text) {
		boolean visible = Boolean.parseBoolean(text);
		if (!visible && !editor.isLoadComplete()) {
			// As we are loading the scm file and encounter a visble property
			// being set to false, set the
			// expanded field to false. This will make that branch of the
			// components tree initially
			// collapsed.
			expanded = false;
		}
	}

	// PropertyChangeListener implementation

	@Override
	public void onPropertyChange(String propertyName, String newValue) {
		super.onPropertyChange(propertyName, newValue);

		if (propertyName.equals(PROPERTY_NAME_WIDTH)) {
			refreshForm();
		} else if (propertyName.equals(PROPERTY_NAME_HEIGHT)) {
			refreshForm();
		} else if (propertyName.equals(PROPERTY_NAME_VISIBLE)) {
			setVisibleProperty(newValue);
			refreshForm();
		}

		else if (isBackgroundColorChange(propertyName) && hasBackgroundGradientProperty()) {
			fireColorChangeEvent(newValue, PROPERTY_NAME_BACKGROUNDCOLOR_GRADIENT);
		} else if (isTextColorChange(propertyName) && hasTextColorProperty()) {
			fireColorChangeEvent(newValue, PROPERTY_NAME_TEXTCOLOR_GRADIENT);
		} else if (isItemBackGroundColorChange(propertyName) && hasItemBackgroundGradientProperty()) {
			fireColorChangeEvent(newValue, PROPERTY_NAME_TEXTCOLOR_GRADIENT);
		} else if (isItemTextColorChange(propertyName) && hasItemTextColorProperty()) {
			fireColorChangeEvent(newValue, PROPERTY_NAME_ITEM_TEXT_COLOR_GRADIENT);
		} else if (isItemSelectionColorChange(propertyName) && hasItemSelectionColorGradientProperty()) {
			fireColorChangeEvent(newValue, PROPERTY_NAME_ITEM_SELECTION_COLOR_GRADIENT);
		} else if (isColorLeftChange(propertyName) && hasColorLeftGradientProperty()) {
			fireColorChangeEvent(newValue, PROPERTY_NAME_COLOR_LEFT_GRADIENT);
		} else if (isColorRightChange(propertyName) && hasColorRightGradientProperty()) {
			fireColorChangeEvent(newValue, PROPERTY_NAME_COLOR_RIGHT_GRADIENT);
		}
	}

	private boolean hasColorRightGradientProperty() {
		return properties.hasProperty(PROPERTY_NAME_COLOR_RIGHT_GRADIENT);
	}

	private boolean isColorRightChange(String propertyName) {
		return propertyName.equals(PROPERTY_NAME_COLOR_RIGHT);
	}

	private boolean hasColorLeftGradientProperty() {
		return properties.hasProperty(PROPERTY_NAME_COLOR_LEFT_GRADIENT);
	}

	private boolean isColorLeftChange(String propertyName) {
		return propertyName.equals(PROPERTY_NAME_COLOR_LEFT);
	}

	private boolean hasItemSelectionColorGradientProperty() {
		return properties.hasProperty(PROPERTY_NAME_ITEM_SELECTION_COLOR_GRADIENT);
	}

	private boolean isItemSelectionColorChange(String propertyName) {
		return propertyName.equals(PROPERTY_NAME_ITEM_SELECTION_COLOR);
	}

	private boolean hasItemTextColorProperty() {
		return properties.hasProperty(PROPERTY_NAME_ITEM_TEXT_COLOR_GRADIENT);
	}

	private boolean isItemTextColorChange(String propertyName) {
		return propertyName.equals(PROPERTY_NAME_ITEM_TEXT_COLOR);
	}

	private boolean hasItemBackgroundGradientProperty() {
		return properties.hasProperty(PROPERTY_NAME_ITEM_BACKGROUNDCOLOR_GRADIENT);
	}

	private boolean isItemBackGroundColorChange(String propertyName) {
		return propertyName.equals(PROPERTY_NAME_ITEM_BACKGROUNDCOLOR);
	}

	private boolean hasTextColorProperty() {
		return properties.hasProperty(PROPERTY_NAME_TEXTCOLOR_GRADIENT);
	}

	private boolean isTextColorChange(String propertyName) {
		return propertyName.equals(PROPERTY_NAME_TEXTCOLOR);
	}

	private boolean hasBackgroundGradientProperty() {
		return properties.hasProperty(PROPERTY_NAME_BACKGROUNDCOLOR_GRADIENT);
	}

	private boolean isBackgroundColorChange(String propertyName) {
		return propertyName.equals(PROPERTY_NAME_BACKGROUNDCOLOR);
	}

	private void fireColorChangeEvent(String newValue, String propertyName) {
		PrimaryColorChoiceChangeEvent event = new PrimaryColorChoiceChangeEvent(newValue, propertyName);
		EventDealer dealer = new EventDealer(getEditorToHandleEvent(propertyName), properties);
		checker.addMessageReceivedEventHandler(dealer);
		checker.fireEvent(event);
	}

	private YoungAndroidColorGradientChoicePropertyEditor getEditorToHandleEvent(String propertyName) {
		EditableProperty gradientPickerEditor = properties.getProperty(propertyName);
		return (YoungAndroidColorGradientChoicePropertyEditor) gradientPickerEditor.getEditor();
	}

}
