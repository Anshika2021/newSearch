////package com.retailApp.SearchMicroservices.Service;
////
////public class SearchServiceImplTest {
////
////}
//
//
//
//package com.retailApp.SearchMicroservices.Service;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.when;
//
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//import com.retailApp.SearchMicroservices.Wrapper.ProductWrapper;
//
//@RunWith(MockitoJUnitRunner.class)
//public class SearchServiceImplTest {
//
//	@Mock
//	private RestTemplate restTemplate;
//	
//	@InjectMocks
//	private SearchServiceImpl searchService;
//	
//	@Test
//	public void testSearchProductByName() {
//		// Mock the RestTemplate to return a ProductWrapper with name "testProduct" when getForEntity is called
//		ProductWrapper product = new ProductWrapper();
//		product.setProd_name("testProduct");
//		ResponseEntity<ProductWrapper> response = new ResponseEntity<ProductWrapper>(product, HttpStatus.OK);
//		when(restTemplate.getForEntity(anyString(), (Class<ProductWrapper>) any())).thenReturn(response);
//		
//		// Call the method being tested
//		ResponseEntity<List<ProductWrapper>> result = searchService.searchProductByName("testProduct");
//		
//		// Verify that the response contains the expected product with name "testProduct"
//		List<ProductWrapper> productList = result.getBody();
//		assertEquals(1, productList.size());
//		assertEquals("testProduct", productList.get(0).getProd_name());
//	}
//}

//
//package com.retailApp.SearchMicroservices.Service;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//import com.retailApp.SearchMicroservices.Wrapper.ProductWrapper;
//
//public class SearchServiceImplTest {
//
//    private SearchServiceImpl searchService;
//    private RestTemplate restTemplateMock;
//
//    @BeforeEach
//    public void setUp() {
//        restTemplateMock = mock(RestTemplate.class);
////        searchService = new SearchServiceImpl(restTemplateMock);
//    }
//
//    @Test
//    public void testSearchProductByName() {
//        // Arrange
//        String Prod_name = "test";
//        ProductWrapper productWrapper = new ProductWrapper();
//        productWrapper.setProd_name("test");
//        List<ProductWrapper> productList = new ArrayList<>();
//        productList.add(productWrapper);
//        ResponseEntity<ProductWrapper> responseEntity = new ResponseEntity<>(productWrapper, HttpStatus.OK);
//        when(restTemplateMock.getForEntity("http://localhost:8084/product/getByName/" + Prod_name, ProductWrapper.class)).thenReturn(responseEntity);
//
//        // Act
//        ResponseEntity<List<ProductWrapper>> result = searchService.searchProductByName(Prod_name);
//
//        // Assert
//        assertEquals(HttpStatus.OK, result.getStatusCode());
//        assertEquals(productList, result.getBody());
//    }
//
//    @Test
//    public void testSearchProductByNameReturnsInternalServerError() {
//        // Arrange
//        String Prod_name = "test";
//        when(restTemplateMock.getForEntity("http://localhost:8084/product/getByName/" + Prod_name, ProductWrapper.class)).thenThrow(new RuntimeException());
//
//        // Act
//        ResponseEntity<List<ProductWrapper>> result = searchService.searchProductByName(Prod_name);
//
//        // Assert
//        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, result.getStatusCode());
//        assertEquals(new ArrayList<>(), result.getBody());
//    }
//
//}
