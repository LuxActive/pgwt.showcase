package com.luxactive.pgwt.showcase.paper_radio_button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.luxactive.pgwt.basic.Event;
import com.luxactive.pgwt.basic.EventListener;
import com.luxactive.pgwt.paper_radio_button.IPaperRadioButton;
import com.luxactive.pgwt.paper_radio_button.PaperRadioButton;

public class PaperRadioButtonView extends Composite {

	private static Binder uiBinder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, PaperRadioButtonView> {
	}

	public PaperRadioButtonView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
