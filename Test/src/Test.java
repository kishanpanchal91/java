import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.skype.SkypeException;

/*
import com.elitecore.psgimpl.ejb3.contractMgmt.data.TBLMCUSTOMERCONTRACTMANAGEMENT_VO;
import com.elitecore.psgimpl.ejb3.interfaces.IContractMgmt_Utility_Remote;*/

class Test{
	
	  
	   /**
	 * @param args
	 * @throws SkypeException
	 */
	public static void main(String[] args) throws SkypeException {
		   
		Integer[] arr = {1,2,3,4,5,6,7,9,10};
		
		Collections.sort(Arrays.asList(arr));
		
		for(int i=1,j=1;i<=9;i++,j++) {
		
			if(i!=arr[j-1]) {
				System.out.println("Missing number is : "+i);
				j--;
			}
		}
		
		
		//System.out.println("Missing number is : "+(sum1-sum2));
		
		/*
		 List<String> apnList = null;
	//	 apnList.add("1");
	//	 apnList.add("2");
	//	 apnList.add("5");
	//	 apnList.add("6");
		 List<String> oldApnList = null;	 
	//	 oldApnList.add("2");
	//	 oldApnList.add("3");
	//	 oldApnList.add("3");
	//	 oldApnList.add("4");
		 System.out.println("ischangedefapn : "+(apnList!= null && !apnList.isEmpty() && oldApnList!=null && !oldApnList.isEmpty() && !apnList.get(0).equalsIgnoreCase(oldApnList.get(0))));
		 List<String> addApnList = getList(apnList,oldApnList);
		 System.out.println(addApnList);
		 List<String> deleteApnList = getList(oldApnList,apnList);
		 System.out.println(deleteApnList);

	   }
	   
	   static List<String>  getList(List<String> list1, List<String> list2)
	   {
		   List<String> list3 = new ArrayList<String>();
		   if(list1 != null && list2 != null)
		   {
			   for(String l1 : list1)
			   {
				   if(!list2.contains(l1))
			   			list3.add(l1);
			   }
		   }
		   System.out.println(list3.isEmpty());
		  return list3;
	   }*/
}
}
