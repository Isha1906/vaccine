package vcc;
abstract class Vaccine {
	
	/* Conditions to get first dose*/
	public void firstDose(String nationality,int age) 
	{
		if((nationality.equalsIgnoreCase("Indian")) && age>=18)
		{
			System.out.println("--First Dose Vaccination Successful--");
			//wait(1000);
			System.out.println("--Please Pay Rs.250 on the counter--");
		}
		else {
			System.err.println("!!!You are not eligible for the vaccination!!!!");
		}	
	}
	
	/* if status of first dose is true*/
	public void secondDose(Boolean fdStatus)
	{
		if(fdStatus)
		{
			System.out.println("--Second Dose Vaccination Successful--");
		}
		else {
			System.err.println("!!!You cannot get vaccinated as you have not taken your first dose!!! ");
			System.err.println("!!!Kindly take it a.s.a.p");
		}
	}
	public abstract void boosterDose();

}
//Implementation of boosterDose() method from abstract class Vaccine
class VaccinationSuccessful extends Vaccine
{

	@Override
	public void boosterDose() {
		System.out.println("--Booster Dose Vaccination Successful--");
		
	}
	
}


//Main() class file
public class Vaccination{
	public static void main(String[] args) 
	{
		VaccinationSuccessful v=new VaccinationSuccessful();
		v.firstDose("Indian", 21);
		v.secondDose(true);
		v.boosterDose();
		
		VaccinationSuccessful v1=new VaccinationSuccessful();
		v1.firstDose("Indian", 15);
		v1.secondDose(false);
		v1.boosterDose();
	}
}
