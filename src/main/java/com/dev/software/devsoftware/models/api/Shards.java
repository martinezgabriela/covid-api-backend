package com.dev.software.devsoftware.models.api;

public class Shards {
	
		 private int total;
		 private int successful;
		 private int skipped;
		 private int failed;


		 // Getter Methods 

		 public int getTotal() {
		  return total;
		 }

		 public int getSuccessful() {
		  return successful;
		 }

		 public int getSkipped() {
		  return skipped;
		 }

		 public int getFailed() {
		  return failed;
		 }

		 // Setter Methods 

		 public void setTotal(int total) {
		  this.total = total;
		 }

		 public void setSuccessful(int successful) {
		  this.successful = successful;
		 }

		 public void setSkipped(int skipped) {
		  this.skipped = skipped;
		 }

		 public void setFailed(int failed) {
		  this.failed = failed;
		 }
		}
