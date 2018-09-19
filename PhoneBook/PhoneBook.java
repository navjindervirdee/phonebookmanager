import java.util.*;
public class PhoneBook{
	List [] nameArray;
	List [] numberArray;
	int numofPersons;
	
	public PhoneBook(){
		nameArray = new List[100];
		numberArray = new List[100];
		numofPersons=0;
	}

	public void add(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = input.nextLine();
		System.out.println("Enter the number : ");
		int number = input.nextInt();
		
		Hashing hash = new Hashing();
		int index1 = hash.hashFunction(number,nameArray.length);
		int index2 = hash.hashFunction(name,numberArray.length);
		
		if(nameArray[index1]==null){
			List<String> nameList = new ArrayList<String>();
			nameList.add(0,name);
			nameArray[index1]=nameList;
			
			if(numberArray[index2]==null){
				List<Integer> numberList = new ArrayList<Integer>();
				numberList.add(0,number);
				numberArray[index2]=numberList;
			}

			else{
				List<Integer> numTemp = numberArray[index2];
				numTemp.add(0,number);
				numberArray[index2]=numTemp;
			}
		}
		else{
			List<String> temp = nameArray[index1];
			temp.add(0,name);
			nameArray[index1]=temp; 
			
			if(numberArray[index2]==null){
				List<Integer> numberList = new ArrayList<Integer>();
				numberList.add(0,number);
				numberArray[index2]=numberList;
			}

			else{
				List<Integer> numTemp = numberArray[index2];
				numTemp.add(0,number);
				numberArray[index2]=numTemp;
			}
		}
		numofPersons++;
	}

	public void display(){
		for(int i=0;i<nameArray.length; i++){
			System.out.println(nameArray[i]);
		}

		System.out.println();
		
		for(int i=0;i<numberArray.length;i++){
			System.out.println(numberArray[i]);
		}
	}

}
			
  		
					

		
		
		
		
