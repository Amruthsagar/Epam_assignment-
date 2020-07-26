import java.util.*;

@FunctionalInterface
interface palindrome_or_not
{
	boolean calculate(String s);
}


class JavaStreams 
{
	public static void main(String args[])
	{
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=1;i<10;i++)
		{
			array.add(i);
		}
		System.out.println("The average of the element in array is: "+array.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage()+"\n");
		
		ArrayList<String> array_s = new ArrayList<String>();
		array_s.add("add");
		array_s.add("adhd");
		array_s.add("aum");
		array_s.add("will");
		array_s.add("amore");
		array_s.add("agile");
		array_s.add("adg");
		array_s.add("god");
		System.out.println("The strings that start with \'a\' and have a length of three are :- ");
		array_s.stream().filter(s->s.startsWith("a")&&s.length()==3).forEach(s->System.out.println("\t ->"+s));
		
		ArrayList<String> palin_and_nonPalin =new ArrayList<String>();
		palin_and_nonPalin.add("madam");
		palin_and_nonPalin.add("abdba");
		palin_and_nonPalin.add("car");
		palin_and_nonPalin.add("rotor");
		palin_and_nonPalin.add("malayalam");
		palin_and_nonPalin.add("airlplane");
		palin_and_nonPalin.add("ini");
		palin_and_nonPalin.add("bob");
		
		palindrome_or_not palim = (String s)->{
			StringBuffer s1 = new StringBuffer(s);
			return s.equals(s1.reverse().toString());
		};
		
		System.out.println("The palindromes in the given list of strings are :\n");
		palin_and_nonPalin.stream().filter(s->palim.calculate(s)).forEach(s->System.out.println(s));
	}
}