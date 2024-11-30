package java_Strings;

public class Short_name_create {

	public static void main(String[] args) {

		String str = "ram lakhan charan";
		String[] st = str.split(" ");
		String s = ""	 , 		short_Name = "";
		char c = 0;
		
		for ( int i=0; i< st.length; i++)
		{
			s = st[i];
			c = s.charAt(0);
			if (i != st.length-1)
			{
				short_Name = (short_Name + c) .toUpperCase() + ". ";
			}		
			else if (i == st.length-1)
			{
				short_Name = (short_Name + c).toUpperCase();
				
				for ( int j=1; j<s.length(); j++ )
				{
					short_Name = short_Name + s.charAt(j);
				}
			}
		}
		System.out.println(short_Name);
		
		

	}

}
