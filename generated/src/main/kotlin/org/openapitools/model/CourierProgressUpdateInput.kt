package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param courierId ID of the courier
 * @param ordersDelivered Number of orders delivered by the courier
 */
data class CourierProgressUpdateInput(

    @Schema(example = "null", description = "ID of the courier")
    @get:JsonProperty("courier_id") val courierId: kotlin.Int,

    @Schema(example = "null", description = "Number of orders delivered by the courier")
    @get:JsonProperty("orders_delivered") val ordersDelivered: kotlin.Int
) {

}

