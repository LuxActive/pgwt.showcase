package com.luxactive.pgwt.showcase.paper_card;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class PaperCardPlace extends Place {

	/**
	 * I'm not really using the tokenizer here, but good for example
	 */
	@Prefix("paper_card")
	public static class Tokenizer implements PlaceTokenizer<PaperCardPlace> {

		public Tokenizer() {
		}

		@Override
		public String getToken(PaperCardPlace place) {
			String token = place.getToken();
			return token;
		}

		@Override
		public PaperCardPlace getPlace(String token) {
			return new PaperCardPlace(token);
		}

	}

	private String token;

	public PaperCardPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

}
