package com.luxactive.pgwt.showcase.paper_card;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.luxactive.pgwt.basic.Event;
import com.luxactive.pgwt.basic.EventListener;
import com.luxactive.pgwt.paper_button.IPaperButton;
import com.luxactive.pgwt.paper_button.PaperButton;
import com.luxactive.pgwt.paper_card.PaperCard;
import com.luxactive.pgwt.paper_icon_button.IPaperIconButton;
import com.luxactive.pgwt.paper_icon_button.PaperIconButton;

public class PaperCardView extends Composite {

	private static Binder uiBinder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, PaperCardView> {
	}

	@UiField
	IPaperButton card3_button1;
	@UiField
	IPaperButton card3_button2;
	@UiField
	PaperCard card3;
	@UiField
	IPaperIconButton card4_button1;
	@UiField
	IPaperIconButton card4_button2;
	@UiField
	IPaperIconButton card4_button3;
	@UiField
	IPaperButton card5_button1;
	@UiField
	IPaperButton card5_button2;
	@UiField
	IPaperButton card6_button1;
	@UiField
	IPaperButton card6_button2;
	@UiField
	IPaperButton card7_button1;
	@UiField
	IPaperButton card7_button2;

	public PaperCardView() {
		initWidget(uiBinder.createAndBindUi(this));
		PaperButton c3b1 = new PaperButton(card3_button1);
		c3b1.setText("Decrease");
		c3b1.addEventListener("click", new EventListener() {
			@Override
			public void handleEvent(Event event) {
				GWT.log(card3.getElevation() + "");
				if (card3.getElevation() > 0)
					card3.setElevation(card3.getElevation() - 1);
			}
		});
		PaperButton c3b2 = new PaperButton(card3_button2);
		c3b2.setText("Increase");
		c3b2.addEventListener("click", new EventListener() {
			@Override
			public void handleEvent(Event event) {
				GWT.log(card3.getElevation() + "");
				if (card3.getElevation() < 5)
					card3.setElevation(card3.getElevation() + 1);
			}
		});
		PaperIconButton c4b1 = new PaperIconButton(card4_button1);
		c4b1.setIcon("favorite");
		PaperIconButton c4b2 = new PaperIconButton(card4_button2);
		c4b2.setIcon("bookmark");
		PaperIconButton c4b3 = new PaperIconButton(card4_button3);
		c4b3.setIcon("cloud-upload");
		PaperButton c5b1 = new PaperButton(card5_button1);
		c5b1.setText("Nay");
		PaperButton c5b2 = new PaperButton(card5_button2);
		c5b2.setText("Yay!");
		PaperButton c6b1 = new PaperButton(card6_button1);
		c6b1.setText("No");
		PaperButton c6b2 = new PaperButton(card6_button2);
		c6b2.setText("Yes");
		PaperButton c7b1 = new PaperButton(card7_button1);
		c7b1.setText("Action");
		PaperButton c7b2 = new PaperButton(card7_button2);
		c7b2.setText("Moar action!");
	}

}
