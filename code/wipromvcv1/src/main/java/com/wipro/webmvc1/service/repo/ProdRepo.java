package com.wipro.webmvc1.service.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProdRepo {
	
 
	public List<String> getProductList() {		
		List<String> prodList= Arrays.asList("Applei115Plus","M52","Samsung Led TV","Bosh Wsshing machine");
		return prodList;
	}

}
