package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {
        //EagerRegistry registry = new EagerRegistry();
	
	    EagerRegistry registry = EagerRegistry.getInstance();
	    
	    EagerRegistry registry2 = EagerRegistry.getInstance();
	
	    System.out.println(registry == registry2);
	    //this will yield true
	    //eager singleton is implemented in java
	    
	    
	    LazyRegistryWithDCL lazySingleton1 
	    = LazyRegistryWithDCL.getInstance();
	    
	    LazyRegistryWithDCL lazySingleton2 
	    = LazyRegistryWithDCL.getInstance();
	    
	    System.out.println(lazySingleton1 == lazySingleton2);
	    //will return true;
	    
	    
	    System.out.println("--------------");
	    
	    LazyRegistryIODH singleton;
	    System.out.println("done");
	    singleton = LazyRegistryIODH.getInstance();
	    singleton = LazyRegistryIODH.getInstance();
	    singleton = LazyRegistryIODH.getInstance();
	    singleton = LazyRegistryIODH.getInstance();
	    
	    //in above, constructor will get called only once
	}

}
