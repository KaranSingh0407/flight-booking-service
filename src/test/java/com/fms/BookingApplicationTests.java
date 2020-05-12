package com.fms;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.fms.repository.BookingRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookingApplicationTests {

	
	@MockBean
	private BookingRepository bookingRepository;
	
	
	
	/*
	 * @Test public void getBookingsbyUserIdTest() {
	 * 
	 * when(bookingRepository.findByUserId(new BigInteger("12")).get())
	 * .thenReturn(Stream.of(new Booking(new BigInteger("1"), new BigInteger("1"),
	 * null, null, 5000, null, 4, true, true))).collect(Collectors.toList())); }
	 */
	 

}
