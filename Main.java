
public class Main
{
    public static void main(String[] args) { // main loop
        
    
       Ahu ahu12 = new Ahu();
       ahu12.setUnitName("AHU 12");
       System.out.println( ahu12.getUnitName() );
       
       ahu12.setOutdoorAirTemp(78.6f);
       
       System.out.println( ahu12.getOutdoorAirTemp() );
        
    }
}
