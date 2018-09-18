package org.prakash.rest.restAPI.Objects;

public class InstaResponse {
	Data[] data;
	Meta[] meta;

	public InstaResponse() {
	}

	public InstaResponse(Data[] data, Meta[] meta) {
		super();
		this.data = data;
		this.meta = meta;
	}

	public Data[] getData() {
		return data;
	}

	public void setData(Data[] data) {
		this.data = data;
	}

	public Meta[] getMeta() {
		return meta;
	}

	public void setMeta(Meta[] meta) {
		this.meta = meta;
	}

}
