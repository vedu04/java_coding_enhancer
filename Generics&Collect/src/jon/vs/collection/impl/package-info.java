package jon.vs.collection.impl;

/*
Array is a limited collection of similar objects.Also,
we can't increase or decrese the size of that array.
While ArrayList and LinkedList is a collection of n number of objects , because any no. oof objects can be added (caling add method)
	  in the collection of Arraylist.
	  
Generics can be applied on a Arraylist to store similar collection of objects.Example- 
											collection of strings,
											collection of numbers, 
											collection of enums, etc..
Syntax:     in java 1.5   	=> ArrayList<Integer> a= new ArrayList<Integer>();
	  in java 1.7 and later => Arraylist<Integer> a= new ArrayList<>(); 
	  


*/

// Collection is an interface.
// Collections is a class.

/* When to use array and when Collection/ArrayList 
Array:     when want a fixed size of list, use array cause its faster than the array.
	 
ArrayList: when want a dynamic size of list, expand or shrink.
*/

//we can use Generics wit it to get a collection of specific set of class/data type.
//		Example: collection of integrs=>     collection<Integers>
//				 collection of students=>    collection<students>