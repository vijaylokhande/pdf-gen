package com.fcs.pdfgen.dto;



import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"suid_number",
"structure_number",
"spinner_structure_status",
"spinner_type_of_structure",
"spinner_tolerated_structures",
"spinner_type_of_tolerated_structure",
"spinner_type_of_occupant",
"text_owner_name",
"text_occupant_name",
"text_occuping_structure_since",
"text_address",
"text_floor_number",
"spinner_gender",
"text_age",
"text_head_of_family",
"text_husband_spouse_name",
"text_total_family_members",
"text_land_ownership",
"text_carpet_possession_area",
"text_tax_assessment_area",
"text_aadhar_card_no",
"text_pan_card_no",
"text_ration_card_no",
"text_electricity_bill_no",
"text_house_tax_receipt_no",
"text_other_id_no",
"longitude",
"latitude"
})
public class Node {

@JsonProperty("suid_number")
private String suidNumber;
@JsonProperty("structure_number")
private String structureNumber;
@JsonProperty("spinner_structure_status")
private String spinnerStructureStatus;
@JsonProperty("spinner_type_of_structure")
private String spinnerTypeOfStructure;
@JsonProperty("spinner_tolerated_structures")
private String spinnerToleratedStructures;
@JsonProperty("spinner_type_of_tolerated_structure")
private String spinnerTypeOfToleratedStructure;
@JsonProperty("spinner_type_of_occupant")
private String spinnerTypeOfOccupant;
@JsonProperty("text_owner_name")
private String textOwnerName;
@JsonProperty("text_occupant_name")
private String textOccupantName;
@JsonProperty("text_occuping_structure_since")
private String textOccupingStructureSince;
@JsonProperty("text_address")
private String textAddress;
@JsonProperty("text_floor_number")
private String textFloorNumber;
@JsonProperty("spinner_gender")
private String spinnerGender;
@JsonProperty("text_age")
private String textAge;
@JsonProperty("text_head_of_family")
private String textHeadOfFamily;
@JsonProperty("text_husband_spouse_name")
private String textHusbandSpouseName;
@JsonProperty("text_total_family_members")
private String textTotalFamilyMembers;
@JsonProperty("text_land_ownership")
private String textLandOwnership;
@JsonProperty("text_carpet_possession_area")
private String textCarpetPossessionArea;
@JsonProperty("text_tax_assessment_area")
private String textTaxAssessmentArea;
@JsonProperty("text_aadhar_card_no")
private String textAadharCardNo;
@JsonProperty("text_pan_card_no")
private String textPanCardNo;
@JsonProperty("text_ration_card_no")
private String textRationCardNo;
@JsonProperty("text_electricity_bill_no")
private String textElectricityBillNo;
@JsonProperty("text_house_tax_receipt_no")
private String textHouseTaxReceiptNo;
@JsonProperty("text_other_id_no")
private String textOtherIdNo;
@JsonProperty("longitude")
private Integer longitude;
@JsonProperty("latitude")
private Integer latitude;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("suid_number")
public String getSuidNumber() {
return suidNumber;
}

@JsonProperty("suid_number")
public void setSuidNumber(String suidNumber) {
this.suidNumber = suidNumber;
}

@JsonProperty("structure_number")
public String getStructureNumber() {
return structureNumber;
}

@JsonProperty("structure_number")
public void setStructureNumber(String structureNumber) {
this.structureNumber = structureNumber;
}

@JsonProperty("spinner_structure_status")
public String getSpinnerStructureStatus() {
return spinnerStructureStatus;
}

@JsonProperty("spinner_structure_status")
public void setSpinnerStructureStatus(String spinnerStructureStatus) {
this.spinnerStructureStatus = spinnerStructureStatus;
}

@JsonProperty("spinner_type_of_structure")
public String getSpinnerTypeOfStructure() {
return spinnerTypeOfStructure;
}

@JsonProperty("spinner_type_of_structure")
public void setSpinnerTypeOfStructure(String spinnerTypeOfStructure) {
this.spinnerTypeOfStructure = spinnerTypeOfStructure;
}

@JsonProperty("spinner_tolerated_structures")
public String getSpinnerToleratedStructures() {
return spinnerToleratedStructures;
}

@JsonProperty("spinner_tolerated_structures")
public void setSpinnerToleratedStructures(String spinnerToleratedStructures) {
this.spinnerToleratedStructures = spinnerToleratedStructures;
}

@JsonProperty("spinner_type_of_tolerated_structure")
public String getSpinnerTypeOfToleratedStructure() {
return spinnerTypeOfToleratedStructure;
}

@JsonProperty("spinner_type_of_tolerated_structure")
public void setSpinnerTypeOfToleratedStructure(String spinnerTypeOfToleratedStructure) {
this.spinnerTypeOfToleratedStructure = spinnerTypeOfToleratedStructure;
}

@JsonProperty("spinner_type_of_occupant")
public String getSpinnerTypeOfOccupant() {
return spinnerTypeOfOccupant;
}

@JsonProperty("spinner_type_of_occupant")
public void setSpinnerTypeOfOccupant(String spinnerTypeOfOccupant) {
this.spinnerTypeOfOccupant = spinnerTypeOfOccupant;
}

@JsonProperty("text_owner_name")
public String getTextOwnerName() {
return textOwnerName;
}

@JsonProperty("text_owner_name")
public void setTextOwnerName(String textOwnerName) {
this.textOwnerName = textOwnerName;
}

@JsonProperty("text_occupant_name")
public String getTextOccupantName() {
return textOccupantName;
}

@JsonProperty("text_occupant_name")
public void setTextOccupantName(String textOccupantName) {
this.textOccupantName = textOccupantName;
}

@JsonProperty("text_occuping_structure_since")
public String getTextOccupingStructureSince() {
return textOccupingStructureSince;
}

@JsonProperty("text_occuping_structure_since")
public void setTextOccupingStructureSince(String textOccupingStructureSince) {
this.textOccupingStructureSince = textOccupingStructureSince;
}

@JsonProperty("text_address")
public String getTextAddress() {
return textAddress;
}

@JsonProperty("text_address")
public void setTextAddress(String textAddress) {
this.textAddress = textAddress;
}

@JsonProperty("text_floor_number")
public String getTextFloorNumber() {
return textFloorNumber;
}

@JsonProperty("text_floor_number")
public void setTextFloorNumber(String textFloorNumber) {
this.textFloorNumber = textFloorNumber;
}

@JsonProperty("spinner_gender")
public String getSpinnerGender() {
return spinnerGender;
}

@JsonProperty("spinner_gender")
public void setSpinnerGender(String spinnerGender) {
this.spinnerGender = spinnerGender;
}

@JsonProperty("text_age")
public String getTextAge() {
return textAge;
}

@JsonProperty("text_age")
public void setTextAge(String textAge) {
this.textAge = textAge;
}

@JsonProperty("text_head_of_family")
public String getTextHeadOfFamily() {
return textHeadOfFamily;
}

@JsonProperty("text_head_of_family")
public void setTextHeadOfFamily(String textHeadOfFamily) {
this.textHeadOfFamily = textHeadOfFamily;
}

@JsonProperty("text_husband_spouse_name")
public String getTextHusbandSpouseName() {
return textHusbandSpouseName;
}

@JsonProperty("text_husband_spouse_name")
public void setTextHusbandSpouseName(String textHusbandSpouseName) {
this.textHusbandSpouseName = textHusbandSpouseName;
}

@JsonProperty("text_total_family_members")
public String getTextTotalFamilyMembers() {
return textTotalFamilyMembers;
}

@JsonProperty("text_total_family_members")
public void setTextTotalFamilyMembers(String textTotalFamilyMembers) {
this.textTotalFamilyMembers = textTotalFamilyMembers;
}

@JsonProperty("text_land_ownership")
public String getTextLandOwnership() {
return textLandOwnership;
}

@JsonProperty("text_land_ownership")
public void setTextLandOwnership(String textLandOwnership) {
this.textLandOwnership = textLandOwnership;
}

@JsonProperty("text_carpet_possession_area")
public String getTextCarpetPossessionArea() {
return textCarpetPossessionArea;
}

@JsonProperty("text_carpet_possession_area")
public void setTextCarpetPossessionArea(String textCarpetPossessionArea) {
this.textCarpetPossessionArea = textCarpetPossessionArea;
}

@JsonProperty("text_tax_assessment_area")
public String getTextTaxAssessmentArea() {
return textTaxAssessmentArea;
}

@JsonProperty("text_tax_assessment_area")
public void setTextTaxAssessmentArea(String textTaxAssessmentArea) {
this.textTaxAssessmentArea = textTaxAssessmentArea;
}

@JsonProperty("text_aadhar_card_no")
public String getTextAadharCardNo() {
return textAadharCardNo;
}

@JsonProperty("text_aadhar_card_no")
public void setTextAadharCardNo(String textAadharCardNo) {
this.textAadharCardNo = textAadharCardNo;
}

@JsonProperty("text_pan_card_no")
public String getTextPanCardNo() {
return textPanCardNo;
}

@JsonProperty("text_pan_card_no")
public void setTextPanCardNo(String textPanCardNo) {
this.textPanCardNo = textPanCardNo;
}

@JsonProperty("text_ration_card_no")
public String getTextRationCardNo() {
return textRationCardNo;
}

@JsonProperty("text_ration_card_no")
public void setTextRationCardNo(String textRationCardNo) {
this.textRationCardNo = textRationCardNo;
}

@JsonProperty("text_electricity_bill_no")
public String getTextElectricityBillNo() {
return textElectricityBillNo;
}

@JsonProperty("text_electricity_bill_no")
public void setTextElectricityBillNo(String textElectricityBillNo) {
this.textElectricityBillNo = textElectricityBillNo;
}

@JsonProperty("text_house_tax_receipt_no")
public String getTextHouseTaxReceiptNo() {
return textHouseTaxReceiptNo;
}

@JsonProperty("text_house_tax_receipt_no")
public void setTextHouseTaxReceiptNo(String textHouseTaxReceiptNo) {
this.textHouseTaxReceiptNo = textHouseTaxReceiptNo;
}

@JsonProperty("text_other_id_no")
public String getTextOtherIdNo() {
return textOtherIdNo;
}

@JsonProperty("text_other_id_no")
public void setTextOtherIdNo(String textOtherIdNo) {
this.textOtherIdNo = textOtherIdNo;
}

@JsonProperty("longitude")
public Integer getLongitude() {
return longitude;
}

@JsonProperty("longitude")
public void setLongitude(Integer longitude) {
this.longitude = longitude;
}

@JsonProperty("latitude")
public Integer getLatitude() {
return latitude;
}

@JsonProperty("latitude")
public void setLatitude(Integer latitude) {
this.latitude = latitude;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
	return "Node [suidNumber=" + suidNumber + ", structureNumber=" + structureNumber + ", spinnerStructureStatus="
			+ spinnerStructureStatus + ", spinnerTypeOfStructure=" + spinnerTypeOfStructure
			+ ", spinnerToleratedStructures=" + spinnerToleratedStructures + ", spinnerTypeOfToleratedStructure="
			+ spinnerTypeOfToleratedStructure + ", spinnerTypeOfOccupant=" + spinnerTypeOfOccupant + ", textOwnerName="
			+ textOwnerName + ", textOccupantName=" + textOccupantName + ", textOccupingStructureSince="
			+ textOccupingStructureSince + ", textAddress=" + textAddress + ", textFloorNumber=" + textFloorNumber
			+ ", spinnerGender=" + spinnerGender + ", textAge=" + textAge + ", textHeadOfFamily=" + textHeadOfFamily
			+ ", textHusbandSpouseName=" + textHusbandSpouseName + ", textTotalFamilyMembers=" + textTotalFamilyMembers
			+ ", textLandOwnership=" + textLandOwnership + ", textCarpetPossessionArea=" + textCarpetPossessionArea
			+ ", textTaxAssessmentArea=" + textTaxAssessmentArea + ", textAadharCardNo=" + textAadharCardNo
			+ ", textPanCardNo=" + textPanCardNo + ", textRationCardNo=" + textRationCardNo + ", textElectricityBillNo="
			+ textElectricityBillNo + ", textHouseTaxReceiptNo=" + textHouseTaxReceiptNo + ", textOtherIdNo="
			+ textOtherIdNo + ", longitude=" + longitude + ", latitude=" + latitude + ", additionalProperties="
			+ additionalProperties + "]";
}



}