// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.client.editor.youngandroid.properties;

import static com.google.appinventor.client.Ode.MESSAGES;
import com.google.appinventor.client.widgets.properties.ColorChoicePropertyEditor;
import com.google.appinventor.client.widgets.properties.ColorChoicePropertyEditor.Color;

/**
 * Property editor for color RGB values.
 *
 */
public final class YoungAndroidColorChoicePropertyEditor extends ColorChoicePropertyEditor {

  // The following colors can be generated by the Lego Mindstorms NXT color sensor.
  public static final Color[] NXT_GENERATED_COLORS = {
    new Color(MESSAGES.noneColor(), Color.ALPHA_TRANSPARENT, "FFFFFF"),
    new Color(MESSAGES.redColor(), Color.ALPHA_OPAQUE, "FF0000"),
    new Color(MESSAGES.greenColor(), Color.ALPHA_OPAQUE, "00FF00"),
    new Color(MESSAGES.blueColor(), Color.ALPHA_OPAQUE, "0000FF"),
  };

  //Default Material Design colours
  public static final Color[] MATERIAL_DESIGN_COLORS = {
		  new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
		  new Color(MESSAGES.noneColor(), Color.ALPHA_TRANSPARENT, "FFFFFF"),
		  new Color(MESSAGES.mdIndigoColor(), Color.ALPHA_OPAQUE, "3f51b5"),
			new Color(MESSAGES.mdBlueColor(), Color.ALPHA_OPAQUE, "2196f3"),
			new Color(MESSAGES.mdLightBlueColor(), Color.ALPHA_OPAQUE, "03a9f4"),
			new Color(MESSAGES.mdCyanColor(), Color.ALPHA_OPAQUE, "00bcd4"),
			new Color(MESSAGES.mdTealColor(), Color.ALPHA_OPAQUE, "009688"),
			new Color(MESSAGES.mdGreenColor(), Color.ALPHA_OPAQUE, "4cb050"),
			new Color(MESSAGES.mdLighGreenColor(), Color.ALPHA_OPAQUE, "8bc34a"),
			new Color(MESSAGES.mdLimeColor(), Color.ALPHA_OPAQUE, "cddc39"),
			new Color(MESSAGES.mdYellowColor(), Color.ALPHA_OPAQUE, "ffff3b"),
			new Color(MESSAGES.mdAmberColor(), Color.ALPHA_OPAQUE, "ffc107"),
			new Color(MESSAGES.mdOrangeColor(), Color.ALPHA_OPAQUE, "ff9800"),
			new Color(MESSAGES.mdDeepOrangeColor(), Color.ALPHA_OPAQUE, "ff5722"),
			new Color(MESSAGES.mdRedColor(), Color.ALPHA_OPAQUE, "f44336"),
			new Color(MESSAGES.mdPinkColor(), Color.ALPHA_OPAQUE, "e91e63"),
			new Color(MESSAGES.mdPurpleColor(), Color.ALPHA_OPAQUE, "9c8bb0"),
			new Color(MESSAGES.mdDeepPurpleColor(), Color.ALPHA_OPAQUE, "673ab7"),
			new Color(MESSAGES.mdBlueGreyColor(), Color.ALPHA_OPAQUE, "607d8b"),
			new Color(MESSAGES.mdBrownColor(), Color.ALPHA_OPAQUE, "795548"),
			new Color(MESSAGES.mdGreyColor(), Color.ALPHA_OPAQUE, "9e9e9e"),
			new Color(MESSAGES.mdBlackColor(), Color.ALPHA_OPAQUE, "000000"),
			new Color(MESSAGES.mdWhiteColor(), Color.ALPHA_OPAQUE, "FFFFFF"),};
  
  /**
   * Creates a new property editor for color RGB values.
   */
  public YoungAndroidColorChoicePropertyEditor() {
    this(MATERIAL_DESIGN_COLORS);
  }

  /**
   * Creates a new property editor for a specific array of color RGB values.
   */
  public YoungAndroidColorChoicePropertyEditor(Color[] colors) {
    super(colors, "&H");
  }
}
