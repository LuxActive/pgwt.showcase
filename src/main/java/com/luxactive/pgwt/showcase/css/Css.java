package com.luxactive.pgwt.showcase.css;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

/**
 * Css bundle for styling
 * 
 * @author Andrei
 *
 */
public interface Css extends ClientBundle {
	Css INSTANCE = GWT.create(Css.class);

	@Source("MainLayout.css")
	MainLayout mainLayout_style();

	@Source("Paper_Button.css")
	Paper_Button paper_button_style();

	@Source("Paper_Card.css")
	Paper_Card paper_card_style();

	@Source("Paper_Icon_Button.css")
	Paper_Icon_Button paper_icon_button_style();
	
	@Source("Paper_Input.css")
	Paper_Input paper_input_style();

}
