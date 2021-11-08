package com.dev.software.devsoftware.models.api;

public class HospitalList {

	private String _index;
	private String _type;
	private String _id;
	private float _score;
	Hospital _sourceObject;

	// Getter Methods

	public String get_index() {
		return _index;
	}

	public String get_type() {
		return _type;
	}

	public String get_id() {
		return _id;
	}

	public float get_score() {
		return _score;
	}

	public Hospital get_source() {
		return _sourceObject;
	}

	// Setter Methods

	public void set_index(String _index) {
		this._index = _index;
	}

	public void set_type(String _type) {
		this._type = _type;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public void set_score(float _score) {
		this._score = _score;
	}

	public void set_source(Hospital _sourceObject) {
		this._sourceObject = _sourceObject;
	}
}
