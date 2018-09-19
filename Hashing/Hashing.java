public class Hashing{
	
	//for converting given phone numbers into hashcodes.
	int randomA=38;
	int randomB=79;
	long prime=1000003;

	
	//for converting names into hashcodes.
	int randomC = 173;
	long stringPrime=10000019;
	
	
	//converts phone number into hashcode
	public int hashFunction(int number, int nameArraySize){
		long hash = (long)(number*randomA + randomB);
		hash = hash%prime;
		return (int)hash%nameArraySize;
	}


	//converts the name into hashcode
	public int hashFunction(String name, int numberArraySize){
		long hash=0;
		for(int i=0;i<name.length();i++){
			hash=(hash*randomC + name.charAt(i))%stringPrime;
		}
		return (int)hash%numberArraySize;
	}
}

			

	
		
		