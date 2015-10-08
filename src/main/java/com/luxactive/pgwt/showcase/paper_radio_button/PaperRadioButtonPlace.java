package com.luxactive.pgwt.showcase.paper_radio_button;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class PaperRadioButtonPlace extends Place {

	/**
	 * I'm not really using the tokenizer here, but good for example
	 */
	@Prefix("paper_radio_button")
	public static class Tokenizer implements PlaceTokenizer<PaperRadioButtonPlace> {

		public Tokenizer() {
		}

		@Override
		public String getToken(PaperRadioButtonPlace place) {
			String token = place.getToken();
			return token;
		}

		@Override
		public PaperRadioButtonPlace getPlace(String token) {
			return new PaperRadioButtonPlace(token);
		}

	}

	private String token;

	public PaperRadioButtonPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

}
