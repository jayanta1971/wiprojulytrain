package com.wipro.methodref;

import java.util.Arrays;
import java.util.List;
import com.wipro.*;
import com.wipro.methodref.StringUtils;
public class Demo1 {

	public static void main(String[] args) {
	  
		  List<String> list=Arrays.asList("jaya","amit","ravi");
		  list
		  .stream()
		  //.map(str->StringUtils.capitalize(str))
		  .map(StringUtils::capitalize)
		  //.forEach(a->System.out.println(a));
		  .forEach(System.out::println);
          
	}

}
