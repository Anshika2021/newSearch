//package com.retailApp.SearchMicroservices.RestImpl;
//
//public class SearchImplTest {
//
//}


package com.retailApp.SearchMicroservices.RestImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.retailApp.SearchMicroservices.Service.SearchService;
import com.retailApp.SearchMicroservices.Wrapper.ProductWrapper;

@RunWith(MockitoJUnitRunner.class)
public class SearchImplTest {

	@Mock
	private SearchService searchService;

	@InjectMocks
	private SearchImpl searchImpl;

	@Test
	public void testSearchProductByName() {
		// Create a list of ProductWrapper objects for testing
		List<ProductWrapper> productWrapperList = new ArrayList<>();
		ProductWrapper productWrapper1 = new ProductWrapper("Product 1","Description 1",10);
		ProductWrapper productWrapper2 = new ProductWrapper("Product 2","Description 2",20);
		productWrapperList.add(productWrapper1);
		productWrapperList.add(productWrapper2);

		// Set up the mock searchService
		when(searchService.searchProductByName("Product")).thenReturn(new ResponseEntity<>(productWrapperList, HttpStatus.OK));

		// Call the searchProductByName method on the SearchImpl object
		ResponseEntity<List<ProductWrapper>> responseEntity = searchImpl.searchProductByName("Product");

		// Verify that the searchService method was called with the correct argument
		verify(searchService).searchProductByName("Product");

		// Verify that the response entity contains the expected list of ProductWrapper objects
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
		assertEquals(productWrapperList, responseEntity.getBody());
	}
}
