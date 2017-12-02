package com.toolsqa;

public class AnyClass {

	private static void removDuplicates(String string) {
		// String newStr="";
		boolean duplicate = false;
		do {
			int size = string.length();
			for (int i = 0; i < size; i++) {
				for (int j = i + 1; j < size; j++) {
					if (string.charAt(i) == string.charAt(j)) {
						string = string.replaceAll(string.substring(j, j + 1), " ");
						duplicate = true;
						break;
					} else {
						duplicate = false;
					}
				}
			}
		} while (duplicate);
		string = string.replaceAll(" ", "");
		System.out.println("newStr="+string);
	}

	public static void main(String[] args) {

		removDuplicates("asahDdkSAJNJKNJknjkNJdDshSKNnjNJKBHvcfVGHBJnkba");

		// Integer Num = 13531;
		// String myNum = String.valueOf(Num);
		// int sizeOfNum = myNum.length();
		// System.out.println(myNum);
		//// System.out.println(myNum.substring(1,3));
		// boolean polentrum=false;
		// for(int i = 0; i<=(sizeOfNum-1)/2;i++){
		// System.out.println(myNum.substring(i, i+1));
		// System.out.println(myNum.substring(sizeOfNum-1-i, sizeOfNum-i));
		// if(myNum.substring(i, i+1).equals(myNum.substring(sizeOfNum-1-i,
		// sizeOfNum-i))){
		//
		// polentrum=true;
		// }else{
		// polentrum=false;
		// break;
		// }
		// }
		// System.out.println(polentrum);
		
		// System.out.println(polent);
	}

}
