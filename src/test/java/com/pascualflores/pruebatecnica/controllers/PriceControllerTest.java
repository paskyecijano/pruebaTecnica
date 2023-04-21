package com.pascualflores.pruebatecnica.controllers;

import com.pascualflores.pruebatecnica.services.PriceService;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {PriceController.class})
@ExtendWith(SpringExtension.class)
class PriceControllerTest {
  @Autowired private PriceController priceController;

  @MockBean private PriceService priceService;
  /** Method under test: {@link PriceController#getPrice(LocalDateTime, Long, Long)} */

  private MockMvc mockMvc;
  private static String PATH = "/api/price";
  private static String PRODUCT_ID = "35455";
  private static String BRAND_ID = "1";

  @BeforeEach
  public void setUp(){
    mockMvc = MockMvcBuilders.standaloneSetup(priceController).build();
  }

  @Test
  void test() throws Exception {
    List<String> dateList = Arrays.asList("2020-06-14 10:00:00","2020-06-14 16:00:00","2020-06-14 21:00:00","2020-06-15 10:00:00","2020-06-16 21:00:00");

    dateList.forEach(o-> {
      try {
        doTest(o);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    });
  }

  private void doTest(String date) throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get(PATH)
                    .param("date", date)
                    .param("productId", PRODUCT_ID)
                    .param("brandId", BRAND_ID))
            .andExpect(MockMvcResultMatchers.status().isOk());
  }
}