import java.util.*;

public class Main {
public static String word(String arr[]) {
	String word="";
ArrayList<Character> result = new ArrayList<Character>();
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length();j++) {
		result.add(arr[i].charAt(j));
	}
}
int count=0,temp2=0,temp=0;
 char [] string = new char[result.size()];
 boolean [] check = new boolean[result.size()];
	 for(int j=0;j<result.size();) {
		 if(check[j]==false) {
		string[count]=(char)result.get(j);
		check[j]=true;
		count++;
		 }
		 if(j+arr[arr.length-1].length()>=result.size()) {
				j=++temp;
				temp2=0;
				continue;
			}
		 j+=arr[temp2].length();
		temp2++;

	 }    
    for(int i=0;i<string.length;i++) {
    	word+=string[i];
    }
	return word;
}
	
	
	public static void main(String[] args) {
	String [] arr = {"Diasy","Ufuk","Mehmet","Hüseyin"};
    System.out.println(word(arr));
	}
}
  
	


