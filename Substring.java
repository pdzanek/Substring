
public class Substring{
	public static void main(String[] args){
		int start,end;
		StringBuilder substring=new StringBuilder();
		try{
			if(args.length<3) throw new Exception("Usage: java Substring tekst <start> <end>");
			start=Integer.parseInt(args[1]);
			end=Integer.parseInt(args[2]);
			if(start<0 || end<0) throw new Exception("Podano ujemną liczbę!");
			if(end<start) throw new Exception("Pierwsza wartość jest większa od drugiej!");
			for(int i=start;i<end+1;i++){
				substring.append(args[0].charAt(i));
			}
		}	
		catch(NumberFormatException c){
			System.out.println("Podane wartosci krancowe przedzialow powinny byc liczbami calkowitymi");
			System.exit(1);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
		System.out.println(substring.toString());
	}
}
