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
 * @param questId ID of the quest
 * @param currentTier Number representing the current tier the courier is at
 * @param ordersDelivered Number of orders delivered by the courier for this quest
 */
data class CourierQuestProgress(

    @Schema(example = "null", description = "ID of the courier")
    @get:JsonProperty("courier_id") val courierId: kotlin.Int? = null,

    @Schema(example = "null", description = "ID of the quest")
    @get:JsonProperty("quest_id") val questId: kotlin.Int? = null,

    @Schema(example = "null", description = "Number representing the current tier the courier is at")
    @get:JsonProperty("current_tier") val currentTier: kotlin.Int? = null,

    @Schema(example = "null", description = "Number of orders delivered by the courier for this quest")
    @get:JsonProperty("orders_delivered") val ordersDelivered: kotlin.Int? = null
) {

}

