import model.*;

public class VehicleNoise {
	//add your new vehicle class to the model package
	//only push this file and the vehicle class you created

	public static void main(String[] args) {
		Car honda = new Car();
		System.out.println(honda.makeNoise());
		
		Jet gulfStream = new Jet("Gulf Stream V", 14, 530);
		System.out.println(gulfStream.makeNoise());
		

	}

}
