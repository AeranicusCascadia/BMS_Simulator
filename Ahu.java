class Ahu {
	
	 // Properties
    private final String equipmentTitle = "Air Handling Unit"; 
    private String unitName = "AHU XX"; 
    float outdoorAirTemp = 0.0f;
    int freshAirDamperOpen = 0;
    int returnAirCO2 = 0;
    float supplyAirTempSetpoint = 0.0f;
    float supplyAirTemp = 0.0f;
    int coolingValveOpen = 0;
    int heatingValveOpen = 0;
    boolean occupied = false;
    boolean supplyFanOn = false;
    int supplyFanDriveSpeed = 0;
    
    // Methods
    
    // Unit Name
    public String getUnitName() { // Getter
		return unitName;
		}
    
    public void setUnitName(String newUnitName) { // Setter
		this.unitName= newUnitName;
		}
		
	// Outdoor Air Temp
	
	public String getOutdoorAirTemp() { // Getter
		String outdoorAirTemp_string = String.valueOf(outdoorAirTemp);
		return outdoorAirTemp_string;
		}
		
	public void setOutdoorAirTemp(float newOutdoorAirTemp) {
		this.outdoorAirTemp = newOutdoorAirTemp;
		}
    
    
}
