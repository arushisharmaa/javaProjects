package firstPackage;

public class OldLady {
	
	public static void main(String[] args)
	{
		paragraph1();
		space(); 
		paragraph2(); 
		space(); 
		paragraph3(); 
		space(); 
		paragraph4(); 
		space();
		paragraph5(); 
		space();
		paragraph6();
		space(); 
		
	}
	
	public static void swallowedA()
	{
		System.out.print("There was an old lady who swallowed a "); 
		
	}
	
	public static void whySwallowed()
	{
		System.out.println("I don't know why she swallowed that fly");
		System.out.println("Perhaps she'll die. ");
	}
	
	public static void fly()
	{
		System.out.println("fly, ");
	}	
	
	public static void spider()
	{
		System.out.println("spider, ");
	}
	
	public static void bird()
	{
		System.out.println("bird,");
	}
	
	public static void cat()
	{
		System.out.println("cat,");
	}
	
	public static void dog()
	{
		System.out.println("dog,");
	}
	
	public static void horse()
	{
		System.out.println("horse,");
	}
	
	public static void space()
	{
		System.out.println(" ");
	}
	public static void paragraph1()
	{
		swallowedA(); 
		fly(); 
		whySwallowed(); 
	}
	
	public static void paragraph2()
	{
		swallowedA(); 
		spider(); 
		System.out.println("That wriggled and iggled inside her.");
		System.out.println("She swallowed the spider to catch the fly, ");
		whySwallowed(); 
	}
	
	public static void paragraph3()
	{
		swallowedA(); 
		bird(); 
		System.out.println("How absurd to swallow a bird.");
		System.out.println("She swallowed the bird to catch the spider, ");
		System.out.println("She swallowed the spider to catch the fly, ");
		whySwallowed(); 
	}
	
	public static void paragraph4()
	{
		swallowedA(); 
		cat(); 
		System.out.println("Imagine that to swallow a cat.");
		System.out.println("She swallowed the cat to catch the bird, ");
		System.out.println("She swallowed the bird to catch the spider, ");
		System.out.println("She swallowed the spider to catch the fly, ");
		whySwallowed(); 
	}
	
	
	public static void paragraph5()
	{
		swallowedA(); 
		dog(); 
		System.out.println("What a hog tp swallow a dog.");
		System.out.println("She swallowed the dog to catch the cat, ");
		System.out.println("She swallowed the cat to catch the bird, ");
		System.out.println("She swallowed the bird to catch the spider, ");
		System.out.println("She swallowed the spider to catch the fly, ");
		whySwallowed(); 
	}
	
	public static void paragraph6()
	{
		swallowedA(); 
		horse(); 
		System.out.println("She died of course.");
		
	}

	}

