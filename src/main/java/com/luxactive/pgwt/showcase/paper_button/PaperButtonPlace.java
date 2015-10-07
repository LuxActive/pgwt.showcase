package com.luxactive.pgwt.showcase.paper_button;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class PaperButtonPlace extends Place {

	/**
	 * I'm not really using the tokenizer here, but good for example
	 */
	@Prefix("paper_button")
	public static class Tokenizer implements PlaceTokenizer<PaperButtonPlace> {

		public Tokenizer() {
		}

		@Override
		public String getToken(PaperButtonPlace place) {
			String token = place.getToken();
			return token;
		}

		@Override
		public PaperButtonPlace getPlace(String token) {
			return new PaperButtonPlace(token);
		}

	}

	private String token;

	public PaperButtonPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

}
