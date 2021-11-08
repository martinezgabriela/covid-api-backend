package com.dev.software.devsoftware.models.api;

public class ApiResponse {

	private float took;
	private boolean timed_out;
	private Shards _shards;
	private Hits hits;
	
	public float getTook() {
		return took;
	}
	public void setTook(float took) {
		this.took = took;
	}
	public boolean isTimed_out() {
		return timed_out;
	}
	public void setTimed_out(boolean timed_out) {
		this.timed_out = timed_out;
	}
	public Shards get_shardsObject() {
		return _shards;
	}
	public void set_shardsObject(Shards _shards) {
		this._shards = _shards;
	}
	public Hits getHits() {
		return hits;
	}
	public void setHits(Hits hits) {
		this.hits = hits;
	}
	
	

}
