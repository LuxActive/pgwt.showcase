package com.luxactive.pgwt.showcase.paper_button;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.luxactive.pgwt.showcase.ClientFactory;
import com.luxactive.pgwt.showcase.basic.BasicActivity;

public class PaperButtonActivity extends BasicActivity {

	public PaperButtonActivity(PaperButtonPlace place, ClientFactory clientFactory) {
		super(place, clientFactory);
	}

	public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		containerWidget.setWidget(new PaperButtonView());
	}
}
