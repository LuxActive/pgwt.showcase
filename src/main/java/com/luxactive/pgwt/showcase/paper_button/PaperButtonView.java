package com.luxactive.pgwt.showcase.paper_button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class PaperButtonView extends Composite {

	private static Binder uiBinder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, PaperButtonView> {
	}

	public PaperButtonView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
