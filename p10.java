import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;



public class aloc {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args){
		String filename,alg_type;
		int m_reg;
		while (true){
			try{
				//m_reg=Integer.parseInt(br.readLine());
				//alg_type=br.readLine();
				//filename = br.readLine();
				//System.out.println("Please "+m_reg);

				FriendshipGraph("block1.i") ;
				break;
			}
			catch (IOException e){
				System.out.println("Please enter a valid file name");
			}
		}
		
		
		
	}
	
	
	public static void FriendshipGraph(String filename) 
			throws FileNotFoundException{
		Scanner sc;
		String t,tt;
				sc = new Scanner(new File(filename));
				//Pattern p = Pattern.compile( "a*b");
				String name = null;
				String school = null;
				
				while(sc.hasNextLine()){
					String line = sc.nextLine();
					StringTokenizer st = new StringTokenizer(line);
				     while (st.hasMoreTokens()) {
				    	 t= st.nextToken();
				    	 if(t.contains("r")&&!t.equalsIgnoreCase("store")){
				    		 t.substring(1);
				    		 Object String;
							if(t.contains(",")){
				    		  t=t.substring(0, t.length()-1);
							}
					         System.out.println("r==="+t);
					         
				    	 }
				         //System.out.println(st.nextToken());
				     }
					

					//friends.put(name, new GraphNode(new Person(name, school), null));
				//	visited.put(name, (Integer)0);
				}
				
				
			}
	
	void a(){
		ArrayList<String> a = null;
		ArrayList<String> connectors = a;
		Iterator<String> namelist = connectors.iterator();
		
		while (namelist.hasNext()){
			System.out.println(namelist.next());
		}
		
	}
	
	
	/*String[] split = line.split("[\t ]+");
	System.out.println("split.length"+split.length);
	System.out.println("split[0]"+split[0]);*/
}
