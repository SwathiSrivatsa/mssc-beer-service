package com.swa.microservices.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

	@Nullable
	private UUID id;
	@Nullable
	private Integer version;
	@Nullable
	private OffsetDateTime createdDate;
	@Nullable
	private OffsetDateTime lastModifiedDate;
	
	@NotBlank
	private String beerName;
	
	@NotNull
	private BeerStyleEnum beerStyle;
	
	@Positive
	@NotNull
	private Long upc;
	
	@Positive
	@NotNull
	private BigDecimal price;
	
	private Integer quantityOnHand;
	
}
