static boolean isPalindrome(ArrayList<String> word){
		ArrayList<String> rword= new ArrayList<String>();
		rword.addAll(word);
		Collections.reverse(rword);
		for(int i=0;i<word.size();++i)
			if(!(rword.get(i).equals(word.get(i))))
				return false;
		return true;
	}