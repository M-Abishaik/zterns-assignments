package com.zilker.taxi.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtility {
	
	public boolean validateRegex(Pattern regex, String name) {
		Matcher nameMatcher = null;
		
		nameMatcher = regex.matcher(name);
		if(nameMatcher.find()==true) {
				return true;
		}
		else {
				return false;
		}
	}
}
