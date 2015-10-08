package com.luxactive.pgwt.showcase.paper_radio_button;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.luxactive.pgwt.showcase.ClientFactory;
import com.luxactive.pgwt.showcase.basic.BasicActivity;

public class PaperRadioButtonActivity extends BasicActivity {

	public PaperRadioButtonActivity(PaperRadioButtonPlace place, ClientFactory clientFactory) {
		super(place, clientFactory);
	}

	public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		containerWidget.setWidget(new PaperRadioButtonView());
	}
}
