package com.luxactive.pgwt.showcase.paper_input;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.luxactive.pgwt.basic.Event;
import com.luxactive.pgwt.basic.EventListener;
import com.luxactive.pgwt.paper_icon_button.IPaperIconButton;
import com.luxactive.pgwt.paper_icon_button.PaperIconButton;
import com.luxactive.pgwt.paper_input.IPaperInput;
import com.luxactive.pgwt.paper_input.PaperInput;

public class PaperInputView extends Composite {

	private static Binder uiBinder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, PaperInputView> {
	}
	
	@UiField
	Button validate;
	@UiField
	PaperInput input_validate;
	@UiField
	IPaperIconButton clear_icon;
	@UiField
	IPaperInput icons_input;

	public PaperInputView() {
		initWidget(uiBinder.createAndBindUi(this));
		validate.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				input_validate.validate();
			}
		});
		final PaperInput input = new PaperInput(icons_input);
		PaperIconButton clean = new PaperIconButton(clear_icon);
		clean.addEventListener("click", new EventListener() {
			@Override
			public void handleEvent(Event event) {
				input.setValue("");
			}
		});
	}

}
