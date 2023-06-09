package com.iiht.training.ngo.entity;

import java.time.LocalDate;

public class DonationRequestEntity {

	private Long requestId;
	private Double amount;
	private Long donarId;
	private Long ngoId;
	private String requestStatus;
	private LocalDate donationEndDate;

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getDonarId() {
		return donarId;
	}

	public void setDonarId(Long donarId) {
		this.donarId = donarId;
	}

	public Long getNgoId() {
		return ngoId;
	}

	public void setNgoId(Long ngoId) {
		this.ngoId = ngoId;
	}

	public LocalDate getDonationEndDate() {
		return donationEndDate;
	}

	public void setDonationEndDate(LocalDate donationEndDate) {
		this.donationEndDate = donationEndDate;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	
}
