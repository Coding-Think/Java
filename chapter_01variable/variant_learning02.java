public class variant_learning02{

	public static void main(String[] args){
    
		int age = 20;
		double score = 88.9;
		char gender = 'M';//char is a basic data type in Java,used to represent a single character
						  //with ''
		String name = "king";

		//first of all if we want to use variant we have to declare a variant
		//second the variant we have declared could change in same type and range
		//finally, We cannot declare two variables with the same name in the same scope
		age = 30;
		//Now we can change age's value.
		//But we can't declare int age = 30;again.Also can't int age = "jack";cause it's not int type.
		//print message
		
		System.out.println("The one is");
		System.out.println(name);// print king
		System.out.println(age);// print 30
		System.out.println(gender);// print M
		System.out.println(score);// print 88.9
	}
}
