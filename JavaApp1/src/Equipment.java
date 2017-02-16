
public class Equipment {

	private String equipId;
	private String equipment;
	private String description;
	private String purchaseDate;
	private String activeFlag;
//	private String checkoutID;
//	private String checkoutDate;
	/**
	 * @return the equipid
	 */
	public String getEquipid() {
		return equipId;
	}
	/**
	 * @param equipid the equipid to set
	 */
	public void setEquipid(String equipid) {
		this.equipId = equipid;
	}
	/**
	 * @return the equipment
	 */
	public String getEquipment() {
		return equipment;
	}
	/**
	 * @param equipment the equipment to set
	 */
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the purchaseDate
	 */
	public String getPurchaseDate() {
		return purchaseDate;
	}
	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	/**
	 * @return the activeFlag
	 */
	public String getActiveFlag() {
		return activeFlag;
	}
	/**
	 * @param activeFlag the activeFlag to set
	 */
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	/**
	 * @return the checkoutID
	 */
	@Override
	public String toString() {
		return "Equipment [equipId=" + equipId + ", equipment=" + equipment + "]";
	}

	
	
}
